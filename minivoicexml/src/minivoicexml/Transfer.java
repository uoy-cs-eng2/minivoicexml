/**
 */
package minivoicexml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.Transfer#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @see minivoicexml.MinivoicexmlPackage#getTransfer()
 * @model
 * @generated
 */
public interface Transfer extends FormItem {
	/**
	 * Returns the value of the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' attribute.
	 * @see #setDest(String)
	 * @see minivoicexml.MinivoicexmlPackage#getTransfer_Dest()
	 * @model
	 * @generated
	 */
	String getDest();

	/**
	 * Sets the value of the '{@link minivoicexml.Transfer#getDest <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' attribute.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(String value);

} // Transfer
