/**
 */
package minivoicexml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.Document#getDialogs <em>Dialogs</em>}</li>
 * </ul>
 *
 * @see minivoicexml.MinivoicexmlPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Dialogs</b></em>' containment reference list.
	 * The list contents are of type {@link minivoicexml.Dialog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogs</em>' containment reference list.
	 * @see minivoicexml.MinivoicexmlPackage#getDocument_Dialogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dialog> getDialogs();

} // Document
