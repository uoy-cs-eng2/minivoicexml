/**
 */
package minivoicexml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.Choice#getText <em>Text</em>}</li>
 *   <li>{@link minivoicexml.Choice#getDtmf <em>Dtmf</em>}</li>
 *   <li>{@link minivoicexml.Choice#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see minivoicexml.MinivoicexmlPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see minivoicexml.MinivoicexmlPackage#getChoice_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link minivoicexml.Choice#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Dtmf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtmf</em>' attribute.
	 * @see #setDtmf(String)
	 * @see minivoicexml.MinivoicexmlPackage#getChoice_Dtmf()
	 * @model
	 * @generated
	 */
	String getDtmf();

	/**
	 * Sets the value of the '{@link minivoicexml.Choice#getDtmf <em>Dtmf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtmf</em>' attribute.
	 * @see #getDtmf()
	 * @generated
	 */
	void setDtmf(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Dialog)
	 * @see minivoicexml.MinivoicexmlPackage#getChoice_Next()
	 * @model
	 * @generated
	 */
	Dialog getNext();

	/**
	 * Sets the value of the '{@link minivoicexml.Choice#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Dialog value);

} // Choice
