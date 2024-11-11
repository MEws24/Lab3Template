/**
 */
package tuber.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import tuber.Agent;
import tuber.AppUser;
import tuber.CarRide;
import tuber.City;
import tuber.Driver;
import tuber.HelpCentreCall;
import tuber.IssueType;
import tuber.Location;
import tuber.LuxuryRide;
import tuber.MotorRide;
import tuber.NamedElement;
import tuber.Payment;
import tuber.PaymentType;
import tuber.Ride;
import tuber.RideStatus;
import tuber.Rider;
import tuber.TUber;
import tuber.TicketStatus;
import tuber.TuberFactory;
import tuber.TuberPackage;
import tuber.Vehicle;
import tuber.VehicleType;

import tuber.util.TuberValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TuberPackageImpl extends EPackageImpl implements TuberPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorRideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carRideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luxuryRideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helpCentreCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tUberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vehicleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ticketStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rideStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tuber.TuberPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TuberPackageImpl() {
		super(eNS_URI, TuberFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TuberPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TuberPackage init() {
		if (isInited)
			return (TuberPackage) EPackage.Registry.INSTANCE.getEPackage(TuberPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTuberPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TuberPackageImpl theTuberPackage = registeredTuberPackage instanceof TuberPackageImpl
				? (TuberPackageImpl) registeredTuberPackage
				: new TuberPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTuberPackage.createPackageContents();

		// Initialize created meta-data
		theTuberPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theTuberPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return TuberValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theTuberPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TuberPackage.eNS_URI, theTuberPackage);
		return theTuberPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Rides() {
		return (EReference) agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Hires() {
		return (EReference) agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Enrolls() {
		return (EReference) agentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgent_City() {
		return (EAttribute) agentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRider() {
		return riderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRider_Payment() {
		return (EReference) riderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRider_Spendings() {
		return (EAttribute) riderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRider__Inv4__DiagnosticChain_Map() {
		return riderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDriver() {
		return driverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDriver_Vehicle() {
		return (EReference) driverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDriver_Earnings() {
		return (EAttribute) driverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriver__Inv5__DiagnosticChain_Map() {
		return driverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppUser() {
		return appUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppUser_Location() {
		return (EReference) appUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppUser_Rating() {
		return (EAttribute) appUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppUser_SupportCall() {
		return (EReference) appUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppUser_Status() {
		return (EAttribute) appUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRide() {
		return rideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRide_Customer() {
		return (EReference) rideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRide_Driver() {
		return (EReference) rideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRide_Date() {
		return (EAttribute) rideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRide_Amount() {
		return (EAttribute) rideEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRide_Paid() {
		return (EAttribute) rideEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRide_Id() {
		return (EAttribute) rideEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRide_Status() {
		return (EAttribute) rideEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Type() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Status() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_Ride() {
		return (EReference) paymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicle_Type() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicle_Sharing() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicle_Capacity() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Long() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Lat() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_City() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMotorRide() {
		return motorRideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMotorRide_Rate() {
		return (EAttribute) motorRideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarRide() {
		return carRideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarRide_Rate() {
		return (EAttribute) carRideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLuxuryRide() {
		return luxuryRideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLuxuryRide_Rate() {
		return (EAttribute) luxuryRideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHelpCentreCall() {
		return helpCentreCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHelpCentreCall_Ride() {
		return (EReference) helpCentreCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHelpCentreCall_Duration() {
		return (EAttribute) helpCentreCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHelpCentreCall_Issue() {
		return (EAttribute) helpCentreCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHelpCentreCall_Date() {
		return (EAttribute) helpCentreCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHelpCentreCall_Status() {
		return (EAttribute) helpCentreCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHelpCentreCall_Type() {
		return (EAttribute) helpCentreCallEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTUber() {
		return tUberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTUber_Agent() {
		return (EReference) tUberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaymentType() {
		return paymentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVehicleType() {
		return vehicleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCity() {
		return cityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTicketStatus() {
		return ticketStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIssueType() {
		return issueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRideStatus() {
		return rideStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TuberFactory getTuberFactory() {
		return (TuberFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__RIDES);
		createEReference(agentEClass, AGENT__HIRES);
		createEReference(agentEClass, AGENT__ENROLLS);
		createEAttribute(agentEClass, AGENT__CITY);

		riderEClass = createEClass(RIDER);
		createEReference(riderEClass, RIDER__PAYMENT);
		createEAttribute(riderEClass, RIDER__SPENDINGS);
		createEOperation(riderEClass, RIDER___INV4__DIAGNOSTICCHAIN_MAP);

		driverEClass = createEClass(DRIVER);
		createEReference(driverEClass, DRIVER__VEHICLE);
		createEAttribute(driverEClass, DRIVER__EARNINGS);
		createEOperation(driverEClass, DRIVER___INV5__DIAGNOSTICCHAIN_MAP);

		appUserEClass = createEClass(APP_USER);
		createEReference(appUserEClass, APP_USER__LOCATION);
		createEAttribute(appUserEClass, APP_USER__RATING);
		createEReference(appUserEClass, APP_USER__SUPPORT_CALL);
		createEAttribute(appUserEClass, APP_USER__STATUS);

		rideEClass = createEClass(RIDE);
		createEReference(rideEClass, RIDE__CUSTOMER);
		createEReference(rideEClass, RIDE__DRIVER);
		createEAttribute(rideEClass, RIDE__DATE);
		createEAttribute(rideEClass, RIDE__AMOUNT);
		createEAttribute(rideEClass, RIDE__PAID);
		createEAttribute(rideEClass, RIDE__ID);
		createEAttribute(rideEClass, RIDE__STATUS);

		paymentEClass = createEClass(PAYMENT);
		createEAttribute(paymentEClass, PAYMENT__TYPE);
		createEAttribute(paymentEClass, PAYMENT__STATUS);
		createEReference(paymentEClass, PAYMENT__RIDE);

		vehicleEClass = createEClass(VEHICLE);
		createEAttribute(vehicleEClass, VEHICLE__TYPE);
		createEAttribute(vehicleEClass, VEHICLE__SHARING);
		createEAttribute(vehicleEClass, VEHICLE__CAPACITY);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LONG);
		createEAttribute(locationEClass, LOCATION__LAT);
		createEAttribute(locationEClass, LOCATION__CITY);

		motorRideEClass = createEClass(MOTOR_RIDE);
		createEAttribute(motorRideEClass, MOTOR_RIDE__RATE);

		carRideEClass = createEClass(CAR_RIDE);
		createEAttribute(carRideEClass, CAR_RIDE__RATE);

		luxuryRideEClass = createEClass(LUXURY_RIDE);
		createEAttribute(luxuryRideEClass, LUXURY_RIDE__RATE);

		helpCentreCallEClass = createEClass(HELP_CENTRE_CALL);
		createEReference(helpCentreCallEClass, HELP_CENTRE_CALL__RIDE);
		createEAttribute(helpCentreCallEClass, HELP_CENTRE_CALL__DURATION);
		createEAttribute(helpCentreCallEClass, HELP_CENTRE_CALL__ISSUE);
		createEAttribute(helpCentreCallEClass, HELP_CENTRE_CALL__DATE);
		createEAttribute(helpCentreCallEClass, HELP_CENTRE_CALL__STATUS);
		createEAttribute(helpCentreCallEClass, HELP_CENTRE_CALL__TYPE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		tUberEClass = createEClass(TUBER);
		createEReference(tUberEClass, TUBER__AGENT);

		// Create enums
		paymentTypeEEnum = createEEnum(PAYMENT_TYPE);
		vehicleTypeEEnum = createEEnum(VEHICLE_TYPE);
		cityEEnum = createEEnum(CITY);
		ticketStatusEEnum = createEEnum(TICKET_STATUS);
		issueTypeEEnum = createEEnum(ISSUE_TYPE);
		rideStatusEEnum = createEEnum(RIDE_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agentEClass.getESuperTypes().add(this.getNamedElement());
		riderEClass.getESuperTypes().add(this.getAppUser());
		driverEClass.getESuperTypes().add(this.getAppUser());
		appUserEClass.getESuperTypes().add(this.getNamedElement());
		rideEClass.getESuperTypes().add(this.getNamedElement());
		vehicleEClass.getESuperTypes().add(this.getNamedElement());
		motorRideEClass.getESuperTypes().add(this.getRide());
		carRideEClass.getESuperTypes().add(this.getRide());
		luxuryRideEClass.getESuperTypes().add(this.getRide());
		tUberEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_Rides(), this.getRide(), null, "rides", null, 0, -1, Agent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAgent_Hires(), this.getDriver(), null, "hires", null, 0, -1, Agent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAgent_Enrolls(), this.getRider(), null, "enrolls", null, 0, -1, Agent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAgent_City(), this.getCity(), "city", null, 1, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riderEClass, Rider.class, "Rider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRider_Payment(), this.getPayment(), null, "payment", null, 0, -1, Rider.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRider_Spendings(), ecorePackage.getEFloat(), "spendings", null, 1, 1, Rider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRider__Inv4__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inv4", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDriver_Vehicle(), this.getVehicle(), null, "vehicle", null, 1, 1, Driver.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDriver_Earnings(), ecorePackage.getEFloat(), "earnings", null, 1, 1, Driver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDriver__Inv5__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inv5", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(appUserEClass, AppUser.class, "AppUser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppUser_Location(), this.getLocation(), null, "location", null, 1, 1, AppUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppUser_Rating(), theXMLTypePackage.getFloat(), "rating", null, 1, 1, AppUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppUser_SupportCall(), this.getHelpCentreCall(), null, "supportCall", null, 0, -1,
				AppUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppUser_Status(), this.getRideStatus(), "status", null, 1, 1, AppUser.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rideEClass, Ride.class, "Ride", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRide_Customer(), this.getRider(), null, "customer", null, 1, -1, Ride.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRide_Driver(), this.getDriver(), null, "driver", null, 1, 1, Ride.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRide_Date(), ecorePackage.getEString(), "date", null, 1, 1, Ride.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRide_Amount(), ecorePackage.getEFloat(), "amount", null, 1, 1, Ride.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRide_Paid(), ecorePackage.getEBoolean(), "paid", null, 1, 1, Ride.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRide_Id(), ecorePackage.getEString(), "id", null, 1, 1, Ride.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRide_Status(), this.getRideStatus(), "status", null, 1, 1, Ride.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayment_Type(), this.getPaymentType(), "type", null, 1, 1, Payment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_Status(), ecorePackage.getEBoolean(), "status", null, 1, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayment_Ride(), this.getRide(), null, "ride", null, 1, 1, Payment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicle_Type(), this.getVehicleType(), "type", "CAR", 1, 1, Vehicle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Sharing(), ecorePackage.getEBoolean(), "sharing", null, 1, 1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Capacity(), ecorePackage.getEInt(), "capacity", null, 1, 1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Long(), ecorePackage.getEFloat(), "long", null, 1, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Lat(), ecorePackage.getEFloat(), "lat", null, 1, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_City(), this.getCity(), "city", null, 1, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motorRideEClass, MotorRide.class, "MotorRide", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotorRide_Rate(), ecorePackage.getEFloat(), "rate", "2.0", 1, 1, MotorRide.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carRideEClass, CarRide.class, "CarRide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarRide_Rate(), ecorePackage.getEFloat(), "rate", "4.0", 1, 1, CarRide.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(luxuryRideEClass, LuxuryRide.class, "LuxuryRide", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLuxuryRide_Rate(), ecorePackage.getEFloat(), "rate", "10.0", 1, 1, LuxuryRide.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helpCentreCallEClass, HelpCentreCall.class, "HelpCentreCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHelpCentreCall_Ride(), this.getRide(), null, "ride", null, 0, 1, HelpCentreCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelpCentreCall_Duration(), theXMLTypePackage.getFloat(), "duration", null, 1, 1,
				HelpCentreCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelpCentreCall_Issue(), ecorePackage.getEString(), "issue", null, 1, 1, HelpCentreCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelpCentreCall_Date(), ecorePackage.getEString(), "date", null, 1, 1, HelpCentreCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelpCentreCall_Status(), this.getTicketStatus(), "status", null, 1, 1, HelpCentreCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelpCentreCall_Type(), this.getIssueType(), "type", null, 1, 1, HelpCentreCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tUberEClass, TUber.class, "TUber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTUber_Agent(), this.getAgent(), null, "agent", null, 0, -1, TUber.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(paymentTypeEEnum, PaymentType.class, "PaymentType");
		addEEnumLiteral(paymentTypeEEnum, PaymentType.CREDITCARD);
		addEEnumLiteral(paymentTypeEEnum, PaymentType.APPLEPAY);
		addEEnumLiteral(paymentTypeEEnum, PaymentType.PAYPAL);
		addEEnumLiteral(paymentTypeEEnum, PaymentType.CASH);

		initEEnum(vehicleTypeEEnum, VehicleType.class, "VehicleType");
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.MOTORBIKE);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.CAR);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.LUXURY);

		initEEnum(cityEEnum, City.class, "City");
		addEEnumLiteral(cityEEnum, City.WIEN);
		addEEnumLiteral(cityEEnum, City.SALZBURG);
		addEEnumLiteral(cityEEnum, City.LINZ);

		initEEnum(ticketStatusEEnum, TicketStatus.class, "TicketStatus");
		addEEnumLiteral(ticketStatusEEnum, TicketStatus.RESOLVED);
		addEEnumLiteral(ticketStatusEEnum, TicketStatus.PENDING);

		initEEnum(issueTypeEEnum, IssueType.class, "IssueType");
		addEEnumLiteral(issueTypeEEnum, IssueType.PAYMENT);
		addEEnumLiteral(issueTypeEEnum, IssueType.SAFETY);
		addEEnumLiteral(issueTypeEEnum, IssueType.ACCOUNT);

		initEEnum(rideStatusEEnum, RideStatus.class, "RideStatus");
		addEEnumLiteral(rideStatusEEnum, RideStatus.IDLE);
		addEEnumLiteral(rideStatusEEnum, RideStatus.ONGOING);
		addEEnumLiteral(rideStatusEEnum, RideStatus.REQUESTED);
		addEEnumLiteral(rideStatusEEnum, RideStatus.COMPLETED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(riderEClass, source, new String[] { "constraints", "inv4" });
		addAnnotation(driverEClass, source, new String[] { "constraints", "inv5" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getRider__Inv4__DiagnosticChain_Map(), source, new String[] { "body",
				"Sequence {RideStatus::ONGOING, RideStatus::IDLE, RideStatus::REQUESTED} -> includes(self.status)" });
		addAnnotation(getDriver__Inv5__DiagnosticChain_Map(), source,
				new String[] { "body", "Sequence {RideStatus::ONGOING, RideStatus::IDLE} -> includes(self.status)" });
	}

} //TuberPackageImpl
