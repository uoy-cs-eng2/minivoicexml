package minivoicexml.interpreter;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import minivoicexml.Document;
import minivoicexml.MinivoicexmlPackage;

public class Launcher {

	static {
		// Set up the EMF XMI parser and MiniVoiceXML EPackage
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(MinivoicexmlPackage.eNS_URI, MinivoicexmlPackage.eINSTANCE);
	}
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("You must specify the path to the MiniVoiceXML model file.");
			System.exit(1);
		}

		try {
			final String modelPath = args[0];
			new Launcher().run(new File(modelPath), new Scanner(System.in));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run(File file, Scanner sc) throws IOException {
		run(URI.createFileURI(file.getCanonicalPath()), sc);
	}

	public void run(URI uri, Scanner sc) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(uri);
		r.load(null);

		List<Document> documents = r.getContents().stream()
			.map(e -> e instanceof Document ? (Document) e : null)
			.filter(e -> e != null)
			.collect(Collectors.toList());

		if (documents.size() != 1) {
			throw new IllegalArgumentException(String.format(
				"Expected to find 1 MiniVoiceXML Document, but found %d in '%s'", documents.size(), r.getURI()));
		}

		new Interpreter(documents.get(0)).run(sc);
	}

}
