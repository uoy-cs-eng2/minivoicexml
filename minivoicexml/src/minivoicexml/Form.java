/**
 */
package minivoicexml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.Form#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see minivoicexml.MinivoicexmlPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Dialog {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link minivoicexml.FormItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see minivoicexml.MinivoicexmlPackage#getForm_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormItem> getItems();

} // Form
