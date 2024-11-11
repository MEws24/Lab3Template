/**
 */
package tuber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Location#getLong <em>Long</em>}</li>
 *   <li>{@link tuber.Location#getLat <em>Lat</em>}</li>
 *   <li>{@link tuber.Location#getCity <em>City</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(float)
	 * @see tuber.TuberPackage#getLocation_Long()
	 * @model required="true"
	 * @generated
	 */
	float getLong();

	/**
	 * Sets the value of the '{@link tuber.Location#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(float value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(float)
	 * @see tuber.TuberPackage#getLocation_Lat()
	 * @model required="true"
	 * @generated
	 */
	float getLat();

	/**
	 * Sets the value of the '{@link tuber.Location#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(float value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * The literals are from the enumeration {@link tuber.City}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see tuber.City
	 * @see #setCity(City)
	 * @see tuber.TuberPackage#getLocation_City()
	 * @model required="true"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link tuber.Location#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see tuber.City
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

} // Location
