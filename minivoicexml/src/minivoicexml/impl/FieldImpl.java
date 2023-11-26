/**
 */
package minivoicexml.impl;

import minivoicexml.Field;
import minivoicexml.MinivoicexmlPackage;
import minivoicexml.Prompt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.impl.FieldImpl#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends FormItemImpl implements Field {
	/**
	 * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected Prompt prompt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinivoicexmlPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prompt getPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrompt(Prompt newPrompt, NotificationChain msgs) {
		Prompt oldPrompt = prompt;
		prompt = newPrompt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinivoicexmlPackage.FIELD__PROMPT, oldPrompt, newPrompt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrompt(Prompt newPrompt) {
		if (newPrompt != prompt) {
			NotificationChain msgs = null;
			if (prompt != null)
				msgs = ((InternalEObject)prompt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinivoicexmlPackage.FIELD__PROMPT, null, msgs);
			if (newPrompt != null)
				msgs = ((InternalEObject)newPrompt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinivoicexmlPackage.FIELD__PROMPT, null, msgs);
			msgs = basicSetPrompt(newPrompt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinivoicexmlPackage.FIELD__PROMPT, newPrompt, newPrompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinivoicexmlPackage.FIELD__PROMPT:
				return basicSetPrompt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MinivoicexmlPackage.FIELD__PROMPT:
				return getPrompt();
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
			case MinivoicexmlPackage.FIELD__PROMPT:
				setPrompt((Prompt)newValue);
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
			case MinivoicexmlPackage.FIELD__PROMPT:
				setPrompt((Prompt)null);
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
			case MinivoicexmlPackage.FIELD__PROMPT:
				return prompt != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldImpl
