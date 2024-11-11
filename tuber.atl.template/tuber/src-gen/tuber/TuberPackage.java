/**
 */
package tuber;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tuber.TuberFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface TuberPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tuber";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tuber";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tuber";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TuberPackage eINSTANCE = tuber.impl.TuberPackageImpl.init();

	/**
	 * The meta object id for the '{@link tuber.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.NamedElementImpl
	 * @see tuber.impl.TuberPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.AgentImpl
	 * @see tuber.impl.TuberPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__RIDES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__HIRES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enrolls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ENROLLS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.AppUserImpl <em>App User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.AppUserImpl
	 * @see tuber.impl.TuberPackageImpl#getAppUser()
	 * @generated
	 */
	int APP_USER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__RATING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Support Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__SUPPORT_CALL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>App User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>App User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_USER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.RiderImpl <em>Rider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.RiderImpl
	 * @see tuber.impl.TuberPackageImpl#getRider()
	 * @generated
	 */
	int RIDER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__NAME = APP_USER__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__LOCATION = APP_USER__LOCATION;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__RATING = APP_USER__RATING;

	/**
	 * The feature id for the '<em><b>Support Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__SUPPORT_CALL = APP_USER__SUPPORT_CALL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__STATUS = APP_USER__STATUS;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__PAYMENT = APP_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spendings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__SPENDINGS = APP_USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER_FEATURE_COUNT = APP_USER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Inv4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER___INV4__DIAGNOSTICCHAIN_MAP = APP_USER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER_OPERATION_COUNT = APP_USER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tuber.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.DriverImpl
	 * @see tuber.impl.TuberPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__NAME = APP_USER__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__LOCATION = APP_USER__LOCATION;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__RATING = APP_USER__RATING;

	/**
	 * The feature id for the '<em><b>Support Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__SUPPORT_CALL = APP_USER__SUPPORT_CALL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__STATUS = APP_USER__STATUS;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__VEHICLE = APP_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Earnings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__EARNINGS = APP_USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = APP_USER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Inv5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER___INV5__DIAGNOSTICCHAIN_MAP = APP_USER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_OPERATION_COUNT = APP_USER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tuber.impl.RideImpl <em>Ride</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.RideImpl
	 * @see tuber.impl.TuberPackageImpl#getRide()
	 * @generated
	 */
	int RIDE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__CUSTOMER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__DRIVER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__DATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__AMOUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__PAID = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__ID = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.PaymentImpl
	 * @see tuber.impl.TuberPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__RIDE = 2;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.VehicleImpl
	 * @see tuber.impl.TuberPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sharing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__SHARING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__CAPACITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.LocationImpl
	 * @see tuber.impl.TuberPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONG = 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LAT = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.MotorRideImpl <em>Motor Ride</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.MotorRideImpl
	 * @see tuber.impl.TuberPackageImpl#getMotorRide()
	 * @generated
	 */
	int MOTOR_RIDE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE__NAME = RIDE__NAME;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE__CUSTOMER = RIDE__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE__DRIVER = RIDE__DRIVER;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE__DATE = RIDE__DATE;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE__AMOUNT = RIDE__AMOUNT;

	/**
	 * The feature id for the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE__PAID = RIDE__PAID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE__ID = RIDE__ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE__STATUS = RIDE__STATUS;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE__RATE = RIDE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Motor Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE_FEATURE_COUNT = RIDE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Motor Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_RIDE_OPERATION_COUNT = RIDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.CarRideImpl <em>Car Ride</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.CarRideImpl
	 * @see tuber.impl.TuberPackageImpl#getCarRide()
	 * @generated
	 */
	int CAR_RIDE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE__NAME = RIDE__NAME;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE__CUSTOMER = RIDE__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE__DRIVER = RIDE__DRIVER;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE__DATE = RIDE__DATE;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE__AMOUNT = RIDE__AMOUNT;

	/**
	 * The feature id for the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE__PAID = RIDE__PAID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE__ID = RIDE__ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE__STATUS = RIDE__STATUS;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE__RATE = RIDE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Car Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE_FEATURE_COUNT = RIDE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Car Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_RIDE_OPERATION_COUNT = RIDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.LuxuryRideImpl <em>Luxury Ride</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.LuxuryRideImpl
	 * @see tuber.impl.TuberPackageImpl#getLuxuryRide()
	 * @generated
	 */
	int LUXURY_RIDE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE__NAME = RIDE__NAME;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE__CUSTOMER = RIDE__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE__DRIVER = RIDE__DRIVER;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE__DATE = RIDE__DATE;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE__AMOUNT = RIDE__AMOUNT;

	/**
	 * The feature id for the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE__PAID = RIDE__PAID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE__ID = RIDE__ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE__STATUS = RIDE__STATUS;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE__RATE = RIDE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Luxury Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE_FEATURE_COUNT = RIDE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Luxury Ride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUXURY_RIDE_OPERATION_COUNT = RIDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.impl.HelpCentreCallImpl <em>Help Centre Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.HelpCentreCallImpl
	 * @see tuber.impl.TuberPackageImpl#getHelpCentreCall()
	 * @generated
	 */
	int HELP_CENTRE_CALL = 11;

	/**
	 * The feature id for the '<em><b>Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__RIDE = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__ISSUE = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__DATE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Help Centre Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Help Centre Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CENTRE_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tuber.impl.TUberImpl <em>TUber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.impl.TUberImpl
	 * @see tuber.impl.TuberPackageImpl#getTUber()
	 * @generated
	 */
	int TUBER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBER__AGENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TUber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TUber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUBER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tuber.PaymentType <em>Payment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.PaymentType
	 * @see tuber.impl.TuberPackageImpl#getPaymentType()
	 * @generated
	 */
	int PAYMENT_TYPE = 14;

	/**
	 * The meta object id for the '{@link tuber.VehicleType <em>Vehicle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.VehicleType
	 * @see tuber.impl.TuberPackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 15;

	/**
	 * The meta object id for the '{@link tuber.City <em>City</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.City
	 * @see tuber.impl.TuberPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 16;

	/**
	 * The meta object id for the '{@link tuber.TicketStatus <em>Ticket Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.TicketStatus
	 * @see tuber.impl.TuberPackageImpl#getTicketStatus()
	 * @generated
	 */
	int TICKET_STATUS = 17;

	/**
	 * The meta object id for the '{@link tuber.IssueType <em>Issue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.IssueType
	 * @see tuber.impl.TuberPackageImpl#getIssueType()
	 * @generated
	 */
	int ISSUE_TYPE = 18;

	/**
	 * The meta object id for the '{@link tuber.RideStatus <em>Ride Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tuber.RideStatus
	 * @see tuber.impl.TuberPackageImpl#getRideStatus()
	 * @generated
	 */
	int RIDE_STATUS = 19;

	/**
	 * Returns the meta object for class '{@link tuber.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see tuber.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.Agent#getRides <em>Rides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rides</em>'.
	 * @see tuber.Agent#getRides()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Rides();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.Agent#getHires <em>Hires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hires</em>'.
	 * @see tuber.Agent#getHires()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Hires();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.Agent#getEnrolls <em>Enrolls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enrolls</em>'.
	 * @see tuber.Agent#getEnrolls()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Enrolls();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Agent#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see tuber.Agent#getCity()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_City();

	/**
	 * Returns the meta object for class '{@link tuber.Rider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rider</em>'.
	 * @see tuber.Rider
	 * @generated
	 */
	EClass getRider();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.Rider#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payment</em>'.
	 * @see tuber.Rider#getPayment()
	 * @see #getRider()
	 * @generated
	 */
	EReference getRider_Payment();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Rider#getSpendings <em>Spendings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spendings</em>'.
	 * @see tuber.Rider#getSpendings()
	 * @see #getRider()
	 * @generated
	 */
	EAttribute getRider_Spendings();

	/**
	 * Returns the meta object for the '{@link tuber.Rider#inv4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv4</em>' operation.
	 * @see tuber.Rider#inv4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRider__Inv4__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link tuber.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see tuber.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the containment reference '{@link tuber.Driver#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle</em>'.
	 * @see tuber.Driver#getVehicle()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Vehicle();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Driver#getEarnings <em>Earnings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earnings</em>'.
	 * @see tuber.Driver#getEarnings()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_Earnings();

	/**
	 * Returns the meta object for the '{@link tuber.Driver#inv5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv5</em>' operation.
	 * @see tuber.Driver#inv5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDriver__Inv5__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link tuber.AppUser <em>App User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App User</em>'.
	 * @see tuber.AppUser
	 * @generated
	 */
	EClass getAppUser();

	/**
	 * Returns the meta object for the containment reference '{@link tuber.AppUser#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see tuber.AppUser#getLocation()
	 * @see #getAppUser()
	 * @generated
	 */
	EReference getAppUser_Location();

	/**
	 * Returns the meta object for the attribute '{@link tuber.AppUser#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see tuber.AppUser#getRating()
	 * @see #getAppUser()
	 * @generated
	 */
	EAttribute getAppUser_Rating();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.AppUser#getSupportCall <em>Support Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Support Call</em>'.
	 * @see tuber.AppUser#getSupportCall()
	 * @see #getAppUser()
	 * @generated
	 */
	EReference getAppUser_SupportCall();

	/**
	 * Returns the meta object for the attribute '{@link tuber.AppUser#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see tuber.AppUser#getStatus()
	 * @see #getAppUser()
	 * @generated
	 */
	EAttribute getAppUser_Status();

	/**
	 * Returns the meta object for class '{@link tuber.Ride <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ride</em>'.
	 * @see tuber.Ride
	 * @generated
	 */
	EClass getRide();

	/**
	 * Returns the meta object for the reference list '{@link tuber.Ride#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer</em>'.
	 * @see tuber.Ride#getCustomer()
	 * @see #getRide()
	 * @generated
	 */
	EReference getRide_Customer();

	/**
	 * Returns the meta object for the reference '{@link tuber.Ride#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Driver</em>'.
	 * @see tuber.Ride#getDriver()
	 * @see #getRide()
	 * @generated
	 */
	EReference getRide_Driver();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tuber.Ride#getDate()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Date();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see tuber.Ride#getAmount()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Amount();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#isPaid <em>Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid</em>'.
	 * @see tuber.Ride#isPaid()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Paid();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tuber.Ride#getId()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Id();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Ride#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see tuber.Ride#getStatus()
	 * @see #getRide()
	 * @generated
	 */
	EAttribute getRide_Status();

	/**
	 * Returns the meta object for class '{@link tuber.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see tuber.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Payment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tuber.Payment#getType()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Type();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Payment#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see tuber.Payment#isStatus()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Status();

	/**
	 * Returns the meta object for the reference '{@link tuber.Payment#getRide <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ride</em>'.
	 * @see tuber.Payment#getRide()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_Ride();

	/**
	 * Returns the meta object for class '{@link tuber.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see tuber.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Vehicle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tuber.Vehicle#getType()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Type();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Vehicle#isSharing <em>Sharing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sharing</em>'.
	 * @see tuber.Vehicle#isSharing()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Sharing();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Vehicle#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see tuber.Vehicle#getCapacity()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Capacity();

	/**
	 * Returns the meta object for class '{@link tuber.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see tuber.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Location#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see tuber.Location#getLong()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Long();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Location#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see tuber.Location#getLat()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link tuber.Location#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see tuber.Location#getCity()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_City();

	/**
	 * Returns the meta object for class '{@link tuber.MotorRide <em>Motor Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor Ride</em>'.
	 * @see tuber.MotorRide
	 * @generated
	 */
	EClass getMotorRide();

	/**
	 * Returns the meta object for the attribute '{@link tuber.MotorRide#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see tuber.MotorRide#getRate()
	 * @see #getMotorRide()
	 * @generated
	 */
	EAttribute getMotorRide_Rate();

	/**
	 * Returns the meta object for class '{@link tuber.CarRide <em>Car Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car Ride</em>'.
	 * @see tuber.CarRide
	 * @generated
	 */
	EClass getCarRide();

	/**
	 * Returns the meta object for the attribute '{@link tuber.CarRide#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see tuber.CarRide#getRate()
	 * @see #getCarRide()
	 * @generated
	 */
	EAttribute getCarRide_Rate();

	/**
	 * Returns the meta object for class '{@link tuber.LuxuryRide <em>Luxury Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luxury Ride</em>'.
	 * @see tuber.LuxuryRide
	 * @generated
	 */
	EClass getLuxuryRide();

	/**
	 * Returns the meta object for the attribute '{@link tuber.LuxuryRide#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see tuber.LuxuryRide#getRate()
	 * @see #getLuxuryRide()
	 * @generated
	 */
	EAttribute getLuxuryRide_Rate();

	/**
	 * Returns the meta object for class '{@link tuber.HelpCentreCall <em>Help Centre Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help Centre Call</em>'.
	 * @see tuber.HelpCentreCall
	 * @generated
	 */
	EClass getHelpCentreCall();

	/**
	 * Returns the meta object for the reference '{@link tuber.HelpCentreCall#getRide <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ride</em>'.
	 * @see tuber.HelpCentreCall#getRide()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EReference getHelpCentreCall_Ride();

	/**
	 * Returns the meta object for the attribute '{@link tuber.HelpCentreCall#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see tuber.HelpCentreCall#getDuration()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EAttribute getHelpCentreCall_Duration();

	/**
	 * Returns the meta object for the attribute '{@link tuber.HelpCentreCall#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see tuber.HelpCentreCall#getIssue()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EAttribute getHelpCentreCall_Issue();

	/**
	 * Returns the meta object for the attribute '{@link tuber.HelpCentreCall#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tuber.HelpCentreCall#getDate()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EAttribute getHelpCentreCall_Date();

	/**
	 * Returns the meta object for the attribute '{@link tuber.HelpCentreCall#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see tuber.HelpCentreCall#getStatus()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EAttribute getHelpCentreCall_Status();

	/**
	 * Returns the meta object for the attribute '{@link tuber.HelpCentreCall#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tuber.HelpCentreCall#getType()
	 * @see #getHelpCentreCall()
	 * @generated
	 */
	EAttribute getHelpCentreCall_Type();

	/**
	 * Returns the meta object for class '{@link tuber.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see tuber.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link tuber.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tuber.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link tuber.TUber <em>TUber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUber</em>'.
	 * @see tuber.TUber
	 * @generated
	 */
	EClass getTUber();

	/**
	 * Returns the meta object for the containment reference list '{@link tuber.TUber#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see tuber.TUber#getAgent()
	 * @see #getTUber()
	 * @generated
	 */
	EReference getTUber_Agent();

	/**
	 * Returns the meta object for enum '{@link tuber.PaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Type</em>'.
	 * @see tuber.PaymentType
	 * @generated
	 */
	EEnum getPaymentType();

	/**
	 * Returns the meta object for enum '{@link tuber.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vehicle Type</em>'.
	 * @see tuber.VehicleType
	 * @generated
	 */
	EEnum getVehicleType();

	/**
	 * Returns the meta object for enum '{@link tuber.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>City</em>'.
	 * @see tuber.City
	 * @generated
	 */
	EEnum getCity();

	/**
	 * Returns the meta object for enum '{@link tuber.TicketStatus <em>Ticket Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ticket Status</em>'.
	 * @see tuber.TicketStatus
	 * @generated
	 */
	EEnum getTicketStatus();

	/**
	 * Returns the meta object for enum '{@link tuber.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Type</em>'.
	 * @see tuber.IssueType
	 * @generated
	 */
	EEnum getIssueType();

	/**
	 * Returns the meta object for enum '{@link tuber.RideStatus <em>Ride Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ride Status</em>'.
	 * @see tuber.RideStatus
	 * @generated
	 */
	EEnum getRideStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TuberFactory getTuberFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tuber.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.AgentImpl
		 * @see tuber.impl.TuberPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Rides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__RIDES = eINSTANCE.getAgent_Rides();

		/**
		 * The meta object literal for the '<em><b>Hires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__HIRES = eINSTANCE.getAgent_Hires();

		/**
		 * The meta object literal for the '<em><b>Enrolls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ENROLLS = eINSTANCE.getAgent_Enrolls();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__CITY = eINSTANCE.getAgent_City();

		/**
		 * The meta object literal for the '{@link tuber.impl.RiderImpl <em>Rider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.RiderImpl
		 * @see tuber.impl.TuberPackageImpl#getRider()
		 * @generated
		 */
		EClass RIDER = eINSTANCE.getRider();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDER__PAYMENT = eINSTANCE.getRider_Payment();

		/**
		 * The meta object literal for the '<em><b>Spendings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDER__SPENDINGS = eINSTANCE.getRider_Spendings();

		/**
		 * The meta object literal for the '<em><b>Inv4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIDER___INV4__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRider__Inv4__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link tuber.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.DriverImpl
		 * @see tuber.impl.TuberPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__VEHICLE = eINSTANCE.getDriver_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Earnings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__EARNINGS = eINSTANCE.getDriver_Earnings();

		/**
		 * The meta object literal for the '<em><b>Inv5</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVER___INV5__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDriver__Inv5__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link tuber.impl.AppUserImpl <em>App User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.AppUserImpl
		 * @see tuber.impl.TuberPackageImpl#getAppUser()
		 * @generated
		 */
		EClass APP_USER = eINSTANCE.getAppUser();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_USER__LOCATION = eINSTANCE.getAppUser_Location();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_USER__RATING = eINSTANCE.getAppUser_Rating();

		/**
		 * The meta object literal for the '<em><b>Support Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_USER__SUPPORT_CALL = eINSTANCE.getAppUser_SupportCall();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_USER__STATUS = eINSTANCE.getAppUser_Status();

		/**
		 * The meta object literal for the '{@link tuber.impl.RideImpl <em>Ride</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.RideImpl
		 * @see tuber.impl.TuberPackageImpl#getRide()
		 * @generated
		 */
		EClass RIDE = eINSTANCE.getRide();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDE__CUSTOMER = eINSTANCE.getRide_Customer();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDE__DRIVER = eINSTANCE.getRide_Driver();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__DATE = eINSTANCE.getRide_Date();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__AMOUNT = eINSTANCE.getRide_Amount();

		/**
		 * The meta object literal for the '<em><b>Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__PAID = eINSTANCE.getRide_Paid();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__ID = eINSTANCE.getRide_Id();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDE__STATUS = eINSTANCE.getRide_Status();

		/**
		 * The meta object literal for the '{@link tuber.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.PaymentImpl
		 * @see tuber.impl.TuberPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__TYPE = eINSTANCE.getPayment_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__STATUS = eINSTANCE.getPayment_Status();

		/**
		 * The meta object literal for the '<em><b>Ride</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__RIDE = eINSTANCE.getPayment_Ride();

		/**
		 * The meta object literal for the '{@link tuber.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.VehicleImpl
		 * @see tuber.impl.TuberPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__TYPE = eINSTANCE.getVehicle_Type();

		/**
		 * The meta object literal for the '<em><b>Sharing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__SHARING = eINSTANCE.getVehicle_Sharing();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__CAPACITY = eINSTANCE.getVehicle_Capacity();

		/**
		 * The meta object literal for the '{@link tuber.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.LocationImpl
		 * @see tuber.impl.TuberPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONG = eINSTANCE.getLocation_Long();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LAT = eINSTANCE.getLocation_Lat();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY = eINSTANCE.getLocation_City();

		/**
		 * The meta object literal for the '{@link tuber.impl.MotorRideImpl <em>Motor Ride</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.MotorRideImpl
		 * @see tuber.impl.TuberPackageImpl#getMotorRide()
		 * @generated
		 */
		EClass MOTOR_RIDE = eINSTANCE.getMotorRide();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR_RIDE__RATE = eINSTANCE.getMotorRide_Rate();

		/**
		 * The meta object literal for the '{@link tuber.impl.CarRideImpl <em>Car Ride</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.CarRideImpl
		 * @see tuber.impl.TuberPackageImpl#getCarRide()
		 * @generated
		 */
		EClass CAR_RIDE = eINSTANCE.getCarRide();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR_RIDE__RATE = eINSTANCE.getCarRide_Rate();

		/**
		 * The meta object literal for the '{@link tuber.impl.LuxuryRideImpl <em>Luxury Ride</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.LuxuryRideImpl
		 * @see tuber.impl.TuberPackageImpl#getLuxuryRide()
		 * @generated
		 */
		EClass LUXURY_RIDE = eINSTANCE.getLuxuryRide();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUXURY_RIDE__RATE = eINSTANCE.getLuxuryRide_Rate();

		/**
		 * The meta object literal for the '{@link tuber.impl.HelpCentreCallImpl <em>Help Centre Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.HelpCentreCallImpl
		 * @see tuber.impl.TuberPackageImpl#getHelpCentreCall()
		 * @generated
		 */
		EClass HELP_CENTRE_CALL = eINSTANCE.getHelpCentreCall();

		/**
		 * The meta object literal for the '<em><b>Ride</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELP_CENTRE_CALL__RIDE = eINSTANCE.getHelpCentreCall_Ride();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CENTRE_CALL__DURATION = eINSTANCE.getHelpCentreCall_Duration();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CENTRE_CALL__ISSUE = eINSTANCE.getHelpCentreCall_Issue();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CENTRE_CALL__DATE = eINSTANCE.getHelpCentreCall_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CENTRE_CALL__STATUS = eINSTANCE.getHelpCentreCall_Status();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CENTRE_CALL__TYPE = eINSTANCE.getHelpCentreCall_Type();

		/**
		 * The meta object literal for the '{@link tuber.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.NamedElementImpl
		 * @see tuber.impl.TuberPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link tuber.impl.TUberImpl <em>TUber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.impl.TUberImpl
		 * @see tuber.impl.TuberPackageImpl#getTUber()
		 * @generated
		 */
		EClass TUBER = eINSTANCE.getTUber();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUBER__AGENT = eINSTANCE.getTUber_Agent();

		/**
		 * The meta object literal for the '{@link tuber.PaymentType <em>Payment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.PaymentType
		 * @see tuber.impl.TuberPackageImpl#getPaymentType()
		 * @generated
		 */
		EEnum PAYMENT_TYPE = eINSTANCE.getPaymentType();

		/**
		 * The meta object literal for the '{@link tuber.VehicleType <em>Vehicle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.VehicleType
		 * @see tuber.impl.TuberPackageImpl#getVehicleType()
		 * @generated
		 */
		EEnum VEHICLE_TYPE = eINSTANCE.getVehicleType();

		/**
		 * The meta object literal for the '{@link tuber.City <em>City</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.City
		 * @see tuber.impl.TuberPackageImpl#getCity()
		 * @generated
		 */
		EEnum CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '{@link tuber.TicketStatus <em>Ticket Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.TicketStatus
		 * @see tuber.impl.TuberPackageImpl#getTicketStatus()
		 * @generated
		 */
		EEnum TICKET_STATUS = eINSTANCE.getTicketStatus();

		/**
		 * The meta object literal for the '{@link tuber.IssueType <em>Issue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.IssueType
		 * @see tuber.impl.TuberPackageImpl#getIssueType()
		 * @generated
		 */
		EEnum ISSUE_TYPE = eINSTANCE.getIssueType();

		/**
		 * The meta object literal for the '{@link tuber.RideStatus <em>Ride Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tuber.RideStatus
		 * @see tuber.impl.TuberPackageImpl#getRideStatus()
		 * @generated
		 */
		EEnum RIDE_STATUS = eINSTANCE.getRideStatus();

	}

} //TuberPackage
