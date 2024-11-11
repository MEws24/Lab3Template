/**
 */
package tuber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Vehicle#getType <em>Type</em>}</li>
 *   <li>{@link tuber.Vehicle#isSharing <em>Sharing</em>}</li>
 *   <li>{@link tuber.Vehicle#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"CAR"</code>.
	 * The literals are from the enumeration {@link tuber.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tuber.VehicleType
	 * @see #setType(VehicleType)
	 * @see tuber.TuberPackage#getVehicle_Type()
	 * @model default="CAR" required="true"
	 * @generated
	 */
	VehicleType getType();

	/**
	 * Sets the value of the '{@link tuber.Vehicle#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tuber.VehicleType
	 * @see #getType()
	 * @generated
	 */
	void setType(VehicleType value);

	/**
	 * Returns the value of the '<em><b>Sharing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharing</em>' attribute.
	 * @see #setSharing(boolean)
	 * @see tuber.TuberPackage#getVehicle_Sharing()
	 * @model required="true"
	 * @generated
	 */
	boolean isSharing();

	/**
	 * Sets the value of the '{@link tuber.Vehicle#isSharing <em>Sharing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharing</em>' attribute.
	 * @see #isSharing()
	 * @generated
	 */
	void setSharing(boolean value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see tuber.TuberPackage#getVehicle_Capacity()
	 * @model required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link tuber.Vehicle#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Vehicle
