/**
 */
package tuber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car Ride</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.CarRide#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getCarRide()
 * @model
 * @generated
 */
public interface CarRide extends Ride {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"4.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(float)
	 * @see tuber.TuberPackage#getCarRide_Rate()
	 * @model default="4.0" required="true"
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link tuber.CarRide#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

} // CarRide
