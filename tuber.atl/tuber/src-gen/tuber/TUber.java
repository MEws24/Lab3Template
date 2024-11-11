/**
 */
package tuber;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TUber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.TUber#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getTUber()
 * @model
 * @generated
 */
public interface TUber extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link tuber.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see tuber.TuberPackage#getTUber_Agent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgent();

} // TUber
