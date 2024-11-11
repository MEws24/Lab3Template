/**
 */
package tuber.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tuber.Payment;
import tuber.PaymentType;
import tuber.Ride;
import tuber.TuberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuber.impl.PaymentImpl#getType <em>Type</em>}</li>
 *   <li>{@link tuber.impl.PaymentImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link tuber.impl.PaymentImpl#getRide <em>Ride</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentType TYPE_EDEFAULT = PaymentType.CREDITCARD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PaymentType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRide() <em>Ride</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRide()
	 * @generated
	 * @ordered
	 */
	protected Ride ride;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberPackage.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PaymentType newType) {
		PaymentType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.PAYMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(boolean newStatus) {
		boolean oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.PAYMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ride getRide() {
		if (ride != null && ride.eIsProxy()) {
			InternalEObject oldRide = (InternalEObject) ride;
			ride = (Ride) eResolveProxy(oldRide);
			if (ride != oldRide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TuberPackage.PAYMENT__RIDE, oldRide,
							ride));
			}
		}
		return ride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ride basicGetRide() {
		return ride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRide(Ride newRide) {
		Ride oldRide = ride;
		ride = newRide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.PAYMENT__RIDE, oldRide, ride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TuberPackage.PAYMENT__TYPE:
			return getType();
		case TuberPackage.PAYMENT__STATUS:
			return isStatus();
		case TuberPackage.PAYMENT__RIDE:
			if (resolve)
				return getRide();
			return basicGetRide();
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
		case TuberPackage.PAYMENT__TYPE:
			setType((PaymentType) newValue);
			return;
		case TuberPackage.PAYMENT__STATUS:
			setStatus((Boolean) newValue);
			return;
		case TuberPackage.PAYMENT__RIDE:
			setRide((Ride) newValue);
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
		case TuberPackage.PAYMENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TuberPackage.PAYMENT__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case TuberPackage.PAYMENT__RIDE:
			setRide((Ride) null);
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
		case TuberPackage.PAYMENT__TYPE:
			return type != TYPE_EDEFAULT;
		case TuberPackage.PAYMENT__STATUS:
			return status != STATUS_EDEFAULT;
		case TuberPackage.PAYMENT__RIDE:
			return ride != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
