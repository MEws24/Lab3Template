/**
 */
package datalogger.impl;

import datalogger.DataloggerPackage;
import datalogger.Sellable;
import datalogger.Seller;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Seller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datalogger.impl.SellerImpl#getOwns <em>Owns</em>}</li>
 *   <li>{@link datalogger.impl.SellerImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link datalogger.impl.SellerImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SellerImpl extends NamedElementImpl implements Seller {
	/**
	 * The cached value of the '{@link #getOwns() <em>Owns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwns()
	 * @generated
	 * @ordered
	 */
	protected EList<Sellable> owns;

	/**
	 * The default value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected static final float REVENUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected float revenue = REVENUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SellerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataloggerPackage.Literals.SELLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sellable> getOwns() {
		if (owns == null) {
			owns = new EObjectContainmentEList<Sellable>(Sellable.class, this, DataloggerPackage.SELLER__OWNS);
		}
		return owns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevenue(float newRevenue) {
		float oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataloggerPackage.SELLER__REVENUE, oldRevenue,
					revenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataloggerPackage.SELLER__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DataloggerPackage.SELLER__OWNS:
			return ((InternalEList<?>) getOwns()).basicRemove(otherEnd, msgs);
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
		case DataloggerPackage.SELLER__OWNS:
			return getOwns();
		case DataloggerPackage.SELLER__REVENUE:
			return getRevenue();
		case DataloggerPackage.SELLER__LOCATION:
			return getLocation();
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
		case DataloggerPackage.SELLER__OWNS:
			getOwns().clear();
			getOwns().addAll((Collection<? extends Sellable>) newValue);
			return;
		case DataloggerPackage.SELLER__REVENUE:
			setRevenue((Float) newValue);
			return;
		case DataloggerPackage.SELLER__LOCATION:
			setLocation((String) newValue);
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
		case DataloggerPackage.SELLER__OWNS:
			getOwns().clear();
			return;
		case DataloggerPackage.SELLER__REVENUE:
			setRevenue(REVENUE_EDEFAULT);
			return;
		case DataloggerPackage.SELLER__LOCATION:
			setLocation(LOCATION_EDEFAULT);
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
		case DataloggerPackage.SELLER__OWNS:
			return owns != null && !owns.isEmpty();
		case DataloggerPackage.SELLER__REVENUE:
			return revenue != REVENUE_EDEFAULT;
		case DataloggerPackage.SELLER__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
		result.append(" (revenue: ");
		result.append(revenue);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //SellerImpl
