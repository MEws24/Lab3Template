/**
 */
package tuber.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tuber.Agent;
import tuber.City;
import tuber.Driver;
import tuber.Ride;
import tuber.Rider;
import tuber.TuberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuber.impl.AgentImpl#getRides <em>Rides</em>}</li>
 *   <li>{@link tuber.impl.AgentImpl#getHires <em>Hires</em>}</li>
 *   <li>{@link tuber.impl.AgentImpl#getEnrolls <em>Enrolls</em>}</li>
 *   <li>{@link tuber.impl.AgentImpl#getCity <em>City</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends NamedElementImpl implements Agent {
	/**
	 * The cached value of the '{@link #getRides() <em>Rides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRides()
	 * @generated
	 * @ordered
	 */
	protected EList<Ride> rides;

	/**
	 * The cached value of the '{@link #getHires() <em>Hires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHires()
	 * @generated
	 * @ordered
	 */
	protected EList<Driver> hires;

	/**
	 * The cached value of the '{@link #getEnrolls() <em>Enrolls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolls()
	 * @generated
	 * @ordered
	 */
	protected EList<Rider> enrolls;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final City CITY_EDEFAULT = City.WIEN;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected City city = CITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ride> getRides() {
		if (rides == null) {
			rides = new EObjectContainmentEList<Ride>(Ride.class, this, TuberPackage.AGENT__RIDES);
		}
		return rides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Driver> getHires() {
		if (hires == null) {
			hires = new EObjectContainmentEList<Driver>(Driver.class, this, TuberPackage.AGENT__HIRES);
		}
		return hires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rider> getEnrolls() {
		if (enrolls == null) {
			enrolls = new EObjectContainmentEList<Rider>(Rider.class, this, TuberPackage.AGENT__ENROLLS);
		}
		return enrolls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public City getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(City newCity) {
		City oldCity = city;
		city = newCity == null ? CITY_EDEFAULT : newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.AGENT__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TuberPackage.AGENT__RIDES:
			return ((InternalEList<?>) getRides()).basicRemove(otherEnd, msgs);
		case TuberPackage.AGENT__HIRES:
			return ((InternalEList<?>) getHires()).basicRemove(otherEnd, msgs);
		case TuberPackage.AGENT__ENROLLS:
			return ((InternalEList<?>) getEnrolls()).basicRemove(otherEnd, msgs);
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
		case TuberPackage.AGENT__RIDES:
			return getRides();
		case TuberPackage.AGENT__HIRES:
			return getHires();
		case TuberPackage.AGENT__ENROLLS:
			return getEnrolls();
		case TuberPackage.AGENT__CITY:
			return getCity();
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
		case TuberPackage.AGENT__RIDES:
			getRides().clear();
			getRides().addAll((Collection<? extends Ride>) newValue);
			return;
		case TuberPackage.AGENT__HIRES:
			getHires().clear();
			getHires().addAll((Collection<? extends Driver>) newValue);
			return;
		case TuberPackage.AGENT__ENROLLS:
			getEnrolls().clear();
			getEnrolls().addAll((Collection<? extends Rider>) newValue);
			return;
		case TuberPackage.AGENT__CITY:
			setCity((City) newValue);
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
		case TuberPackage.AGENT__RIDES:
			getRides().clear();
			return;
		case TuberPackage.AGENT__HIRES:
			getHires().clear();
			return;
		case TuberPackage.AGENT__ENROLLS:
			getEnrolls().clear();
			return;
		case TuberPackage.AGENT__CITY:
			setCity(CITY_EDEFAULT);
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
		case TuberPackage.AGENT__RIDES:
			return rides != null && !rides.isEmpty();
		case TuberPackage.AGENT__HIRES:
			return hires != null && !hires.isEmpty();
		case TuberPackage.AGENT__ENROLLS:
			return enrolls != null && !enrolls.isEmpty();
		case TuberPackage.AGENT__CITY:
			return city != CITY_EDEFAULT;
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
		result.append(" (city: ");
		result.append(city);
		result.append(')');
		return result.toString();
	}

} //AgentImpl
