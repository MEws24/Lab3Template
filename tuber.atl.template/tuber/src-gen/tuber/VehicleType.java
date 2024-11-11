/**
 */
package tuber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Vehicle Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tuber.TuberPackage#getVehicleType()
 * @model
 * @generated
 */
public enum VehicleType implements Enumerator {
	/**
	 * The '<em><b>MOTORBIKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORBIKE_VALUE
	 * @generated
	 * @ordered
	 */
	MOTORBIKE(0, "MOTORBIKE", "MOTORBIKE"),

	/**
	 * The '<em><b>CAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CAR(1, "CAR", "CAR"),

	/**
	 * The '<em><b>LUXURY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUXURY_VALUE
	 * @generated
	 * @ordered
	 */
	LUXURY(2, "LUXURY", "LUXURY");

	/**
	 * The '<em><b>MOTORBIKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORBIKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTORBIKE_VALUE = 0;

	/**
	 * The '<em><b>CAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAR_VALUE = 1;

	/**
	 * The '<em><b>LUXURY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUXURY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUXURY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Vehicle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VehicleType[] VALUES_ARRAY = new VehicleType[] { MOTORBIKE, CAR, LUXURY, };

	/**
	 * A public read-only list of all the '<em><b>Vehicle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VehicleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vehicle Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType get(int value) {
		switch (value) {
		case MOTORBIKE_VALUE:
			return MOTORBIKE;
		case CAR_VALUE:
			return CAR;
		case LUXURY_VALUE:
			return LUXURY;
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
	private VehicleType(int value, String name, String literal) {
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

} //VehicleType
