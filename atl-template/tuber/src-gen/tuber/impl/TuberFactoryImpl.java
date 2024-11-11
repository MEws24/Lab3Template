/**
 */
package tuber.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tuber.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TuberFactoryImpl extends EFactoryImpl implements TuberFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TuberFactory init() {
		try {
			TuberFactory theTuberFactory = (TuberFactory) EPackage.Registry.INSTANCE.getEFactory(TuberPackage.eNS_URI);
			if (theTuberFactory != null) {
				return theTuberFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TuberFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TuberPackage.AGENT:
			return createAgent();
		case TuberPackage.RIDER:
			return createRider();
		case TuberPackage.DRIVER:
			return createDriver();
		case TuberPackage.PAYMENT:
			return createPayment();
		case TuberPackage.VEHICLE:
			return createVehicle();
		case TuberPackage.LOCATION:
			return createLocation();
		case TuberPackage.MOTOR_RIDE:
			return createMotorRide();
		case TuberPackage.CAR_RIDE:
			return createCarRide();
		case TuberPackage.LUXURY_RIDE:
			return createLuxuryRide();
		case TuberPackage.HELP_CENTRE_CALL:
			return createHelpCentreCall();
		case TuberPackage.TUBER:
			return createTUber();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TuberPackage.PAYMENT_TYPE:
			return createPaymentTypeFromString(eDataType, initialValue);
		case TuberPackage.VEHICLE_TYPE:
			return createVehicleTypeFromString(eDataType, initialValue);
		case TuberPackage.CITY:
			return createCityFromString(eDataType, initialValue);
		case TuberPackage.TICKET_STATUS:
			return createTicketStatusFromString(eDataType, initialValue);
		case TuberPackage.ISSUE_TYPE:
			return createIssueTypeFromString(eDataType, initialValue);
		case TuberPackage.RIDE_STATUS:
			return createRideStatusFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TuberPackage.PAYMENT_TYPE:
			return convertPaymentTypeToString(eDataType, instanceValue);
		case TuberPackage.VEHICLE_TYPE:
			return convertVehicleTypeToString(eDataType, instanceValue);
		case TuberPackage.CITY:
			return convertCityToString(eDataType, instanceValue);
		case TuberPackage.TICKET_STATUS:
			return convertTicketStatusToString(eDataType, instanceValue);
		case TuberPackage.ISSUE_TYPE:
			return convertIssueTypeToString(eDataType, instanceValue);
		case TuberPackage.RIDE_STATUS:
			return convertRideStatusToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rider createRider() {
		RiderImpl rider = new RiderImpl();
		return rider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Driver createDriver() {
		DriverImpl driver = new DriverImpl();
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vehicle createVehicle() {
		VehicleImpl vehicle = new VehicleImpl();
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MotorRide createMotorRide() {
		MotorRideImpl motorRide = new MotorRideImpl();
		return motorRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarRide createCarRide() {
		CarRideImpl carRide = new CarRideImpl();
		return carRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LuxuryRide createLuxuryRide() {
		LuxuryRideImpl luxuryRide = new LuxuryRideImpl();
		return luxuryRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HelpCentreCall createHelpCentreCall() {
		HelpCentreCallImpl helpCentreCall = new HelpCentreCallImpl();
		return helpCentreCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUber createTUber() {
		TUberImpl tUber = new TUberImpl();
		return tUber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentType createPaymentTypeFromString(EDataType eDataType, String initialValue) {
		PaymentType result = PaymentType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType createVehicleTypeFromString(EDataType eDataType, String initialValue) {
		VehicleType result = VehicleType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVehicleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCityFromString(EDataType eDataType, String initialValue) {
		City result = City.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketStatus createTicketStatusFromString(EDataType eDataType, String initialValue) {
		TicketStatus result = TicketStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTicketStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueType createIssueTypeFromString(EDataType eDataType, String initialValue) {
		IssueType result = IssueType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RideStatus createRideStatusFromString(EDataType eDataType, String initialValue) {
		RideStatus result = RideStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRideStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TuberPackage getTuberPackage() {
		return (TuberPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TuberPackage getPackage() {
		return TuberPackage.eINSTANCE;
	}

} //TuberFactoryImpl
