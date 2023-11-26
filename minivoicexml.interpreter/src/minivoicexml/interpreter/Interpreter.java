package minivoicexml.interpreter;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import minivoicexml.Block;
import minivoicexml.Choice;
import minivoicexml.Dialog;
import minivoicexml.Document;
import minivoicexml.ExecutableContent;
import minivoicexml.Field;
import minivoicexml.FormItem;
import minivoicexml.GoTo;
import minivoicexml.Menu;
import minivoicexml.Prompt;
import minivoicexml.Transfer;
import minivoicexml.util.MinivoicexmlSwitch;

/**
 * <p>
 * Interprets a MiniVoiceXML document, using a heavily simplified version of the
 * FIA in the VoiceXML spec.
 * </p>
 * 
 * @see https://www.w3.org/TR/voicexml20/#dmlAFIA
 */
public class Interpreter {

	private class FormItemInterpreter extends ExecutableContentInterpreter {
		private final Scanner sc;

		private FormItemInterpreter(Scanner sc) {
			this.sc = sc;
		}

		@Override
		public Boolean caseField(Field object) {
			if (object.getPrompt() != null) {
				casePrompt(object.getPrompt());
			}

			String line = sc.nextLine();
			System.out.println(String.format("Read '%s' into '%s'", line, object.getName()));
			return true;
		}

		@Override
		public Boolean caseBlock(Block object) {
			var childProcessor = new ExecutableContentInterpreter();
			for (ExecutableContent child : object.getContent()) {
				childProcessor.doSwitch(child);
			}
			return true;
		}

		@Override
		public Boolean caseTransfer(Transfer object) {
			System.out.println(String.format("Transferring to '%s'", object.getDest()));
			return true;
		}

		@Override
		public Boolean caseMenu(Menu object) {
			while (true) {
				if (object.getPrompt() != null) {
					casePrompt(object.getPrompt());
				}

				System.out.println("Available options:");
				for (Choice c : object.getChoices()) {
					System.out.println(String.format("%s. %s", c.getDtmf(), c.getText()));
				}
				System.out.print("Type the number of an option and press Enter: ");

				String line = sc.nextLine();
				if (line == null) break;
				for (Choice c : object.getChoices()) {
					if (line.equals(c.getDtmf())) {
						System.out.println(String.format("You chose '%s': going to '#%s'", c.getText(), c.getNext().getId()));
						current = c.getNext();
						return null;
					}
				}

				System.out.println(String.format("Option '%s' not recognised.", line));
			}

			return true;
		}
	}

	private class ExecutableContentInterpreter extends MinivoicexmlSwitch<Boolean> {
		@Override
		public Boolean casePrompt(Prompt object) {
			System.out.println(object.getText());
			return true;
		}

		@Override
		public Boolean caseGoTo(GoTo object) {
			current = object.getNext();
			System.out.println(String.format("Going to '#%s'", object.getNext().getId()));
			return true;
		}
	}

	private final Document document;
	private final Set<EObject> executed = new HashSet<>();
	private Dialog current;

	public Interpreter(Document document) {
		this.document = document;
	}

	public void run(Scanner sc) {
		if (document.getDialogs().isEmpty()) {
			System.err.println("No dialogs to run in the document");
			return;
		}
		current = document.getDialogs().get(0);
		
		while (true) {
			// Select phase
			EObject nextItem = findNextUnexecutedFormItem();
			if (nextItem == null) {
				// All form items were run: exit
				System.out.println("Nothing else to run: exit");
				break;
			}

			// Collect phase
			var processor = new FormItemInterpreter(sc);
			processor.doSwitch(nextItem);
			executed.add(nextItem);
		}
	}

	/**
	 * Finds the next unexecuted form item in document order.
	 */
	private EObject findNextUnexecutedFormItem() {
		if (current instanceof Menu) {
			/*
			 * Appendix C of VoiceXML 2.0 says:
			 * 
			 * "A menu can be viewed as a form containing a single field whose grammar and
			 *  whose <filled> action are constructed from the <choice> elements."
			 */
			return current;
		}
		
		for (TreeIterator<EObject> it = EcoreUtil.getAllContents(current, true); it.hasNext(); ) {
			EObject eob = it.next();
			if (eob instanceof FormItem && !executed.contains(eob)) {
				return eob;
			}
		}

		return null;
	}

}
