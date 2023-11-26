/**
 */
package minivoicexml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.GoTo#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see minivoicexml.MinivoicexmlPackage#getGoTo()
 * @model
 * @generated
 */
public interface GoTo extends ExecutableContent {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Dialog)
	 * @see minivoicexml.MinivoicexmlPackage#getGoTo_Next()
	 * @model
	 * @generated
	 */
	Dialog getNext();

	/**
	 * Sets the value of the '{@link minivoicexml.GoTo#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Dialog value);

} // GoTo
