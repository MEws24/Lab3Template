/**
 */
package tuber;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.Rider#getPayment <em>Payment</em>}</li>
 *   <li>{@link tuber.Rider#getSpendings <em>Spendings</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getRider()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv4'"
 * @generated
 */
public interface Rider extends AppUser {
	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference list.
	 * The list contents are of type {@link tuber.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference list.
	 * @see tuber.TuberPackage#getRider_Payment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Payment> getPayment();

	/**
	 * Returns the value of the '<em><b>Spendings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spendings</em>' attribute.
	 * @see #setSpendings(float)
	 * @see tuber.TuberPackage#getRider_Spendings()
	 * @model required="true"
	 * @generated
	 */
	float getSpendings();

	/**
	 * Sets the value of the '{@link tuber.Rider#getSpendings <em>Spendings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spendings</em>' attribute.
	 * @see #getSpendings()
	 * @generated
	 */
	void setSpendings(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Sequence {RideStatus::ONGOING, RideStatus::IDLE, RideStatus::REQUESTED} -&gt; includes(self.status)'"
	 * @generated
	 */
	boolean inv4(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Rider
