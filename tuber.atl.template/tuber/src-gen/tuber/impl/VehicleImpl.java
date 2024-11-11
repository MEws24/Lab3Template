/**
 */
package tuber.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tuber.TuberPackage;
import tuber.Vehicle;
import tuber.VehicleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuber.impl.VehicleImpl#getType <em>Type</em>}</li>
 *   <li>{@link tuber.impl.VehicleImpl#isSharing <em>Sharing</em>}</li>
 *   <li>{@link tuber.impl.VehicleImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends NamedElementImpl implements Vehicle {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VehicleType TYPE_EDEFAULT = VehicleType.CAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VehicleType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSharing() <em>Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHARING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSharing() <em>Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharing()
	 * @generated
	 * @ordered
	 */
	protected boolean sharing = SHARING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberPackage.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(VehicleType newType) {
		VehicleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.VEHICLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSharing() {
		return sharing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharing(boolean newSharing) {
		boolean oldSharing = sharing;
		sharing = newSharing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.VEHICLE__SHARING, oldSharing, sharing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.VEHICLE__CAPACITY, oldCapacity,
					capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TuberPackage.VEHICLE__TYPE:
			return getType();
		case TuberPackage.VEHICLE__SHARING:
			return isSharing();
		case TuberPackage.VEHICLE__CAPACITY:
			return getCapacity();
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
		case TuberPackage.VEHICLE__TYPE:
			setType((VehicleType) newValue);
			return;
		case TuberPackage.VEHICLE__SHARING:
			setSharing((Boolean) newValue);
			return;
		case TuberPackage.VEHICLE__CAPACITY:
			setCapacity((Integer) newValue);
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
		case TuberPackage.VEHICLE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TuberPackage.VEHICLE__SHARING:
			setSharing(SHARING_EDEFAULT);
			return;
		case TuberPackage.VEHICLE__CAPACITY:
			setCapacity(CAPACITY_EDEFAULT);
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
		case TuberPackage.VEHICLE__TYPE:
			return type != TYPE_EDEFAULT;
		case TuberPackage.VEHICLE__SHARING:
			return sharing != SHARING_EDEFAULT;
		case TuberPackage.VEHICLE__CAPACITY:
			return capacity != CAPACITY_EDEFAULT;
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
		result.append(", sharing: ");
		result.append(sharing);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
