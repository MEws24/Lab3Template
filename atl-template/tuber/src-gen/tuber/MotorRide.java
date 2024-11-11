/**
 */
package tuber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor Ride</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.MotorRide#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getMotorRide()
 * @model
 * @generated
 */
public interface MotorRide extends Ride {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(float)
	 * @see tuber.TuberPackage#getMotorRide_Rate()
	 * @model default="2.0" required="true"
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link tuber.MotorRide#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

} // MotorRide
