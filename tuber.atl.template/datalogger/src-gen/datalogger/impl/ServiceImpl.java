/**
 */
package datalogger.impl;

import datalogger.DataloggerPackage;
import datalogger.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datalogger.impl.ServiceImpl#isSharable <em>Sharable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends SellableImpl implements Service {
	/**
	 * The default value of the '{@link #isSharable() <em>Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHARABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSharable() <em>Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharable()
	 * @generated
	 * @ordered
	 */
	protected boolean sharable = SHARABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataloggerPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSharable() {
		return sharable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharable(boolean newSharable) {
		boolean oldSharable = sharable;
		sharable = newSharable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataloggerPackage.SERVICE__SHARABLE, oldSharable,
					sharable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DataloggerPackage.SERVICE__SHARABLE:
			return isSharable();
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
		case DataloggerPackage.SERVICE__SHARABLE:
			setSharable((Boolean) newValue);
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
		case DataloggerPackage.SERVICE__SHARABLE:
			setSharable(SHARABLE_EDEFAULT);
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
		case DataloggerPackage.SERVICE__SHARABLE:
			return sharable != SHARABLE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sharable: ");
		result.append(sharable);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
