/**
 */
package tuber;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Agent#getRides <em>Rides</em>}</li>
 *   <li>{@link tuber.Agent#getHires <em>Hires</em>}</li>
 *   <li>{@link tuber.Agent#getEnrolls <em>Enrolls</em>}</li>
 *   <li>{@link tuber.Agent#getCity <em>City</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Rides</b></em>' containment reference list.
	 * The list contents are of type {@link tuber.Ride}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rides</em>' containment reference list.
	 * @see tuber.TuberPackage#getAgent_Rides()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ride> getRides();

	/**
	 * Returns the value of the '<em><b>Hires</b></em>' containment reference list.
	 * The list contents are of type {@link tuber.Driver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hires</em>' containment reference list.
	 * @see tuber.TuberPackage#getAgent_Hires()
	 * @model containment="true"
	 * @generated
	 */
	EList<Driver> getHires();

	/**
	 * Returns the value of the '<em><b>Enrolls</b></em>' containment reference list.
	 * The list contents are of type {@link tuber.Rider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolls</em>' containment reference list.
	 * @see tuber.TuberPackage#getAgent_Enrolls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rider> getEnrolls();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * The literals are from the enumeration {@link tuber.City}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see tuber.City
	 * @see #setCity(City)
	 * @see tuber.TuberPackage#getAgent_City()
	 * @model required="true"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link tuber.Agent#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see tuber.City
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

} // Agent
