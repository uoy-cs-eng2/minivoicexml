/**
 */
package minivoicexml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.Field#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @see minivoicexml.MinivoicexmlPackage#getField()
 * @model
 * @generated
 */
public interface Field extends FormItem {
	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' containment reference.
	 * @see #setPrompt(Prompt)
	 * @see minivoicexml.MinivoicexmlPackage#getField_Prompt()
	 * @model containment="true"
	 * @generated
	 */
	Prompt getPrompt();

	/**
	 * Sets the value of the '{@link minivoicexml.Field#getPrompt <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' containment reference.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(Prompt value);

} // Field
