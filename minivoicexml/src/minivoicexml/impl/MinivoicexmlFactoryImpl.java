/**
 */
package minivoicexml.impl;

import minivoicexml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinivoicexmlFactoryImpl extends EFactoryImpl implements MinivoicexmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinivoicexmlFactory init() {
		try {
			MinivoicexmlFactory theMinivoicexmlFactory = (MinivoicexmlFactory)EPackage.Registry.INSTANCE.getEFactory(MinivoicexmlPackage.eNS_URI);
			if (theMinivoicexmlFactory != null) {
				return theMinivoicexmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MinivoicexmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinivoicexmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MinivoicexmlPackage.DOCUMENT: return createDocument();
			case MinivoicexmlPackage.FORM: return createForm();
			case MinivoicexmlPackage.FIELD: return createField();
			case MinivoicexmlPackage.BLOCK: return createBlock();
			case MinivoicexmlPackage.TRANSFER: return createTransfer();
			case MinivoicexmlPackage.MENU: return createMenu();
			case MinivoicexmlPackage.CHOICE: return createChoice();
			case MinivoicexmlPackage.PROMPT: return createPrompt();
			case MinivoicexmlPackage.GO_TO: return createGoTo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transfer createTransfer() {
		TransferImpl transfer = new TransferImpl();
		return transfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prompt createPrompt() {
		PromptImpl prompt = new PromptImpl();
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoTo createGoTo() {
		GoToImpl goTo = new GoToImpl();
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinivoicexmlPackage getMinivoicexmlPackage() {
		return (MinivoicexmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MinivoicexmlPackage getPackage() {
		return MinivoicexmlPackage.eINSTANCE;
	}

} //MinivoicexmlFactoryImpl
