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

import tuber.AppUser;
import tuber.HelpCentreCall;
import tuber.Location;
import tuber.RideStatus;
import tuber.TuberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuber.impl.AppUserImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link tuber.impl.AppUserImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link tuber.impl.AppUserImpl#getSupportCall <em>Support Call</em>}</li>
 *   <li>{@link tuber.impl.AppUserImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AppUserImpl extends NamedElementImpl implements AppUser {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected static final float RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected float rating = RATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportCall() <em>Support Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportCall()
	 * @generated
	 * @ordered
	 */
	protected EList<HelpCentreCall> supportCall;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RideStatus STATUS_EDEFAULT = RideStatus.IDLE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RideStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberPackage.Literals.APP_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TuberPackage.APP_USER__LOCATION, oldLocation, newLocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TuberPackage.APP_USER__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TuberPackage.APP_USER__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.APP_USER__LOCATION, newLocation,
					newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRating(float newRating) {
		float oldRating = rating;
		rating = newRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.APP_USER__RATING, oldRating, rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HelpCentreCall> getSupportCall() {
		if (supportCall == null) {
			supportCall = new EObjectContainmentEList<HelpCentreCall>(HelpCentreCall.class, this,
					TuberPackage.APP_USER__SUPPORT_CALL);
		}
		return supportCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RideStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(RideStatus newStatus) {
		RideStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.APP_USER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TuberPackage.APP_USER__LOCATION:
			return basicSetLocation(null, msgs);
		case TuberPackage.APP_USER__SUPPORT_CALL:
			return ((InternalEList<?>) getSupportCall()).basicRemove(otherEnd, msgs);
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
		case TuberPackage.APP_USER__LOCATION:
			return getLocation();
		case TuberPackage.APP_USER__RATING:
			return getRating();
		case TuberPackage.APP_USER__SUPPORT_CALL:
			return getSupportCall();
		case TuberPackage.APP_USER__STATUS:
			return getStatus();
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
		case TuberPackage.APP_USER__LOCATION:
			setLocation((Location) newValue);
			return;
		case TuberPackage.APP_USER__RATING:
			setRating((Float) newValue);
			return;
		case TuberPackage.APP_USER__SUPPORT_CALL:
			getSupportCall().clear();
			getSupportCall().addAll((Collection<? extends HelpCentreCall>) newValue);
			return;
		case TuberPackage.APP_USER__STATUS:
			setStatus((RideStatus) newValue);
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
		case TuberPackage.APP_USER__LOCATION:
			setLocation((Location) null);
			return;
		case TuberPackage.APP_USER__RATING:
			setRating(RATING_EDEFAULT);
			return;
		case TuberPackage.APP_USER__SUPPORT_CALL:
			getSupportCall().clear();
			return;
		case TuberPackage.APP_USER__STATUS:
			setStatus(STATUS_EDEFAULT);
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
		case TuberPackage.APP_USER__LOCATION:
			return location != null;
		case TuberPackage.APP_USER__RATING:
			return rating != RATING_EDEFAULT;
		case TuberPackage.APP_USER__SUPPORT_CALL:
			return supportCall != null && !supportCall.isEmpty();
		case TuberPackage.APP_USER__STATUS:
			return status != STATUS_EDEFAULT;
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
		result.append(" (rating: ");
		result.append(rating);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //AppUserImpl
