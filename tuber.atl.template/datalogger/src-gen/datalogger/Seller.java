/**
 */
package datalogger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datalogger.Seller#getOwns <em>Owns</em>}</li>
 *   <li>{@link datalogger.Seller#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link datalogger.Seller#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see datalogger.DataloggerPackage#getSeller()
 * @model
 * @generated
 */
public interface Seller extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owns</b></em>' containment reference list.
	 * The list contents are of type {@link datalogger.Sellable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' containment reference list.
	 * @see datalogger.DataloggerPackage#getSeller_Owns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sellable> getOwns();

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' attribute.
	 * @see #setRevenue(float)
	 * @see datalogger.DataloggerPackage#getSeller_Revenue()
	 * @model required="true"
	 * @generated
	 */
	float getRevenue();

	/**
	 * Sets the value of the '{@link datalogger.Seller#getRevenue <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' attribute.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(float value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see datalogger.DataloggerPackage#getSeller_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link datalogger.Seller#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // Seller
