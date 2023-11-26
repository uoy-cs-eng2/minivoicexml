/**
 */
package minivoicexml.impl;

import minivoicexml.Choice;
import minivoicexml.Dialog;
import minivoicexml.MinivoicexmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.impl.ChoiceImpl#getText <em>Text</em>}</li>
 *   <li>{@link minivoicexml.impl.ChoiceImpl#getDtmf <em>Dtmf</em>}</li>
 *   <li>{@link minivoicexml.impl.ChoiceImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoiceImpl extends MinimalEObjectImpl.Container implements Choice {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDtmf() <em>Dtmf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtmf()
	 * @generated
	 * @ordered
	 */
	protected static final String DTMF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtmf() <em>Dtmf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtmf()
	 * @generated
	 * @ordered
	 */
	protected String dtmf = DTMF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Dialog next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinivoicexmlPackage.Literals.CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinivoicexmlPackage.CHOICE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtmf() {
		return dtmf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtmf(String newDtmf) {
		String oldDtmf = dtmf;
		dtmf = newDtmf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinivoicexmlPackage.CHOICE__DTMF, oldDtmf, dtmf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialog getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Dialog)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinivoicexmlPackage.CHOICE__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialog basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Dialog newNext) {
		Dialog oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinivoicexmlPackage.CHOICE__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MinivoicexmlPackage.CHOICE__TEXT:
				return getText();
			case MinivoicexmlPackage.CHOICE__DTMF:
				return getDtmf();
			case MinivoicexmlPackage.CHOICE__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MinivoicexmlPackage.CHOICE__TEXT:
				setText((String)newValue);
				return;
			case MinivoicexmlPackage.CHOICE__DTMF:
				setDtmf((String)newValue);
				return;
			case MinivoicexmlPackage.CHOICE__NEXT:
				setNext((Dialog)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MinivoicexmlPackage.CHOICE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case MinivoicexmlPackage.CHOICE__DTMF:
				setDtmf(DTMF_EDEFAULT);
				return;
			case MinivoicexmlPackage.CHOICE__NEXT:
				setNext((Dialog)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MinivoicexmlPackage.CHOICE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case MinivoicexmlPackage.CHOICE__DTMF:
				return DTMF_EDEFAULT == null ? dtmf != null : !DTMF_EDEFAULT.equals(dtmf);
			case MinivoicexmlPackage.CHOICE__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", dtmf: ");
		result.append(dtmf);
		result.append(')');
		return result.toString();
	}

} //ChoiceImpl
