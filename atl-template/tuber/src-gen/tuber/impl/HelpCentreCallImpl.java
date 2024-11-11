/**
 */
package tuber.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tuber.HelpCentreCall;
import tuber.IssueType;
import tuber.Ride;
import tuber.TicketStatus;
import tuber.TuberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Help Centre Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuber.impl.HelpCentreCallImpl#getRide <em>Ride</em>}</li>
 *   <li>{@link tuber.impl.HelpCentreCallImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link tuber.impl.HelpCentreCallImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link tuber.impl.HelpCentreCallImpl#getDate <em>Date</em>}</li>
 *   <li>{@link tuber.impl.HelpCentreCallImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link tuber.impl.HelpCentreCallImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelpCentreCallImpl extends MinimalEObjectImpl.Container implements HelpCentreCall {
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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected String issue = ISSUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final TicketStatus STATUS_EDEFAULT = TicketStatus.RESOLVED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected TicketStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IssueType TYPE_EDEFAULT = IssueType.PAYMENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IssueType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelpCentreCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberPackage.Literals.HELP_CENTRE_CALL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TuberPackage.HELP_CENTRE_CALL__RIDE,
							oldRide, ride));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.HELP_CENTRE_CALL__RIDE, oldRide, ride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(float newDuration) {
		float oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.HELP_CENTRE_CALL__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue(String newIssue) {
		String oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.HELP_CENTRE_CALL__ISSUE, oldIssue,
					issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.HELP_CENTRE_CALL__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TicketStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(TicketStatus newStatus) {
		TicketStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.HELP_CENTRE_CALL__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(IssueType newType) {
		IssueType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.HELP_CENTRE_CALL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TuberPackage.HELP_CENTRE_CALL__RIDE:
			if (resolve)
				return getRide();
			return basicGetRide();
		case TuberPackage.HELP_CENTRE_CALL__DURATION:
			return getDuration();
		case TuberPackage.HELP_CENTRE_CALL__ISSUE:
			return getIssue();
		case TuberPackage.HELP_CENTRE_CALL__DATE:
			return getDate();
		case TuberPackage.HELP_CENTRE_CALL__STATUS:
			return getStatus();
		case TuberPackage.HELP_CENTRE_CALL__TYPE:
			return getType();
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
		case TuberPackage.HELP_CENTRE_CALL__RIDE:
			setRide((Ride) newValue);
			return;
		case TuberPackage.HELP_CENTRE_CALL__DURATION:
			setDuration((Float) newValue);
			return;
		case TuberPackage.HELP_CENTRE_CALL__ISSUE:
			setIssue((String) newValue);
			return;
		case TuberPackage.HELP_CENTRE_CALL__DATE:
			setDate((String) newValue);
			return;
		case TuberPackage.HELP_CENTRE_CALL__STATUS:
			setStatus((TicketStatus) newValue);
			return;
		case TuberPackage.HELP_CENTRE_CALL__TYPE:
			setType((IssueType) newValue);
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
		case TuberPackage.HELP_CENTRE_CALL__RIDE:
			setRide((Ride) null);
			return;
		case TuberPackage.HELP_CENTRE_CALL__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case TuberPackage.HELP_CENTRE_CALL__ISSUE:
			setIssue(ISSUE_EDEFAULT);
			return;
		case TuberPackage.HELP_CENTRE_CALL__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case TuberPackage.HELP_CENTRE_CALL__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case TuberPackage.HELP_CENTRE_CALL__TYPE:
			setType(TYPE_EDEFAULT);
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
		case TuberPackage.HELP_CENTRE_CALL__RIDE:
			return ride != null;
		case TuberPackage.HELP_CENTRE_CALL__DURATION:
			return duration != DURATION_EDEFAULT;
		case TuberPackage.HELP_CENTRE_CALL__ISSUE:
			return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
		case TuberPackage.HELP_CENTRE_CALL__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case TuberPackage.HELP_CENTRE_CALL__STATUS:
			return status != STATUS_EDEFAULT;
		case TuberPackage.HELP_CENTRE_CALL__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", issue: ");
		result.append(issue);
		result.append(", date: ");
		result.append(date);
		result.append(", status: ");
		result.append(status);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //HelpCentreCallImpl
