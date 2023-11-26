/**
 */
package minivoicexml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prompt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.Prompt#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see minivoicexml.MinivoicexmlPackage#getPrompt()
 * @model
 * @generated
 */
public interface Prompt extends ExecutableContent {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see minivoicexml.MinivoicexmlPackage#getPrompt_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link minivoicexml.Prompt#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Prompt
