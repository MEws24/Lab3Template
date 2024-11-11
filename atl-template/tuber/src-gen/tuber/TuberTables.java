/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /tuber/model/tuber.ecore
 * using:
 *   /tuber/model/tuber.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package tuber;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
// import tuber.TuberPackage;
// import tuber.TuberTables;

/**
 * TuberTables provides the dispatch tables for the tuber for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class TuberTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(TuberPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2003/XMLType", null, XMLTypePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_tuber = IdManager.getNsURIPackageId("http://www.example.org/tuber", null, TuberPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Agent = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("Agent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AppUser = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("AppUser", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Driver = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("Driver", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_HelpCentreCall = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("HelpCentreCall", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Location = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("Location", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Payment = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("Payment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ride = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("Ride", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Rider = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("Rider", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TUber = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("TUber", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Vehicle = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getClassId("Vehicle", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = TuberTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = TuberTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Float = TuberTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2003_s_XMLType.getDataTypeId("Float", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_City = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getEnumerationId("City");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_IssueType = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getEnumerationId("IssueType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PaymentType = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getEnumerationId("PaymentType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_RideStatus = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getEnumerationId("RideStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TicketStatus = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getEnumerationId("TicketStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_VehicleType = TuberTables.PACKid_http_c_s_s_www_example_org_s_tuber.getEnumerationId("VehicleType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_HelpCentreCall = TypeId.BAG.getSpecializedId(TuberTables.CLSSid_HelpCentreCall, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Payment = TypeId.BAG.getSpecializedId(TuberTables.CLSSid_Payment, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Ride = TypeId.BAG.getSpecializedId(TuberTables.CLSSid_Ride, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_IDLE = TuberTables.ENUMid_RideStatus.getEnumerationLiteralId("IDLE");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ONGOING = TuberTables.ENUMid_RideStatus.getEnumerationLiteralId("ONGOING");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_REQUESTED = TuberTables.ENUMid_RideStatus.getEnumerationLiteralId("REQUESTED");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Agent = TypeId.ORDERED_SET.getSpecializedId(TuberTables.CLSSid_Agent, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Driver = TypeId.ORDERED_SET.getSpecializedId(TuberTables.CLSSid_Driver, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_HelpCentreCall = TypeId.ORDERED_SET.getSpecializedId(TuberTables.CLSSid_HelpCentreCall, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Payment = TypeId.ORDERED_SET.getSpecializedId(TuberTables.CLSSid_Payment, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Ride = TypeId.ORDERED_SET.getSpecializedId(TuberTables.CLSSid_Ride, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Rider = TypeId.ORDERED_SET.getSpecializedId(TuberTables.CLSSid_Rider, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Rider_0 = TypeId.ORDERED_SET.getSpecializedId(TuberTables.CLSSid_Rider, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_ENUMid_RideStatus = TypeId.SEQUENCE.getSpecializedId(TuberTables.ENUMid_RideStatus, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ SequenceValue Sequence = ValueUtil.createSequenceOfEach(TuberTables.SEQ_ENUMid_RideStatus, TuberTables.ELITid_ONGOING, TuberTables.ELITid_IDLE, TuberTables.ELITid_REQUESTED);
	public static final /*@NonInvalid*/ SequenceValue Sequence_0 = ValueUtil.createSequenceOfEach(TuberTables.SEQ_ENUMid_RideStatus, TuberTables.ELITid_ONGOING, TuberTables.ELITid_IDLE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			TuberTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Agent = new EcoreExecutorType(TuberPackage.Literals.AGENT, PACKAGE, 0);
		public static final EcoreExecutorType _AppUser = new EcoreExecutorType(TuberPackage.Literals.APP_USER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _CarRide = new EcoreExecutorType(TuberPackage.Literals.CAR_RIDE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _City = new EcoreExecutorEnumeration(TuberPackage.Literals.CITY, PACKAGE, 0);
		public static final EcoreExecutorType _Driver = new EcoreExecutorType(TuberPackage.Literals.DRIVER, PACKAGE, 0);
		public static final EcoreExecutorType _HelpCentreCall = new EcoreExecutorType(TuberPackage.Literals.HELP_CENTRE_CALL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _IssueType = new EcoreExecutorEnumeration(TuberPackage.Literals.ISSUE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Location = new EcoreExecutorType(TuberPackage.Literals.LOCATION, PACKAGE, 0);
		public static final EcoreExecutorType _LuxuryRide = new EcoreExecutorType(TuberPackage.Literals.LUXURY_RIDE, PACKAGE, 0);
		public static final EcoreExecutorType _MotorRide = new EcoreExecutorType(TuberPackage.Literals.MOTOR_RIDE, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(TuberPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Payment = new EcoreExecutorType(TuberPackage.Literals.PAYMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PaymentType = new EcoreExecutorEnumeration(TuberPackage.Literals.PAYMENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Ride = new EcoreExecutorType(TuberPackage.Literals.RIDE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _RideStatus = new EcoreExecutorEnumeration(TuberPackage.Literals.RIDE_STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _Rider = new EcoreExecutorType(TuberPackage.Literals.RIDER, PACKAGE, 0);
		public static final EcoreExecutorType _TUber = new EcoreExecutorType(TuberPackage.Literals.TUBER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TicketStatus = new EcoreExecutorEnumeration(TuberPackage.Literals.TICKET_STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _Vehicle = new EcoreExecutorType(TuberPackage.Literals.VEHICLE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _VehicleType = new EcoreExecutorEnumeration(TuberPackage.Literals.VEHICLE_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Agent,
			_AppUser,
			_CarRide,
			_City,
			_Driver,
			_HelpCentreCall,
			_IssueType,
			_Location,
			_LuxuryRide,
			_MotorRide,
			_NamedElement,
			_Payment,
			_PaymentType,
			_Ride,
			_RideStatus,
			_Rider,
			_TUber,
			_TicketStatus,
			_Vehicle,
			_VehicleType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Agent__Agent = new ExecutorFragment(Types._Agent, TuberTables.Types._Agent);
		private static final ExecutorFragment _Agent__NamedElement = new ExecutorFragment(Types._Agent, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _Agent__OclAny = new ExecutorFragment(Types._Agent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Agent__OclElement = new ExecutorFragment(Types._Agent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AppUser__AppUser = new ExecutorFragment(Types._AppUser, TuberTables.Types._AppUser);
		private static final ExecutorFragment _AppUser__NamedElement = new ExecutorFragment(Types._AppUser, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _AppUser__OclAny = new ExecutorFragment(Types._AppUser, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AppUser__OclElement = new ExecutorFragment(Types._AppUser, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CarRide__CarRide = new ExecutorFragment(Types._CarRide, TuberTables.Types._CarRide);
		private static final ExecutorFragment _CarRide__NamedElement = new ExecutorFragment(Types._CarRide, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _CarRide__OclAny = new ExecutorFragment(Types._CarRide, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CarRide__OclElement = new ExecutorFragment(Types._CarRide, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CarRide__Ride = new ExecutorFragment(Types._CarRide, TuberTables.Types._Ride);

		private static final ExecutorFragment _City__City = new ExecutorFragment(Types._City, TuberTables.Types._City);
		private static final ExecutorFragment _City__OclAny = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _City__OclElement = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _City__OclEnumeration = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _City__OclType = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Driver__AppUser = new ExecutorFragment(Types._Driver, TuberTables.Types._AppUser);
		private static final ExecutorFragment _Driver__Driver = new ExecutorFragment(Types._Driver, TuberTables.Types._Driver);
		private static final ExecutorFragment _Driver__NamedElement = new ExecutorFragment(Types._Driver, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _Driver__OclAny = new ExecutorFragment(Types._Driver, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Driver__OclElement = new ExecutorFragment(Types._Driver, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _HelpCentreCall__HelpCentreCall = new ExecutorFragment(Types._HelpCentreCall, TuberTables.Types._HelpCentreCall);
		private static final ExecutorFragment _HelpCentreCall__OclAny = new ExecutorFragment(Types._HelpCentreCall, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HelpCentreCall__OclElement = new ExecutorFragment(Types._HelpCentreCall, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IssueType__IssueType = new ExecutorFragment(Types._IssueType, TuberTables.Types._IssueType);
		private static final ExecutorFragment _IssueType__OclAny = new ExecutorFragment(Types._IssueType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IssueType__OclElement = new ExecutorFragment(Types._IssueType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IssueType__OclEnumeration = new ExecutorFragment(Types._IssueType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _IssueType__OclType = new ExecutorFragment(Types._IssueType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Location__Location = new ExecutorFragment(Types._Location, TuberTables.Types._Location);
		private static final ExecutorFragment _Location__OclAny = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Location__OclElement = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LuxuryRide__LuxuryRide = new ExecutorFragment(Types._LuxuryRide, TuberTables.Types._LuxuryRide);
		private static final ExecutorFragment _LuxuryRide__NamedElement = new ExecutorFragment(Types._LuxuryRide, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _LuxuryRide__OclAny = new ExecutorFragment(Types._LuxuryRide, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LuxuryRide__OclElement = new ExecutorFragment(Types._LuxuryRide, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LuxuryRide__Ride = new ExecutorFragment(Types._LuxuryRide, TuberTables.Types._Ride);

		private static final ExecutorFragment _MotorRide__MotorRide = new ExecutorFragment(Types._MotorRide, TuberTables.Types._MotorRide);
		private static final ExecutorFragment _MotorRide__NamedElement = new ExecutorFragment(Types._MotorRide, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _MotorRide__OclAny = new ExecutorFragment(Types._MotorRide, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MotorRide__OclElement = new ExecutorFragment(Types._MotorRide, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MotorRide__Ride = new ExecutorFragment(Types._MotorRide, TuberTables.Types._Ride);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Payment__OclAny = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Payment__OclElement = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Payment__Payment = new ExecutorFragment(Types._Payment, TuberTables.Types._Payment);

		private static final ExecutorFragment _PaymentType__OclAny = new ExecutorFragment(Types._PaymentType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentType__OclElement = new ExecutorFragment(Types._PaymentType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentType__OclEnumeration = new ExecutorFragment(Types._PaymentType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PaymentType__OclType = new ExecutorFragment(Types._PaymentType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PaymentType__PaymentType = new ExecutorFragment(Types._PaymentType, TuberTables.Types._PaymentType);

		private static final ExecutorFragment _Ride__NamedElement = new ExecutorFragment(Types._Ride, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _Ride__OclAny = new ExecutorFragment(Types._Ride, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ride__OclElement = new ExecutorFragment(Types._Ride, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Ride__Ride = new ExecutorFragment(Types._Ride, TuberTables.Types._Ride);

		private static final ExecutorFragment _RideStatus__OclAny = new ExecutorFragment(Types._RideStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RideStatus__OclElement = new ExecutorFragment(Types._RideStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RideStatus__OclEnumeration = new ExecutorFragment(Types._RideStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _RideStatus__OclType = new ExecutorFragment(Types._RideStatus, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _RideStatus__RideStatus = new ExecutorFragment(Types._RideStatus, TuberTables.Types._RideStatus);

		private static final ExecutorFragment _Rider__AppUser = new ExecutorFragment(Types._Rider, TuberTables.Types._AppUser);
		private static final ExecutorFragment _Rider__NamedElement = new ExecutorFragment(Types._Rider, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _Rider__OclAny = new ExecutorFragment(Types._Rider, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Rider__OclElement = new ExecutorFragment(Types._Rider, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Rider__Rider = new ExecutorFragment(Types._Rider, TuberTables.Types._Rider);

		private static final ExecutorFragment _TUber__NamedElement = new ExecutorFragment(Types._TUber, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _TUber__OclAny = new ExecutorFragment(Types._TUber, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TUber__OclElement = new ExecutorFragment(Types._TUber, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TUber__TUber = new ExecutorFragment(Types._TUber, TuberTables.Types._TUber);

		private static final ExecutorFragment _TicketStatus__OclAny = new ExecutorFragment(Types._TicketStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TicketStatus__OclElement = new ExecutorFragment(Types._TicketStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TicketStatus__OclEnumeration = new ExecutorFragment(Types._TicketStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TicketStatus__OclType = new ExecutorFragment(Types._TicketStatus, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TicketStatus__TicketStatus = new ExecutorFragment(Types._TicketStatus, TuberTables.Types._TicketStatus);

		private static final ExecutorFragment _Vehicle__NamedElement = new ExecutorFragment(Types._Vehicle, TuberTables.Types._NamedElement);
		private static final ExecutorFragment _Vehicle__OclAny = new ExecutorFragment(Types._Vehicle, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Vehicle__OclElement = new ExecutorFragment(Types._Vehicle, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Vehicle__Vehicle = new ExecutorFragment(Types._Vehicle, TuberTables.Types._Vehicle);

		private static final ExecutorFragment _VehicleType__OclAny = new ExecutorFragment(Types._VehicleType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VehicleType__OclElement = new ExecutorFragment(Types._VehicleType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VehicleType__OclEnumeration = new ExecutorFragment(Types._VehicleType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _VehicleType__OclType = new ExecutorFragment(Types._VehicleType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _VehicleType__VehicleType = new ExecutorFragment(Types._VehicleType, TuberTables.Types._VehicleType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Agent__city = new EcoreExecutorProperty(TuberPackage.Literals.AGENT__CITY, Types._Agent, 0);
		public static final ExecutorProperty _Agent__enrolls = new EcoreExecutorProperty(TuberPackage.Literals.AGENT__ENROLLS, Types._Agent, 1);
		public static final ExecutorProperty _Agent__hires = new EcoreExecutorProperty(TuberPackage.Literals.AGENT__HIRES, Types._Agent, 2);
		public static final ExecutorProperty _Agent__rides = new EcoreExecutorProperty(TuberPackage.Literals.AGENT__RIDES, Types._Agent, 3);
		public static final ExecutorProperty _Agent__TUber__agent = new ExecutorPropertyWithImplementation("TUber", Types._Agent, 4, new EcoreLibraryOppositeProperty(TuberPackage.Literals.TUBER__AGENT));

		public static final ExecutorProperty _AppUser__location = new EcoreExecutorProperty(TuberPackage.Literals.APP_USER__LOCATION, Types._AppUser, 0);
		public static final ExecutorProperty _AppUser__rating = new EcoreExecutorProperty(TuberPackage.Literals.APP_USER__RATING, Types._AppUser, 1);
		public static final ExecutorProperty _AppUser__status = new EcoreExecutorProperty(TuberPackage.Literals.APP_USER__STATUS, Types._AppUser, 2);
		public static final ExecutorProperty _AppUser__supportCall = new EcoreExecutorProperty(TuberPackage.Literals.APP_USER__SUPPORT_CALL, Types._AppUser, 3);

		public static final ExecutorProperty _CarRide__rate = new EcoreExecutorProperty(TuberPackage.Literals.CAR_RIDE__RATE, Types._CarRide, 0);

		public static final ExecutorProperty _Driver__earnings = new EcoreExecutorProperty(TuberPackage.Literals.DRIVER__EARNINGS, Types._Driver, 0);
		public static final ExecutorProperty _Driver__vehicle = new EcoreExecutorProperty(TuberPackage.Literals.DRIVER__VEHICLE, Types._Driver, 1);
		public static final ExecutorProperty _Driver__Agent__hires = new ExecutorPropertyWithImplementation("Agent", Types._Driver, 2, new EcoreLibraryOppositeProperty(TuberPackage.Literals.AGENT__HIRES));
		public static final ExecutorProperty _Driver__Ride__driver = new ExecutorPropertyWithImplementation("Ride", Types._Driver, 3, new EcoreLibraryOppositeProperty(TuberPackage.Literals.RIDE__DRIVER));

		public static final ExecutorProperty _HelpCentreCall__date = new EcoreExecutorProperty(TuberPackage.Literals.HELP_CENTRE_CALL__DATE, Types._HelpCentreCall, 0);
		public static final ExecutorProperty _HelpCentreCall__duration = new EcoreExecutorProperty(TuberPackage.Literals.HELP_CENTRE_CALL__DURATION, Types._HelpCentreCall, 1);
		public static final ExecutorProperty _HelpCentreCall__issue = new EcoreExecutorProperty(TuberPackage.Literals.HELP_CENTRE_CALL__ISSUE, Types._HelpCentreCall, 2);
		public static final ExecutorProperty _HelpCentreCall__ride = new EcoreExecutorProperty(TuberPackage.Literals.HELP_CENTRE_CALL__RIDE, Types._HelpCentreCall, 3);
		public static final ExecutorProperty _HelpCentreCall__status = new EcoreExecutorProperty(TuberPackage.Literals.HELP_CENTRE_CALL__STATUS, Types._HelpCentreCall, 4);
		public static final ExecutorProperty _HelpCentreCall__type = new EcoreExecutorProperty(TuberPackage.Literals.HELP_CENTRE_CALL__TYPE, Types._HelpCentreCall, 5);
		public static final ExecutorProperty _HelpCentreCall__AppUser__supportCall = new ExecutorPropertyWithImplementation("AppUser", Types._HelpCentreCall, 6, new EcoreLibraryOppositeProperty(TuberPackage.Literals.APP_USER__SUPPORT_CALL));

		public static final ExecutorProperty _Location__city = new EcoreExecutorProperty(TuberPackage.Literals.LOCATION__CITY, Types._Location, 0);
		public static final ExecutorProperty _Location__lat = new EcoreExecutorProperty(TuberPackage.Literals.LOCATION__LAT, Types._Location, 1);
		public static final ExecutorProperty _Location__long = new EcoreExecutorProperty(TuberPackage.Literals.LOCATION__LONG, Types._Location, 2);
		public static final ExecutorProperty _Location__AppUser__location = new ExecutorPropertyWithImplementation("AppUser", Types._Location, 3, new EcoreLibraryOppositeProperty(TuberPackage.Literals.APP_USER__LOCATION));

		public static final ExecutorProperty _LuxuryRide__rate = new EcoreExecutorProperty(TuberPackage.Literals.LUXURY_RIDE__RATE, Types._LuxuryRide, 0);

		public static final ExecutorProperty _MotorRide__rate = new EcoreExecutorProperty(TuberPackage.Literals.MOTOR_RIDE__RATE, Types._MotorRide, 0);

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(TuberPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Payment__ride = new EcoreExecutorProperty(TuberPackage.Literals.PAYMENT__RIDE, Types._Payment, 0);
		public static final ExecutorProperty _Payment__status = new EcoreExecutorProperty(TuberPackage.Literals.PAYMENT__STATUS, Types._Payment, 1);
		public static final ExecutorProperty _Payment__type = new EcoreExecutorProperty(TuberPackage.Literals.PAYMENT__TYPE, Types._Payment, 2);
		public static final ExecutorProperty _Payment__Rider__payment = new ExecutorPropertyWithImplementation("Rider", Types._Payment, 3, new EcoreLibraryOppositeProperty(TuberPackage.Literals.RIDER__PAYMENT));

		public static final ExecutorProperty _Ride__amount = new EcoreExecutorProperty(TuberPackage.Literals.RIDE__AMOUNT, Types._Ride, 0);
		public static final ExecutorProperty _Ride__customer = new EcoreExecutorProperty(TuberPackage.Literals.RIDE__CUSTOMER, Types._Ride, 1);
		public static final ExecutorProperty _Ride__date = new EcoreExecutorProperty(TuberPackage.Literals.RIDE__DATE, Types._Ride, 2);
		public static final ExecutorProperty _Ride__driver = new EcoreExecutorProperty(TuberPackage.Literals.RIDE__DRIVER, Types._Ride, 3);
		public static final ExecutorProperty _Ride__id = new EcoreExecutorProperty(TuberPackage.Literals.RIDE__ID, Types._Ride, 4);
		public static final ExecutorProperty _Ride__paid = new EcoreExecutorProperty(TuberPackage.Literals.RIDE__PAID, Types._Ride, 5);
		public static final ExecutorProperty _Ride__status = new EcoreExecutorProperty(TuberPackage.Literals.RIDE__STATUS, Types._Ride, 6);
		public static final ExecutorProperty _Ride__Agent__rides = new ExecutorPropertyWithImplementation("Agent", Types._Ride, 7, new EcoreLibraryOppositeProperty(TuberPackage.Literals.AGENT__RIDES));
		public static final ExecutorProperty _Ride__HelpCentreCall__ride = new ExecutorPropertyWithImplementation("HelpCentreCall", Types._Ride, 8, new EcoreLibraryOppositeProperty(TuberPackage.Literals.HELP_CENTRE_CALL__RIDE));
		public static final ExecutorProperty _Ride__Payment__ride = new ExecutorPropertyWithImplementation("Payment", Types._Ride, 9, new EcoreLibraryOppositeProperty(TuberPackage.Literals.PAYMENT__RIDE));

		public static final ExecutorProperty _Rider__payment = new EcoreExecutorProperty(TuberPackage.Literals.RIDER__PAYMENT, Types._Rider, 0);
		public static final ExecutorProperty _Rider__spendings = new EcoreExecutorProperty(TuberPackage.Literals.RIDER__SPENDINGS, Types._Rider, 1);
		public static final ExecutorProperty _Rider__Agent__enrolls = new ExecutorPropertyWithImplementation("Agent", Types._Rider, 2, new EcoreLibraryOppositeProperty(TuberPackage.Literals.AGENT__ENROLLS));
		public static final ExecutorProperty _Rider__Ride__customer = new ExecutorPropertyWithImplementation("Ride", Types._Rider, 3, new EcoreLibraryOppositeProperty(TuberPackage.Literals.RIDE__CUSTOMER));

		public static final ExecutorProperty _TUber__agent = new EcoreExecutorProperty(TuberPackage.Literals.TUBER__AGENT, Types._TUber, 0);

		public static final ExecutorProperty _Vehicle__capacity = new EcoreExecutorProperty(TuberPackage.Literals.VEHICLE__CAPACITY, Types._Vehicle, 0);
		public static final ExecutorProperty _Vehicle__sharing = new EcoreExecutorProperty(TuberPackage.Literals.VEHICLE__SHARING, Types._Vehicle, 1);
		public static final ExecutorProperty _Vehicle__type = new EcoreExecutorProperty(TuberPackage.Literals.VEHICLE__TYPE, Types._Vehicle, 2);
		public static final ExecutorProperty _Vehicle__Driver__vehicle = new ExecutorPropertyWithImplementation("Driver", Types._Vehicle, 3, new EcoreLibraryOppositeProperty(TuberPackage.Literals.DRIVER__VEHICLE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Agent =
			{
				Fragments._Agent__OclAny /* 0 */,
				Fragments._Agent__OclElement /* 1 */,
				Fragments._Agent__NamedElement /* 2 */,
				Fragments._Agent__Agent /* 3 */
			};
		private static final int /*@NonNull*/ [] __Agent = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AppUser =
			{
				Fragments._AppUser__OclAny /* 0 */,
				Fragments._AppUser__OclElement /* 1 */,
				Fragments._AppUser__NamedElement /* 2 */,
				Fragments._AppUser__AppUser /* 3 */
			};
		private static final int /*@NonNull*/ [] __AppUser = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CarRide =
			{
				Fragments._CarRide__OclAny /* 0 */,
				Fragments._CarRide__OclElement /* 1 */,
				Fragments._CarRide__NamedElement /* 2 */,
				Fragments._CarRide__Ride /* 3 */,
				Fragments._CarRide__CarRide /* 4 */
			};
		private static final int /*@NonNull*/ [] __CarRide = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _City =
			{
				Fragments._City__OclAny /* 0 */,
				Fragments._City__OclElement /* 1 */,
				Fragments._City__OclType /* 2 */,
				Fragments._City__OclEnumeration /* 3 */,
				Fragments._City__City /* 4 */
			};
		private static final int /*@NonNull*/ [] __City = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Driver =
			{
				Fragments._Driver__OclAny /* 0 */,
				Fragments._Driver__OclElement /* 1 */,
				Fragments._Driver__NamedElement /* 2 */,
				Fragments._Driver__AppUser /* 3 */,
				Fragments._Driver__Driver /* 4 */
			};
		private static final int /*@NonNull*/ [] __Driver = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _HelpCentreCall =
			{
				Fragments._HelpCentreCall__OclAny /* 0 */,
				Fragments._HelpCentreCall__OclElement /* 1 */,
				Fragments._HelpCentreCall__HelpCentreCall /* 2 */
			};
		private static final int /*@NonNull*/ [] __HelpCentreCall = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IssueType =
			{
				Fragments._IssueType__OclAny /* 0 */,
				Fragments._IssueType__OclElement /* 1 */,
				Fragments._IssueType__OclType /* 2 */,
				Fragments._IssueType__OclEnumeration /* 3 */,
				Fragments._IssueType__IssueType /* 4 */
			};
		private static final int /*@NonNull*/ [] __IssueType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Location =
			{
				Fragments._Location__OclAny /* 0 */,
				Fragments._Location__OclElement /* 1 */,
				Fragments._Location__Location /* 2 */
			};
		private static final int /*@NonNull*/ [] __Location = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LuxuryRide =
			{
				Fragments._LuxuryRide__OclAny /* 0 */,
				Fragments._LuxuryRide__OclElement /* 1 */,
				Fragments._LuxuryRide__NamedElement /* 2 */,
				Fragments._LuxuryRide__Ride /* 3 */,
				Fragments._LuxuryRide__LuxuryRide /* 4 */
			};
		private static final int /*@NonNull*/ [] __LuxuryRide = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MotorRide =
			{
				Fragments._MotorRide__OclAny /* 0 */,
				Fragments._MotorRide__OclElement /* 1 */,
				Fragments._MotorRide__NamedElement /* 2 */,
				Fragments._MotorRide__Ride /* 3 */,
				Fragments._MotorRide__MotorRide /* 4 */
			};
		private static final int /*@NonNull*/ [] __MotorRide = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Payment =
			{
				Fragments._Payment__OclAny /* 0 */,
				Fragments._Payment__OclElement /* 1 */,
				Fragments._Payment__Payment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Payment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentType =
			{
				Fragments._PaymentType__OclAny /* 0 */,
				Fragments._PaymentType__OclElement /* 1 */,
				Fragments._PaymentType__OclType /* 2 */,
				Fragments._PaymentType__OclEnumeration /* 3 */,
				Fragments._PaymentType__PaymentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PaymentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Ride =
			{
				Fragments._Ride__OclAny /* 0 */,
				Fragments._Ride__OclElement /* 1 */,
				Fragments._Ride__NamedElement /* 2 */,
				Fragments._Ride__Ride /* 3 */
			};
		private static final int /*@NonNull*/ [] __Ride = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RideStatus =
			{
				Fragments._RideStatus__OclAny /* 0 */,
				Fragments._RideStatus__OclElement /* 1 */,
				Fragments._RideStatus__OclType /* 2 */,
				Fragments._RideStatus__OclEnumeration /* 3 */,
				Fragments._RideStatus__RideStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __RideStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Rider =
			{
				Fragments._Rider__OclAny /* 0 */,
				Fragments._Rider__OclElement /* 1 */,
				Fragments._Rider__NamedElement /* 2 */,
				Fragments._Rider__AppUser /* 3 */,
				Fragments._Rider__Rider /* 4 */
			};
		private static final int /*@NonNull*/ [] __Rider = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TUber =
			{
				Fragments._TUber__OclAny /* 0 */,
				Fragments._TUber__OclElement /* 1 */,
				Fragments._TUber__NamedElement /* 2 */,
				Fragments._TUber__TUber /* 3 */
			};
		private static final int /*@NonNull*/ [] __TUber = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TicketStatus =
			{
				Fragments._TicketStatus__OclAny /* 0 */,
				Fragments._TicketStatus__OclElement /* 1 */,
				Fragments._TicketStatus__OclType /* 2 */,
				Fragments._TicketStatus__OclEnumeration /* 3 */,
				Fragments._TicketStatus__TicketStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __TicketStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Vehicle =
			{
				Fragments._Vehicle__OclAny /* 0 */,
				Fragments._Vehicle__OclElement /* 1 */,
				Fragments._Vehicle__NamedElement /* 2 */,
				Fragments._Vehicle__Vehicle /* 3 */
			};
		private static final int /*@NonNull*/ [] __Vehicle = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VehicleType =
			{
				Fragments._VehicleType__OclAny /* 0 */,
				Fragments._VehicleType__OclElement /* 1 */,
				Fragments._VehicleType__OclType /* 2 */,
				Fragments._VehicleType__OclEnumeration /* 3 */,
				Fragments._VehicleType__VehicleType /* 4 */
			};
		private static final int /*@NonNull*/ [] __VehicleType = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Agent.initFragments(_Agent, __Agent);
			Types._AppUser.initFragments(_AppUser, __AppUser);
			Types._CarRide.initFragments(_CarRide, __CarRide);
			Types._City.initFragments(_City, __City);
			Types._Driver.initFragments(_Driver, __Driver);
			Types._HelpCentreCall.initFragments(_HelpCentreCall, __HelpCentreCall);
			Types._IssueType.initFragments(_IssueType, __IssueType);
			Types._Location.initFragments(_Location, __Location);
			Types._LuxuryRide.initFragments(_LuxuryRide, __LuxuryRide);
			Types._MotorRide.initFragments(_MotorRide, __MotorRide);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Payment.initFragments(_Payment, __Payment);
			Types._PaymentType.initFragments(_PaymentType, __PaymentType);
			Types._Ride.initFragments(_Ride, __Ride);
			Types._RideStatus.initFragments(_RideStatus, __RideStatus);
			Types._Rider.initFragments(_Rider, __Rider);
			Types._TUber.initFragments(_TUber, __TUber);
			Types._TicketStatus.initFragments(_TicketStatus, __TicketStatus);
			Types._Vehicle.initFragments(_Vehicle, __Vehicle);
			Types._VehicleType.initFragments(_VehicleType, __VehicleType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Agent__Agent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Agent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Agent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Agent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AppUser__AppUser = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AppUser__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AppUser__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AppUser__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CarRide__CarRide = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CarRide__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CarRide__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CarRide__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CarRide__Ride = {};

		private static final ExecutorOperation /*@NonNull*/ [] _City__City = {};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Driver__Driver = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Driver__AppUser = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Driver__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Driver__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Driver__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _HelpCentreCall__HelpCentreCall = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HelpCentreCall__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HelpCentreCall__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IssueType__IssueType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IssueType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IssueType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IssueType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IssueType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Location__Location = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LuxuryRide__LuxuryRide = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LuxuryRide__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LuxuryRide__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LuxuryRide__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LuxuryRide__Ride = {};

		private static final ExecutorOperation /*@NonNull*/ [] _MotorRide__MotorRide = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MotorRide__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MotorRide__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MotorRide__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MotorRide__Ride = {};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Payment__Payment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__PaymentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Ride__Ride = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ride__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ride__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Ride__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RideStatus__RideStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RideStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RideStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RideStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RideStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Rider__Rider = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Rider__AppUser = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Rider__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Rider__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Rider__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TUber__TUber = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TUber__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TUber__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TUber__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TicketStatus__TicketStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TicketStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TicketStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TicketStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TicketStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Vehicle__Vehicle = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Vehicle__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Vehicle__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Vehicle__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VehicleType__VehicleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VehicleType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VehicleType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VehicleType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VehicleType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agent__Agent.initOperations(_Agent__Agent);
			Fragments._Agent__NamedElement.initOperations(_Agent__NamedElement);
			Fragments._Agent__OclAny.initOperations(_Agent__OclAny);
			Fragments._Agent__OclElement.initOperations(_Agent__OclElement);

			Fragments._AppUser__AppUser.initOperations(_AppUser__AppUser);
			Fragments._AppUser__NamedElement.initOperations(_AppUser__NamedElement);
			Fragments._AppUser__OclAny.initOperations(_AppUser__OclAny);
			Fragments._AppUser__OclElement.initOperations(_AppUser__OclElement);

			Fragments._CarRide__CarRide.initOperations(_CarRide__CarRide);
			Fragments._CarRide__NamedElement.initOperations(_CarRide__NamedElement);
			Fragments._CarRide__OclAny.initOperations(_CarRide__OclAny);
			Fragments._CarRide__OclElement.initOperations(_CarRide__OclElement);
			Fragments._CarRide__Ride.initOperations(_CarRide__Ride);

			Fragments._City__City.initOperations(_City__City);
			Fragments._City__OclAny.initOperations(_City__OclAny);
			Fragments._City__OclElement.initOperations(_City__OclElement);
			Fragments._City__OclEnumeration.initOperations(_City__OclEnumeration);
			Fragments._City__OclType.initOperations(_City__OclType);

			Fragments._Driver__AppUser.initOperations(_Driver__AppUser);
			Fragments._Driver__Driver.initOperations(_Driver__Driver);
			Fragments._Driver__NamedElement.initOperations(_Driver__NamedElement);
			Fragments._Driver__OclAny.initOperations(_Driver__OclAny);
			Fragments._Driver__OclElement.initOperations(_Driver__OclElement);

			Fragments._HelpCentreCall__HelpCentreCall.initOperations(_HelpCentreCall__HelpCentreCall);
			Fragments._HelpCentreCall__OclAny.initOperations(_HelpCentreCall__OclAny);
			Fragments._HelpCentreCall__OclElement.initOperations(_HelpCentreCall__OclElement);

			Fragments._IssueType__IssueType.initOperations(_IssueType__IssueType);
			Fragments._IssueType__OclAny.initOperations(_IssueType__OclAny);
			Fragments._IssueType__OclElement.initOperations(_IssueType__OclElement);
			Fragments._IssueType__OclEnumeration.initOperations(_IssueType__OclEnumeration);
			Fragments._IssueType__OclType.initOperations(_IssueType__OclType);

			Fragments._Location__Location.initOperations(_Location__Location);
			Fragments._Location__OclAny.initOperations(_Location__OclAny);
			Fragments._Location__OclElement.initOperations(_Location__OclElement);

			Fragments._LuxuryRide__LuxuryRide.initOperations(_LuxuryRide__LuxuryRide);
			Fragments._LuxuryRide__NamedElement.initOperations(_LuxuryRide__NamedElement);
			Fragments._LuxuryRide__OclAny.initOperations(_LuxuryRide__OclAny);
			Fragments._LuxuryRide__OclElement.initOperations(_LuxuryRide__OclElement);
			Fragments._LuxuryRide__Ride.initOperations(_LuxuryRide__Ride);

			Fragments._MotorRide__MotorRide.initOperations(_MotorRide__MotorRide);
			Fragments._MotorRide__NamedElement.initOperations(_MotorRide__NamedElement);
			Fragments._MotorRide__OclAny.initOperations(_MotorRide__OclAny);
			Fragments._MotorRide__OclElement.initOperations(_MotorRide__OclElement);
			Fragments._MotorRide__Ride.initOperations(_MotorRide__Ride);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Payment__OclAny.initOperations(_Payment__OclAny);
			Fragments._Payment__OclElement.initOperations(_Payment__OclElement);
			Fragments._Payment__Payment.initOperations(_Payment__Payment);

			Fragments._PaymentType__OclAny.initOperations(_PaymentType__OclAny);
			Fragments._PaymentType__OclElement.initOperations(_PaymentType__OclElement);
			Fragments._PaymentType__OclEnumeration.initOperations(_PaymentType__OclEnumeration);
			Fragments._PaymentType__OclType.initOperations(_PaymentType__OclType);
			Fragments._PaymentType__PaymentType.initOperations(_PaymentType__PaymentType);

			Fragments._Ride__NamedElement.initOperations(_Ride__NamedElement);
			Fragments._Ride__OclAny.initOperations(_Ride__OclAny);
			Fragments._Ride__OclElement.initOperations(_Ride__OclElement);
			Fragments._Ride__Ride.initOperations(_Ride__Ride);

			Fragments._RideStatus__OclAny.initOperations(_RideStatus__OclAny);
			Fragments._RideStatus__OclElement.initOperations(_RideStatus__OclElement);
			Fragments._RideStatus__OclEnumeration.initOperations(_RideStatus__OclEnumeration);
			Fragments._RideStatus__OclType.initOperations(_RideStatus__OclType);
			Fragments._RideStatus__RideStatus.initOperations(_RideStatus__RideStatus);

			Fragments._Rider__AppUser.initOperations(_Rider__AppUser);
			Fragments._Rider__NamedElement.initOperations(_Rider__NamedElement);
			Fragments._Rider__OclAny.initOperations(_Rider__OclAny);
			Fragments._Rider__OclElement.initOperations(_Rider__OclElement);
			Fragments._Rider__Rider.initOperations(_Rider__Rider);

			Fragments._TUber__NamedElement.initOperations(_TUber__NamedElement);
			Fragments._TUber__OclAny.initOperations(_TUber__OclAny);
			Fragments._TUber__OclElement.initOperations(_TUber__OclElement);
			Fragments._TUber__TUber.initOperations(_TUber__TUber);

			Fragments._TicketStatus__OclAny.initOperations(_TicketStatus__OclAny);
			Fragments._TicketStatus__OclElement.initOperations(_TicketStatus__OclElement);
			Fragments._TicketStatus__OclEnumeration.initOperations(_TicketStatus__OclEnumeration);
			Fragments._TicketStatus__OclType.initOperations(_TicketStatus__OclType);
			Fragments._TicketStatus__TicketStatus.initOperations(_TicketStatus__TicketStatus);

			Fragments._Vehicle__NamedElement.initOperations(_Vehicle__NamedElement);
			Fragments._Vehicle__OclAny.initOperations(_Vehicle__OclAny);
			Fragments._Vehicle__OclElement.initOperations(_Vehicle__OclElement);
			Fragments._Vehicle__Vehicle.initOperations(_Vehicle__Vehicle);

			Fragments._VehicleType__OclAny.initOperations(_VehicleType__OclAny);
			Fragments._VehicleType__OclElement.initOperations(_VehicleType__OclElement);
			Fragments._VehicleType__OclEnumeration.initOperations(_VehicleType__OclEnumeration);
			Fragments._VehicleType__OclType.initOperations(_VehicleType__OclType);
			Fragments._VehicleType__VehicleType.initOperations(_VehicleType__VehicleType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Agent = {
			TuberTables.Properties._Agent__city,
			TuberTables.Properties._Agent__enrolls,
			TuberTables.Properties._Agent__hires,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._Agent__rides
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AppUser = {
			TuberTables.Properties._AppUser__location,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._AppUser__rating,
			TuberTables.Properties._AppUser__status,
			TuberTables.Properties._AppUser__supportCall
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CarRide = {
			TuberTables.Properties._Ride__amount,
			TuberTables.Properties._Ride__customer,
			TuberTables.Properties._Ride__date,
			TuberTables.Properties._Ride__driver,
			TuberTables.Properties._Ride__id,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._Ride__paid,
			TuberTables.Properties._CarRide__rate,
			TuberTables.Properties._Ride__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _City = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Driver = {
			TuberTables.Properties._Driver__earnings,
			TuberTables.Properties._AppUser__location,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._AppUser__rating,
			TuberTables.Properties._AppUser__status,
			TuberTables.Properties._AppUser__supportCall,
			TuberTables.Properties._Driver__vehicle
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HelpCentreCall = {
			TuberTables.Properties._HelpCentreCall__date,
			TuberTables.Properties._HelpCentreCall__duration,
			TuberTables.Properties._HelpCentreCall__issue,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._HelpCentreCall__ride,
			TuberTables.Properties._HelpCentreCall__status,
			TuberTables.Properties._HelpCentreCall__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IssueType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Location = {
			TuberTables.Properties._Location__city,
			TuberTables.Properties._Location__lat,
			TuberTables.Properties._Location__long,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LuxuryRide = {
			TuberTables.Properties._Ride__amount,
			TuberTables.Properties._Ride__customer,
			TuberTables.Properties._Ride__date,
			TuberTables.Properties._Ride__driver,
			TuberTables.Properties._Ride__id,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._Ride__paid,
			TuberTables.Properties._LuxuryRide__rate,
			TuberTables.Properties._Ride__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MotorRide = {
			TuberTables.Properties._Ride__amount,
			TuberTables.Properties._Ride__customer,
			TuberTables.Properties._Ride__date,
			TuberTables.Properties._Ride__driver,
			TuberTables.Properties._Ride__id,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._Ride__paid,
			TuberTables.Properties._MotorRide__rate,
			TuberTables.Properties._Ride__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Payment = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._Payment__ride,
			TuberTables.Properties._Payment__status,
			TuberTables.Properties._Payment__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Ride = {
			TuberTables.Properties._Ride__amount,
			TuberTables.Properties._Ride__customer,
			TuberTables.Properties._Ride__date,
			TuberTables.Properties._Ride__driver,
			TuberTables.Properties._Ride__id,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._Ride__paid,
			TuberTables.Properties._Ride__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RideStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Rider = {
			TuberTables.Properties._AppUser__location,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._Rider__payment,
			TuberTables.Properties._AppUser__rating,
			TuberTables.Properties._Rider__spendings,
			TuberTables.Properties._AppUser__status,
			TuberTables.Properties._AppUser__supportCall
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TUber = {
			TuberTables.Properties._TUber__agent,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TicketStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Vehicle = {
			TuberTables.Properties._Vehicle__capacity,
			TuberTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TuberTables.Properties._Vehicle__sharing,
			TuberTables.Properties._Vehicle__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VehicleType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agent__Agent.initProperties(_Agent);
			Fragments._AppUser__AppUser.initProperties(_AppUser);
			Fragments._CarRide__CarRide.initProperties(_CarRide);
			Fragments._City__City.initProperties(_City);
			Fragments._Driver__Driver.initProperties(_Driver);
			Fragments._HelpCentreCall__HelpCentreCall.initProperties(_HelpCentreCall);
			Fragments._IssueType__IssueType.initProperties(_IssueType);
			Fragments._Location__Location.initProperties(_Location);
			Fragments._LuxuryRide__LuxuryRide.initProperties(_LuxuryRide);
			Fragments._MotorRide__MotorRide.initProperties(_MotorRide);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Payment__Payment.initProperties(_Payment);
			Fragments._PaymentType__PaymentType.initProperties(_PaymentType);
			Fragments._Ride__Ride.initProperties(_Ride);
			Fragments._RideStatus__RideStatus.initProperties(_RideStatus);
			Fragments._Rider__Rider.initProperties(_Rider);
			Fragments._TUber__TUber.initProperties(_TUber);
			Fragments._TicketStatus__TicketStatus.initProperties(_TicketStatus);
			Fragments._Vehicle__Vehicle.initProperties(_Vehicle);
			Fragments._VehicleType__VehicleType.initProperties(_VehicleType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _City__WIEN = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.CITY.getEEnumLiteral("WIEN"), Types._City, 0);
		public static final EcoreExecutorEnumerationLiteral _City__SALZBURG = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.CITY.getEEnumLiteral("SALZBURG"), Types._City, 1);
		public static final EcoreExecutorEnumerationLiteral _City__LINZ = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.CITY.getEEnumLiteral("LINZ"), Types._City, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _City = {
			_City__WIEN,
			_City__SALZBURG,
			_City__LINZ
		};

		public static final EcoreExecutorEnumerationLiteral _IssueType__PAYMENT = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.ISSUE_TYPE.getEEnumLiteral("PAYMENT"), Types._IssueType, 0);
		public static final EcoreExecutorEnumerationLiteral _IssueType__SAFETY = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.ISSUE_TYPE.getEEnumLiteral("SAFETY"), Types._IssueType, 1);
		public static final EcoreExecutorEnumerationLiteral _IssueType__ACCOUNT = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.ISSUE_TYPE.getEEnumLiteral("ACCOUNT"), Types._IssueType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _IssueType = {
			_IssueType__PAYMENT,
			_IssueType__SAFETY,
			_IssueType__ACCOUNT
		};

		public static final EcoreExecutorEnumerationLiteral _PaymentType__CREDITCARD = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.PAYMENT_TYPE.getEEnumLiteral("CREDITCARD"), Types._PaymentType, 0);
		public static final EcoreExecutorEnumerationLiteral _PaymentType__APPLEPAY = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.PAYMENT_TYPE.getEEnumLiteral("APPLEPAY"), Types._PaymentType, 1);
		public static final EcoreExecutorEnumerationLiteral _PaymentType__PAYPAL = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.PAYMENT_TYPE.getEEnumLiteral("PAYPAL"), Types._PaymentType, 2);
		public static final EcoreExecutorEnumerationLiteral _PaymentType__CASH = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.PAYMENT_TYPE.getEEnumLiteral("CASH"), Types._PaymentType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PaymentType = {
			_PaymentType__CREDITCARD,
			_PaymentType__APPLEPAY,
			_PaymentType__PAYPAL,
			_PaymentType__CASH
		};

		public static final EcoreExecutorEnumerationLiteral _RideStatus__IDLE = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.RIDE_STATUS.getEEnumLiteral("IDLE"), Types._RideStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _RideStatus__ONGOING = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.RIDE_STATUS.getEEnumLiteral("ONGOING"), Types._RideStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _RideStatus__REQUESTED = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.RIDE_STATUS.getEEnumLiteral("REQUESTED"), Types._RideStatus, 2);
		public static final EcoreExecutorEnumerationLiteral _RideStatus__COMPLETED = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.RIDE_STATUS.getEEnumLiteral("COMPLETED"), Types._RideStatus, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _RideStatus = {
			_RideStatus__IDLE,
			_RideStatus__ONGOING,
			_RideStatus__REQUESTED,
			_RideStatus__COMPLETED
		};

		public static final EcoreExecutorEnumerationLiteral _TicketStatus__RESOLVED = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.TICKET_STATUS.getEEnumLiteral("RESOLVED"), Types._TicketStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _TicketStatus__PENDING = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.TICKET_STATUS.getEEnumLiteral("PENDING"), Types._TicketStatus, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TicketStatus = {
			_TicketStatus__RESOLVED,
			_TicketStatus__PENDING
		};

		public static final EcoreExecutorEnumerationLiteral _VehicleType__MOTORBIKE = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.VEHICLE_TYPE.getEEnumLiteral("MOTORBIKE"), Types._VehicleType, 0);
		public static final EcoreExecutorEnumerationLiteral _VehicleType__CAR = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.VEHICLE_TYPE.getEEnumLiteral("CAR"), Types._VehicleType, 1);
		public static final EcoreExecutorEnumerationLiteral _VehicleType__LUXURY = new EcoreExecutorEnumerationLiteral(TuberPackage.Literals.VEHICLE_TYPE.getEEnumLiteral("LUXURY"), Types._VehicleType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VehicleType = {
			_VehicleType__MOTORBIKE,
			_VehicleType__CAR,
			_VehicleType__LUXURY
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._City.initLiterals(_City);
			Types._IssueType.initLiterals(_IssueType);
			Types._PaymentType.initLiterals(_PaymentType);
			Types._RideStatus.initLiterals(_RideStatus);
			Types._TicketStatus.initLiterals(_TicketStatus);
			Types._VehicleType.initLiterals(_VehicleType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TuberTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new TuberTables();
	}

	private TuberTables() {
		super(TuberPackage.eNS_URI);
	}
}
