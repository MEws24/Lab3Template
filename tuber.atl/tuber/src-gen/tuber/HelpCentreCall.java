/**
 */
package tuber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Help Centre Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuber.HelpCentreCall#getRide <em>Ride</em>}</li>
 *   <li>{@link tuber.HelpCentreCall#getDuration <em>Duration</em>}</li>
 *   <li>{@link tuber.HelpCentreCall#getIssue <em>Issue</em>}</li>
 *   <li>{@link tuber.HelpCentreCall#getDate <em>Date</em>}</li>
 *   <li>{@link tuber.HelpCentreCall#getStatus <em>Status</em>}</li>
 *   <li>{@link tuber.HelpCentreCall#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tuber.TuberPackage#getHelpCentreCall()
 * @model
 * @generated
 */
public interface HelpCentreCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Ride</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ride</em>' reference.
	 * @see #setRide(Ride)
	 * @see tuber.TuberPackage#getHelpCentreCall_Ride()
	 * @model
	 * @generated
	 */
	Ride getRide();

	/**
	 * Sets the value of the '{@link tuber.HelpCentreCall#getRide <em>Ride</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ride</em>' reference.
	 * @see #getRide()
	 * @generated
	 */
	void setRide(Ride value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see tuber.TuberPackage#getHelpCentreCall_Duration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link tuber.HelpCentreCall#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see #setIssue(String)
	 * @see tuber.TuberPackage#getHelpCentreCall_Issue()
	 * @model required="true"
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link tuber.HelpCentreCall#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see tuber.TuberPackage#getHelpCentreCall_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link tuber.HelpCentreCall#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link tuber.TicketStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see tuber.TicketStatus
	 * @see #setStatus(TicketStatus)
	 * @see tuber.TuberPackage#getHelpCentreCall_Status()
	 * @model required="true"
	 * @generated
	 */
	TicketStatus getStatus();

	/**
	 * Sets the value of the '{@link tuber.HelpCentreCall#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see tuber.TicketStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TicketStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tuber.IssueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tuber.IssueType
	 * @see #setType(IssueType)
	 * @see tuber.TuberPackage#getHelpCentreCall_Type()
	 * @model required="true"
	 * @generated
	 */
	IssueType getType();

	/**
	 * Sets the value of the '{@link tuber.HelpCentreCall#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tuber.IssueType
	 * @see #getType()
	 * @generated
	 */
	void setType(IssueType value);

} // HelpCentreCall
