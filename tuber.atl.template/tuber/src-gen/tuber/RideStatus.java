/**
 */
package tuber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ride Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tuber.TuberPackage#getRideStatus()
 * @model
 * @generated
 */
public enum RideStatus implements Enumerator {
	/**
	 * The '<em><b>IDLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDLE_VALUE
	 * @generated
	 * @ordered
	 */
	IDLE(0, "IDLE", "IDLE"),

	/**
	 * The '<em><b>ONGOING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONGOING_VALUE
	 * @generated
	 * @ordered
	 */
	ONGOING(1, "ONGOING", "ONGOING"),

	/**
	 * The '<em><b>REQUESTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTED(2, "REQUESTED", "REQUESTED"),

	/**
	 * The '<em><b>COMPLETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(3, "COMPLETED", "COMPLETED");

	/**
	 * The '<em><b>IDLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDLE_VALUE = 0;

	/**
	 * The '<em><b>ONGOING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONGOING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONGOING_VALUE = 1;

	/**
	 * The '<em><b>REQUESTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTED_VALUE = 2;

	/**
	 * The '<em><b>COMPLETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Ride Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RideStatus[] VALUES_ARRAY = new RideStatus[] { IDLE, ONGOING, REQUESTED, COMPLETED, };

	/**
	 * A public read-only list of all the '<em><b>Ride Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RideStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ride Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RideStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RideStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ride Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RideStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RideStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ride Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RideStatus get(int value) {
		switch (value) {
		case IDLE_VALUE:
			return IDLE;
		case ONGOING_VALUE:
			return ONGOING;
		case REQUESTED_VALUE:
			return REQUESTED;
		case COMPLETED_VALUE:
			return COMPLETED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RideStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //RideStatus
