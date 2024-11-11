/**
 */
package datalogger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datalogger.Platform#getServiceProviders <em>Service Providers</em>}</li>
 * </ul>
 *
 * @see datalogger.DataloggerPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Service Providers</b></em>' containment reference list.
	 * The list contents are of type {@link datalogger.ServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Providers</em>' containment reference list.
	 * @see datalogger.DataloggerPackage#getPlatform_ServiceProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceProvider> getServiceProviders();

} // Platform
