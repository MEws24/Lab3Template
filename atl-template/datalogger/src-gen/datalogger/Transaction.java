/**
 */
package datalogger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datalogger.Transaction#getSeller <em>Seller</em>}</li>
 *   <li>{@link datalogger.Transaction#getCustomers <em>Customers</em>}</li>
 *   <li>{@link datalogger.Transaction#getDate <em>Date</em>}</li>
 *   <li>{@link datalogger.Transaction#getCost <em>Cost</em>}</li>
 *   <li>{@link datalogger.Transaction#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see datalogger.DataloggerPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Seller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seller</em>' reference.
	 * @see #setSeller(Seller)
	 * @see datalogger.DataloggerPackage#getTransaction_Seller()
	 * @model required="true"
	 * @generated
	 */
	Seller getSeller();

	/**
	 * Sets the value of the '{@link datalogger.Transaction#getSeller <em>Seller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seller</em>' reference.
	 * @see #getSeller()
	 * @generated
	 */
	void setSeller(Seller value);

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' reference list.
	 * The list contents are of type {@link datalogger.Buyer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' reference list.
	 * @see datalogger.DataloggerPackage#getTransaction_Customers()
	 * @model required="true"
	 * @generated
	 */
	EList<Buyer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see datalogger.DataloggerPackage#getTransaction_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link datalogger.Transaction#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see datalogger.DataloggerPackage#getTransaction_Cost()
	 * @model required="true"
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link datalogger.Transaction#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see #setDetails(String)
	 * @see datalogger.DataloggerPackage#getTransaction_Details()
	 * @model required="true"
	 * @generated
	 */
	String getDetails();

	/**
	 * Sets the value of the '{@link datalogger.Transaction#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(String value);

} // Transaction
