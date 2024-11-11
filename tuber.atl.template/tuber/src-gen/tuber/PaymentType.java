/**
 */
package tuber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Payment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tuber.TuberPackage#getPaymentType()
 * @model
 * @generated
 */
public enum PaymentType implements Enumerator {
	/**
	 * The '<em><b>CREDITCARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDITCARD_VALUE
	 * @generated
	 * @ordered
	 */
	CREDITCARD(0, "CREDITCARD", "CREDITCARD"),

	/**
	 * The '<em><b>APPLEPAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLEPAY_VALUE
	 * @generated
	 * @ordered
	 */
	APPLEPAY(1, "APPLEPAY", "APPLEPAY"),

	/**
	 * The '<em><b>PAYPAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYPAL_VALUE
	 * @generated
	 * @ordered
	 */
	PAYPAL(2, "PAYPAL", "PAYPAL"),

	/**
	 * The '<em><b>CASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASH_VALUE
	 * @generated
	 * @ordered
	 */
	CASH(3, "CASH", "CASH");

	/**
	 * The '<em><b>CREDITCARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDITCARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREDITCARD_VALUE = 0;

	/**
	 * The '<em><b>APPLEPAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLEPAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLEPAY_VALUE = 1;

	/**
	 * The '<em><b>PAYPAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYPAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAYPAL_VALUE = 2;

	/**
	 * The '<em><b>CASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Payment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PaymentType[] VALUES_ARRAY = new PaymentType[] { CREDITCARD, APPLEPAY, PAYPAL, CASH, };

	/**
	 * A public read-only list of all the '<em><b>Payment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PaymentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentType get(int value) {
		switch (value) {
		case CREDITCARD_VALUE:
			return CREDITCARD;
		case APPLEPAY_VALUE:
			return APPLEPAY;
		case PAYPAL_VALUE:
			return PAYPAL;
		case CASH_VALUE:
			return CASH;
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
	private PaymentType(int value, String name, String literal) {
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

} //PaymentType
