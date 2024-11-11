/**
 */
package tuber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luxury Ride</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.LuxuryRide#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getLuxuryRide()
 * @model
 * @generated
 */
public interface LuxuryRide extends Ride {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(float)
	 * @see tuber.TuberPackage#getLuxuryRide_Rate()
	 * @model default="10.0" required="true"
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link tuber.LuxuryRide#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

} // LuxuryRide
