/**
 */
package minivoicexml.impl;

import java.util.Collection;

import minivoicexml.Choice;
import minivoicexml.Menu;
import minivoicexml.MinivoicexmlPackage;
import minivoicexml.Prompt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minivoicexml.impl.MenuImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link minivoicexml.impl.MenuImpl#getChoices <em>Choices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuImpl extends DialogImpl implements Menu {
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
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> choices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinivoicexmlPackage.Literals.MENU;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinivoicexmlPackage.MENU__PROMPT, oldPrompt, newPrompt);
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
				msgs = ((InternalEObject)prompt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinivoicexmlPackage.MENU__PROMPT, null, msgs);
			if (newPrompt != null)
				msgs = ((InternalEObject)newPrompt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinivoicexmlPackage.MENU__PROMPT, null, msgs);
			msgs = basicSetPrompt(newPrompt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinivoicexmlPackage.MENU__PROMPT, newPrompt, newPrompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoices() {
		if (choices == null) {
			choices = new EObjectContainmentEList<Choice>(Choice.class, this, MinivoicexmlPackage.MENU__CHOICES);
		}
		return choices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinivoicexmlPackage.MENU__PROMPT:
				return basicSetPrompt(null, msgs);
			case MinivoicexmlPackage.MENU__CHOICES:
				return ((InternalEList<?>)getChoices()).basicRemove(otherEnd, msgs);
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
			case MinivoicexmlPackage.MENU__PROMPT:
				return getPrompt();
			case MinivoicexmlPackage.MENU__CHOICES:
				return getChoices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MinivoicexmlPackage.MENU__PROMPT:
				setPrompt((Prompt)newValue);
				return;
			case MinivoicexmlPackage.MENU__CHOICES:
				getChoices().clear();
				getChoices().addAll((Collection<? extends Choice>)newValue);
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
			case MinivoicexmlPackage.MENU__PROMPT:
				setPrompt((Prompt)null);
				return;
			case MinivoicexmlPackage.MENU__CHOICES:
				getChoices().clear();
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
			case MinivoicexmlPackage.MENU__PROMPT:
				return prompt != null;
			case MinivoicexmlPackage.MENU__CHOICES:
				return choices != null && !choices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MenuImpl
