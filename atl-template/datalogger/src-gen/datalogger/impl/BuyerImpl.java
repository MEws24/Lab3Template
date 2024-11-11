/**
 */
package datalogger.impl;

import datalogger.Buyer;
import datalogger.DataloggerPackage;
import datalogger.Sellable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buyer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datalogger.impl.BuyerImpl#getBuys <em>Buys</em>}</li>
 *   <li>{@link datalogger.impl.BuyerImpl#getDebit <em>Debit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuyerImpl extends NamedElementImpl implements Buyer {
	/**
	 * The cached value of the '{@link #getBuys() <em>Buys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuys()
	 * @generated
	 * @ordered
	 */
	protected EList<Sellable> buys;

	/**
	 * The default value of the '{@link #getDebit() <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebit()
	 * @generated
	 * @ordered
	 */
	protected static final float DEBIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDebit() <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebit()
	 * @generated
	 * @ordered
	 */
	protected float debit = DEBIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuyerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataloggerPackage.Literals.BUYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sellable> getBuys() {
		if (buys == null) {
			buys = new EObjectResolvingEList<Sellable>(Sellable.class, this, DataloggerPackage.BUYER__BUYS);
		}
		return buys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDebit() {
		return debit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDebit(float newDebit) {
		float oldDebit = debit;
		debit = newDebit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataloggerPackage.BUYER__DEBIT, oldDebit, debit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DataloggerPackage.BUYER__BUYS:
			return getBuys();
		case DataloggerPackage.BUYER__DEBIT:
			return getDebit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DataloggerPackage.BUYER__BUYS:
			getBuys().clear();
			getBuys().addAll((Collection<? extends Sellable>) newValue);
			return;
		case DataloggerPackage.BUYER__DEBIT:
			setDebit((Float) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DataloggerPackage.BUYER__BUYS:
			getBuys().clear();
			return;
		case DataloggerPackage.BUYER__DEBIT:
			setDebit(DEBIT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DataloggerPackage.BUYER__BUYS:
			return buys != null && !buys.isEmpty();
		case DataloggerPackage.BUYER__DEBIT:
			return debit != DEBIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (debit: ");
		result.append(debit);
		result.append(')');
		return result.toString();
	}

} //BuyerImpl
