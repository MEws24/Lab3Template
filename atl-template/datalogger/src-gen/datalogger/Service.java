/**
 */
package datalogger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datalogger.Service#isSharable <em>Sharable</em>}</li>
 * </ul>
 *
 * @see datalogger.DataloggerPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Sellable {
	/**
	 * Returns the value of the '<em><b>Sharable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharable</em>' attribute.
	 * @see #setSharable(boolean)
	 * @see datalogger.DataloggerPackage#getService_Sharable()
	 * @model required="true"
	 * @generated
	 */
	boolean isSharable();

	/**
	 * Sets the value of the '{@link datalogger.Service#isSharable <em>Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharable</em>' attribute.
	 * @see #isSharable()
	 * @generated
	 */
	void setSharable(boolean value);

} // Service
