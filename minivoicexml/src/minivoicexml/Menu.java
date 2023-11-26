/**
 */
package minivoicexml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.Menu#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link minivoicexml.Menu#getChoices <em>Choices</em>}</li>
 * </ul>
 *
 * @see minivoicexml.MinivoicexmlPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends Dialog {
	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' containment reference.
	 * @see #setPrompt(Prompt)
	 * @see minivoicexml.MinivoicexmlPackage#getMenu_Prompt()
	 * @model containment="true"
	 * @generated
	 */
	Prompt getPrompt();

	/**
	 * Sets the value of the '{@link minivoicexml.Menu#getPrompt <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' containment reference.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(Prompt value);

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link minivoicexml.Choice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see minivoicexml.MinivoicexmlPackage#getMenu_Choices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choice> getChoices();

} // Menu
