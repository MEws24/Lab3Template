/**
 */
package tuber.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tuber.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tuber.TuberPackage
 * @generated
 */
public class TuberValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TuberValidator INSTANCE = new TuberValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tuber";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv4' of 'Rider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RIDER__INV4 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv5' of 'Driver'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DRIVER__INV5 = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TuberPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TuberPackage.AGENT:
			return validateAgent((Agent) value, diagnostics, context);
		case TuberPackage.RIDER:
			return validateRider((Rider) value, diagnostics, context);
		case TuberPackage.DRIVER:
			return validateDriver((Driver) value, diagnostics, context);
		case TuberPackage.APP_USER:
			return validateAppUser((AppUser) value, diagnostics, context);
		case TuberPackage.RIDE:
			return validateRide((Ride) value, diagnostics, context);
		case TuberPackage.PAYMENT:
			return validatePayment((Payment) value, diagnostics, context);
		case TuberPackage.VEHICLE:
			return validateVehicle((Vehicle) value, diagnostics, context);
		case TuberPackage.LOCATION:
			return validateLocation((Location) value, diagnostics, context);
		case TuberPackage.MOTOR_RIDE:
			return validateMotorRide((MotorRide) value, diagnostics, context);
		case TuberPackage.CAR_RIDE:
			return validateCarRide((CarRide) value, diagnostics, context);
		case TuberPackage.LUXURY_RIDE:
			return validateLuxuryRide((LuxuryRide) value, diagnostics, context);
		case TuberPackage.HELP_CENTRE_CALL:
			return validateHelpCentreCall((HelpCentreCall) value, diagnostics, context);
		case TuberPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case TuberPackage.TUBER:
			return validateTUber((TUber) value, diagnostics, context);
		case TuberPackage.PAYMENT_TYPE:
			return validatePaymentType((PaymentType) value, diagnostics, context);
		case TuberPackage.VEHICLE_TYPE:
			return validateVehicleType((VehicleType) value, diagnostics, context);
		case TuberPackage.CITY:
			return validateCity((City) value, diagnostics, context);
		case TuberPackage.TICKET_STATUS:
			return validateTicketStatus((TicketStatus) value, diagnostics, context);
		case TuberPackage.ISSUE_TYPE:
			return validateIssueType((IssueType) value, diagnostics, context);
		case TuberPackage.RIDE_STATUS:
			return validateRideStatus((RideStatus) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgent(Agent agent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(agent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRider(Rider rider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rider, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(rider, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(rider, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(rider, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(rider, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(rider, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(rider, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(rider, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(rider, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRider_inv4(rider, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv4 constraint of '<em>Rider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRider_inv4(Rider rider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rider.inv4(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriver(Driver driver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(driver, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDriver_inv5(driver, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv5 constraint of '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriver_inv5(Driver driver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return driver.inv5(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppUser(AppUser appUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appUser, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRide(Ride ride, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ride, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment(Payment payment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(payment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicle(Vehicle vehicle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vehicle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotorRide(MotorRide motorRide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(motorRide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarRide(CarRide carRide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carRide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuxuryRide(LuxuryRide luxuryRide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luxuryRide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHelpCentreCall(HelpCentreCall helpCentreCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(helpCentreCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUber(TUber tUber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tUber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentType(PaymentType paymentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleType(VehicleType vehicleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTicketStatus(TicketStatus ticketStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueType(IssueType issueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRideStatus(RideStatus rideStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TuberValidator
