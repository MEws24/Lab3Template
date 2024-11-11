/**
 */
package datalogger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datalogger.ServiceProvider#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link datalogger.ServiceProvider#getSellers <em>Sellers</em>}</li>
 *   <li>{@link datalogger.ServiceProvider#getBuyers <em>Buyers</em>}</li>
 * </ul>
 *
 * @see datalogger.DataloggerPackage#getServiceProvider()
 * @model
 * @generated
 */
public interface ServiceProvider extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
	 * The list contents are of type {@link datalogger.Transaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' containment reference list.
	 * @see datalogger.DataloggerPackage#getServiceProvider_Transactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transaction> getTransactions();

	/**
	 * Returns the value of the '<em><b>Sellers</b></em>' containment reference list.
	 * The list contents are of type {@link datalogger.Seller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sellers</em>' containment reference list.
	 * @see datalogger.DataloggerPackage#getServiceProvider_Sellers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Seller> getSellers();

	/**
	 * Returns the value of the '<em><b>Buyers</b></em>' containment reference list.
	 * The list contents are of type {@link datalogger.Buyer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buyers</em>' containment reference list.
	 * @see datalogger.DataloggerPackage#getServiceProvider_Buyers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Buyer> getBuyers();

} // ServiceProvider
