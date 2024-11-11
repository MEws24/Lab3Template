/**
 */
package tuber;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tuber.TuberPackage
 * @generated
 */
public interface TuberFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TuberFactory eINSTANCE = tuber.impl.TuberFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Rider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rider</em>'.
	 * @generated
	 */
	Rider createRider();

	/**
	 * Returns a new object of class '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Driver</em>'.
	 * @generated
	 */
	Driver createDriver();

	/**
	 * Returns a new object of class '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment</em>'.
	 * @generated
	 */
	Payment createPayment();

	/**
	 * Returns a new object of class '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle</em>'.
	 * @generated
	 */
	Vehicle createVehicle();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Motor Ride</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motor Ride</em>'.
	 * @generated
	 */
	MotorRide createMotorRide();

	/**
	 * Returns a new object of class '<em>Car Ride</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Car Ride</em>'.
	 * @generated
	 */
	CarRide createCarRide();

	/**
	 * Returns a new object of class '<em>Luxury Ride</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Luxury Ride</em>'.
	 * @generated
	 */
	LuxuryRide createLuxuryRide();

	/**
	 * Returns a new object of class '<em>Help Centre Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Help Centre Call</em>'.
	 * @generated
	 */
	HelpCentreCall createHelpCentreCall();

	/**
	 * Returns a new object of class '<em>TUber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TUber</em>'.
	 * @generated
	 */
	TUber createTUber();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TuberPackage getTuberPackage();

} //TuberFactory
