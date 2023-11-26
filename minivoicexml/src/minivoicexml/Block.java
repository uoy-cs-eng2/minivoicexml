/**
 */
package minivoicexml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.Block#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see minivoicexml.MinivoicexmlPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends FormItem {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link minivoicexml.ExecutableContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see minivoicexml.MinivoicexmlPackage#getBlock_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutableContent> getContent();

} // Block
