/**
 */
package tuber.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tuber.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tuber.TuberPackage
 * @generated
 */
public class TuberAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TuberPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TuberPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberSwitch<Adapter> modelSwitch = new TuberSwitch<Adapter>() {
		@Override
		public Adapter caseAgent(Agent object) {
			return createAgentAdapter();
		}

		@Override
		public Adapter caseRider(Rider object) {
			return createRiderAdapter();
		}

		@Override
		public Adapter caseDriver(Driver object) {
			return createDriverAdapter();
		}

		@Override
		public Adapter caseAppUser(AppUser object) {
			return createAppUserAdapter();
		}

		@Override
		public Adapter caseRide(Ride object) {
			return createRideAdapter();
		}

		@Override
		public Adapter casePayment(Payment object) {
			return createPaymentAdapter();
		}

		@Override
		public Adapter caseVehicle(Vehicle object) {
			return createVehicleAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseMotorRide(MotorRide object) {
			return createMotorRideAdapter();
		}

		@Override
		public Adapter caseCarRide(CarRide object) {
			return createCarRideAdapter();
		}

		@Override
		public Adapter caseLuxuryRide(LuxuryRide object) {
			return createLuxuryRideAdapter();
		}

		@Override
		public Adapter caseHelpCentreCall(HelpCentreCall object) {
			return createHelpCentreCallAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseTUber(TUber object) {
			return createTUberAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.Rider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.Rider
	 * @generated
	 */
	public Adapter createRiderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.Driver
	 * @generated
	 */
	public Adapter createDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.AppUser <em>App User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.AppUser
	 * @generated
	 */
	public Adapter createAppUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.Ride <em>Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.Ride
	 * @generated
	 */
	public Adapter createRideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.Payment
	 * @generated
	 */
	public Adapter createPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.MotorRide <em>Motor Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.MotorRide
	 * @generated
	 */
	public Adapter createMotorRideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.CarRide <em>Car Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.CarRide
	 * @generated
	 */
	public Adapter createCarRideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.LuxuryRide <em>Luxury Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.LuxuryRide
	 * @generated
	 */
	public Adapter createLuxuryRideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.HelpCentreCall <em>Help Centre Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.HelpCentreCall
	 * @generated
	 */
	public Adapter createHelpCentreCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tuber.TUber <em>TUber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tuber.TUber
	 * @generated
	 */
	public Adapter createTUberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TuberAdapterFactory
