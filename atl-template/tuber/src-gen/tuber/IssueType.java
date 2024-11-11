/**
 */
package tuber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Issue Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tuber.TuberPackage#getIssueType()
 * @model
 * @generated
 */
public enum IssueType implements Enumerator {
	/**
	 * The '<em><b>PAYMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT(0, "PAYMENT", "PAYMENT"),

	/**
	 * The '<em><b>SAFETY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY(1, "SAFETY", "SAFETY"),

	/**
	 * The '<em><b>ACCOUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT(2, "ACCOUNT", "ACCOUNT");

	/**
	 * The '<em><b>PAYMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_VALUE = 0;

	/**
	 * The '<em><b>SAFETY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_VALUE = 1;

	/**
	 * The '<em><b>ACCOUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Issue Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssueType[] VALUES_ARRAY = new IssueType[] { PAYMENT, SAFETY, ACCOUNT, };

	/**
	 * A public read-only list of all the '<em><b>Issue Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issue Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueType get(int value) {
		switch (value) {
		case PAYMENT_VALUE:
			return PAYMENT;
		case SAFETY_VALUE:
			return SAFETY;
		case ACCOUNT_VALUE:
			return ACCOUNT;
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
	private IssueType(int value, String name, String literal) {
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

} //IssueType
