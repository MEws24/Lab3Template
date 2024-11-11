/**
 */
package tuber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>City</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tuber.TuberPackage#getCity()
 * @model
 * @generated
 */
public enum City implements Enumerator {
	/**
	 * The '<em><b>WIEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIEN_VALUE
	 * @generated
	 * @ordered
	 */
	WIEN(0, "WIEN", "WIEN"),

	/**
	 * The '<em><b>SALZBURG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALZBURG_VALUE
	 * @generated
	 * @ordered
	 */
	SALZBURG(1, "SALZBURG", "SALZBURG"),

	/**
	 * The '<em><b>LINZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINZ_VALUE
	 * @generated
	 * @ordered
	 */
	LINZ(2, "LINZ", "LINZ");

	/**
	 * The '<em><b>WIEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIEN_VALUE = 0;

	/**
	 * The '<em><b>SALZBURG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALZBURG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SALZBURG_VALUE = 1;

	/**
	 * The '<em><b>LINZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINZ_VALUE = 2;

	/**
	 * An array of all the '<em><b>City</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final City[] VALUES_ARRAY = new City[] { WIEN, SALZBURG, LINZ, };

	/**
	 * A public read-only list of all the '<em><b>City</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<City> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>City</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static City get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			City result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>City</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static City getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			City result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>City</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static City get(int value) {
		switch (value) {
		case WIEN_VALUE:
			return WIEN;
		case SALZBURG_VALUE:
			return SALZBURG;
		case LINZ_VALUE:
			return LINZ;
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
	private City(int value, String name, String literal) {
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

} //City
