/**
 */
package datalogger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buyer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datalogger.Buyer#getBuys <em>Buys</em>}</li>
 *   <li>{@link datalogger.Buyer#getDebit <em>Debit</em>}</li>
 * </ul>
 *
 * @see datalogger.DataloggerPackage#getBuyer()
 * @model
 * @generated
 */
public interface Buyer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Buys</b></em>' reference list.
	 * The list contents are of type {@link datalogger.Sellable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buys</em>' reference list.
	 * @see datalogger.DataloggerPackage#getBuyer_Buys()
	 * @model
	 * @generated
	 */
	EList<Sellable> getBuys();

	/**
	 * Returns the value of the '<em><b>Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit</em>' attribute.
	 * @see #setDebit(float)
	 * @see datalogger.DataloggerPackage#getBuyer_Debit()
	 * @model required="true"
	 * @generated
	 */
	float getDebit();

	/**
	 * Sets the value of the '{@link datalogger.Buyer#getDebit <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit</em>' attribute.
	 * @see #getDebit()
	 * @generated
	 */
	void setDebit(float value);

} // Buyer
