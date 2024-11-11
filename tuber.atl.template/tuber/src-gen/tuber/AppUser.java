/**
 */
package tuber;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.AppUser#getLocation <em>Location</em>}</li>
 *   <li>{@link tuber.AppUser#getRating <em>Rating</em>}</li>
 *   <li>{@link tuber.AppUser#getSupportCall <em>Support Call</em>}</li>
 *   <li>{@link tuber.AppUser#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getAppUser()
 * @model abstract="true"
 * @generated
 */
public interface AppUser extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see tuber.TuberPackage#getAppUser_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link tuber.AppUser#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(float)
	 * @see tuber.TuberPackage#getAppUser_Rating()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 * @generated
	 */
	float getRating();

	/**
	 * Sets the value of the '{@link tuber.AppUser#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(float value);

	/**
	 * Returns the value of the '<em><b>Support Call</b></em>' containment reference list.
	 * The list contents are of type {@link tuber.HelpCentreCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Call</em>' containment reference list.
	 * @see tuber.TuberPackage#getAppUser_SupportCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<HelpCentreCall> getSupportCall();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link tuber.RideStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see tuber.RideStatus
	 * @see #setStatus(RideStatus)
	 * @see tuber.TuberPackage#getAppUser_Status()
	 * @model required="true"
	 * @generated
	 */
	RideStatus getStatus();

	/**
	 * Sets the value of the '{@link tuber.AppUser#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see tuber.RideStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RideStatus value);

} // AppUser
