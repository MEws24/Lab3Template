/**
 */
package tuber;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ride</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Ride#getCustomer <em>Customer</em>}</li>
 *   <li>{@link tuber.Ride#getDriver <em>Driver</em>}</li>
 *   <li>{@link tuber.Ride#getDate <em>Date</em>}</li>
 *   <li>{@link tuber.Ride#getAmount <em>Amount</em>}</li>
 *   <li>{@link tuber.Ride#isPaid <em>Paid</em>}</li>
 *   <li>{@link tuber.Ride#getId <em>Id</em>}</li>
 *   <li>{@link tuber.Ride#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getRide()
 * @model abstract="true"
 * @generated
 */
public interface Ride extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference list.
	 * The list contents are of type {@link tuber.Rider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference list.
	 * @see tuber.TuberPackage#getRide_Customer()
	 * @model required="true"
	 * @generated
	 */
	EList<Rider> getCustomer();

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' reference.
	 * @see #setDriver(Driver)
	 * @see tuber.TuberPackage#getRide_Driver()
	 * @model required="true"
	 * @generated
	 */
	Driver getDriver();

	/**
	 * Sets the value of the '{@link tuber.Ride#getDriver <em>Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' reference.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(Driver value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see tuber.TuberPackage#getRide_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link tuber.Ride#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see tuber.TuberPackage#getRide_Amount()
	 * @model required="true"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link tuber.Ride#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid</em>' attribute.
	 * @see #setPaid(boolean)
	 * @see tuber.TuberPackage#getRide_Paid()
	 * @model required="true"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * Sets the value of the '{@link tuber.Ride#isPaid <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid</em>' attribute.
	 * @see #isPaid()
	 * @generated
	 */
	void setPaid(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see tuber.TuberPackage#getRide_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link tuber.Ride#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link tuber.RideStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see tuber.RideStatus
	 * @see #setStatus(RideStatus)
	 * @see tuber.TuberPackage#getRide_Status()
	 * @model required="true"
	 * @generated
	 */
	RideStatus getStatus();

	/**
	 * Sets the value of the '{@link tuber.Ride#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see tuber.RideStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RideStatus value);

} // Ride
