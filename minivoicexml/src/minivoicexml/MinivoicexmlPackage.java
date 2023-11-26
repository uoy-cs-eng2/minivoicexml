/**
 */
package minivoicexml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see minivoicexml.MinivoicexmlFactory
 * @model kind="package"
 * @generated
 */
public interface MinivoicexmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minivoicexml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "minivoicexml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinivoicexmlPackage eINSTANCE = minivoicexml.impl.MinivoicexmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link minivoicexml.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.DocumentImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Dialogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DIALOGS = 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.DialogImpl <em>Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.DialogImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getDialog()
	 * @generated
	 */
	int DIALOG = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__ID = 0;

	/**
	 * The number of structural features of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.FormImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ID = DIALOG__ID;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ITEMS = DIALOG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = DIALOG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = DIALOG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.FormItemImpl <em>Form Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.FormItemImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getFormItem()
	 * @generated
	 */
	int FORM_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Form Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Form Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.FieldImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = FORM_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PROMPT = FORM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = FORM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = FORM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.BlockImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = FORM_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTENT = FORM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = FORM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = FORM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.TransferImpl <em>Transfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.TransferImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getTransfer()
	 * @generated
	 */
	int TRANSFER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER__NAME = FORM_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER__DEST = FORM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_FEATURE_COUNT = FORM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_COUNT = FORM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.MenuImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ID = DIALOG__ID;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__PROMPT = DIALOG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CHOICES = DIALOG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = DIALOG_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = DIALOG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.ChoiceImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Dtmf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DTMF = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NEXT = 2;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.ExecutableContentImpl <em>Executable Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.ExecutableContentImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getExecutableContent()
	 * @generated
	 */
	int EXECUTABLE_CONTENT = 9;

	/**
	 * The number of structural features of the '<em>Executable Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Executable Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.PromptImpl <em>Prompt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.PromptImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getPrompt()
	 * @generated
	 */
	int PROMPT = 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT__TEXT = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prompt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Prompt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMPT_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link minivoicexml.impl.GoToImpl <em>Go To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minivoicexml.impl.GoToImpl
	 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getGoTo()
	 * @generated
	 */
	int GO_TO = 11;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__NEXT = EXECUTABLE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_FEATURE_COUNT = EXECUTABLE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_OPERATION_COUNT = EXECUTABLE_CONTENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link minivoicexml.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see minivoicexml.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link minivoicexml.Document#getDialogs <em>Dialogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dialogs</em>'.
	 * @see minivoicexml.Document#getDialogs()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Dialogs();

	/**
	 * Returns the meta object for class '{@link minivoicexml.Dialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog</em>'.
	 * @see minivoicexml.Dialog
	 * @generated
	 */
	EClass getDialog();

	/**
	 * Returns the meta object for the attribute '{@link minivoicexml.Dialog#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see minivoicexml.Dialog#getId()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Id();

	/**
	 * Returns the meta object for class '{@link minivoicexml.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see minivoicexml.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link minivoicexml.Form#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see minivoicexml.Form#getItems()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Items();

	/**
	 * Returns the meta object for class '{@link minivoicexml.FormItem <em>Form Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Item</em>'.
	 * @see minivoicexml.FormItem
	 * @generated
	 */
	EClass getFormItem();

	/**
	 * Returns the meta object for the attribute '{@link minivoicexml.FormItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see minivoicexml.FormItem#getName()
	 * @see #getFormItem()
	 * @generated
	 */
	EAttribute getFormItem_Name();

	/**
	 * Returns the meta object for class '{@link minivoicexml.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see minivoicexml.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference '{@link minivoicexml.Field#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prompt</em>'.
	 * @see minivoicexml.Field#getPrompt()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Prompt();

	/**
	 * Returns the meta object for class '{@link minivoicexml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see minivoicexml.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link minivoicexml.Block#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see minivoicexml.Block#getContent()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Content();

	/**
	 * Returns the meta object for class '{@link minivoicexml.Transfer <em>Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer</em>'.
	 * @see minivoicexml.Transfer
	 * @generated
	 */
	EClass getTransfer();

	/**
	 * Returns the meta object for the attribute '{@link minivoicexml.Transfer#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see minivoicexml.Transfer#getDest()
	 * @see #getTransfer()
	 * @generated
	 */
	EAttribute getTransfer_Dest();

	/**
	 * Returns the meta object for class '{@link minivoicexml.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see minivoicexml.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference '{@link minivoicexml.Menu#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prompt</em>'.
	 * @see minivoicexml.Menu#getPrompt()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Prompt();

	/**
	 * Returns the meta object for the containment reference list '{@link minivoicexml.Menu#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see minivoicexml.Menu#getChoices()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Choices();

	/**
	 * Returns the meta object for class '{@link minivoicexml.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see minivoicexml.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link minivoicexml.Choice#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see minivoicexml.Choice#getText()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Text();

	/**
	 * Returns the meta object for the attribute '{@link minivoicexml.Choice#getDtmf <em>Dtmf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtmf</em>'.
	 * @see minivoicexml.Choice#getDtmf()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Dtmf();

	/**
	 * Returns the meta object for the reference '{@link minivoicexml.Choice#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see minivoicexml.Choice#getNext()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Next();

	/**
	 * Returns the meta object for class '{@link minivoicexml.ExecutableContent <em>Executable Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Content</em>'.
	 * @see minivoicexml.ExecutableContent
	 * @generated
	 */
	EClass getExecutableContent();

	/**
	 * Returns the meta object for class '{@link minivoicexml.Prompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prompt</em>'.
	 * @see minivoicexml.Prompt
	 * @generated
	 */
	EClass getPrompt();

	/**
	 * Returns the meta object for the attribute '{@link minivoicexml.Prompt#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see minivoicexml.Prompt#getText()
	 * @see #getPrompt()
	 * @generated
	 */
	EAttribute getPrompt_Text();

	/**
	 * Returns the meta object for class '{@link minivoicexml.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To</em>'.
	 * @see minivoicexml.GoTo
	 * @generated
	 */
	EClass getGoTo();

	/**
	 * Returns the meta object for the reference '{@link minivoicexml.GoTo#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see minivoicexml.GoTo#getNext()
	 * @see #getGoTo()
	 * @generated
	 */
	EReference getGoTo_Next();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MinivoicexmlFactory getMinivoicexmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link minivoicexml.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.DocumentImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Dialogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__DIALOGS = eINSTANCE.getDocument_Dialogs();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.DialogImpl <em>Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.DialogImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getDialog()
		 * @generated
		 */
		EClass DIALOG = eINSTANCE.getDialog();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__ID = eINSTANCE.getDialog_Id();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.FormImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ITEMS = eINSTANCE.getForm_Items();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.FormItemImpl <em>Form Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.FormItemImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getFormItem()
		 * @generated
		 */
		EClass FORM_ITEM = eINSTANCE.getFormItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_ITEM__NAME = eINSTANCE.getFormItem_Name();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.FieldImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__PROMPT = eINSTANCE.getField_Prompt();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.BlockImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__CONTENT = eINSTANCE.getBlock_Content();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.TransferImpl <em>Transfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.TransferImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getTransfer()
		 * @generated
		 */
		EClass TRANSFER = eINSTANCE.getTransfer();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER__DEST = eINSTANCE.getTransfer_Dest();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.MenuImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__PROMPT = eINSTANCE.getMenu_Prompt();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__CHOICES = eINSTANCE.getMenu_Choices();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.ChoiceImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__TEXT = eINSTANCE.getChoice_Text();

		/**
		 * The meta object literal for the '<em><b>Dtmf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__DTMF = eINSTANCE.getChoice_Dtmf();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__NEXT = eINSTANCE.getChoice_Next();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.ExecutableContentImpl <em>Executable Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.ExecutableContentImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getExecutableContent()
		 * @generated
		 */
		EClass EXECUTABLE_CONTENT = eINSTANCE.getExecutableContent();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.PromptImpl <em>Prompt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.PromptImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getPrompt()
		 * @generated
		 */
		EClass PROMPT = eINSTANCE.getPrompt();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMPT__TEXT = eINSTANCE.getPrompt_Text();

		/**
		 * The meta object literal for the '{@link minivoicexml.impl.GoToImpl <em>Go To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minivoicexml.impl.GoToImpl
		 * @see minivoicexml.impl.MinivoicexmlPackageImpl#getGoTo()
		 * @generated
		 */
		EClass GO_TO = eINSTANCE.getGoTo();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_TO__NEXT = eINSTANCE.getGoTo_Next();

	}

} //MinivoicexmlPackage
