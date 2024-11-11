/**
 */
package tuber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Payment#getType <em>Type</em>}</li>
 *   <li>{@link tuber.Payment#isStatus <em>Status</em>}</li>
 *   <li>{@link tuber.Payment#getRide <em>Ride</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tuber.PaymentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tuber.PaymentType
	 * @see #setType(PaymentType)
	 * @see tuber.TuberPackage#getPayment_Type()
	 * @model required="true"
	 * @generated
	 */
	PaymentType getType();

	/**
	 * Sets the value of the '{@link tuber.Payment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tuber.PaymentType
	 * @see #getType()
	 * @generated
	 */
	void setType(PaymentType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see tuber.TuberPackage#getPayment_Status()
	 * @model required="true"
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link tuber.Payment#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ride</em>' reference.
	 * @see #setRide(Ride)
	 * @see tuber.TuberPackage#getPayment_Ride()
	 * @model required="true"
	 * @generated
	 */
	Ride getRide();

	/**
	 * Sets the value of the '{@link tuber.Payment#getRide <em>Ride</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ride</em>' reference.
	 * @see #getRide()
	 * @generated
	 */
	void setRide(Ride value);

} // Payment
