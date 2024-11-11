/**
 */
package datalogger.impl;

import datalogger.Buyer;
import datalogger.DataloggerPackage;
import datalogger.Seller;
import datalogger.ServiceProvider;
import datalogger.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datalogger.impl.ServiceProviderImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link datalogger.impl.ServiceProviderImpl#getSellers <em>Sellers</em>}</li>
 *   <li>{@link datalogger.impl.ServiceProviderImpl#getBuyers <em>Buyers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceProviderImpl extends NamedElementImpl implements ServiceProvider {
	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transactions;

	/**
	 * The cached value of the '{@link #getSellers() <em>Sellers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellers()
	 * @generated
	 * @ordered
	 */
	protected EList<Seller> sellers;

	/**
	 * The cached value of the '{@link #getBuyers() <em>Buyers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyers()
	 * @generated
	 * @ordered
	 */
	protected EList<Buyer> buyers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataloggerPackage.Literals.SERVICE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectContainmentEList<Transaction>(Transaction.class, this,
					DataloggerPackage.SERVICE_PROVIDER__TRANSACTIONS);
		}
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Seller> getSellers() {
		if (sellers == null) {
			sellers = new EObjectContainmentEList<Seller>(Seller.class, this,
					DataloggerPackage.SERVICE_PROVIDER__SELLERS);
		}
		return sellers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Buyer> getBuyers() {
		if (buyers == null) {
			buyers = new EObjectContainmentEList<Buyer>(Buyer.class, this, DataloggerPackage.SERVICE_PROVIDER__BUYERS);
		}
		return buyers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DataloggerPackage.SERVICE_PROVIDER__TRANSACTIONS:
			return ((InternalEList<?>) getTransactions()).basicRemove(otherEnd, msgs);
		case DataloggerPackage.SERVICE_PROVIDER__SELLERS:
			return ((InternalEList<?>) getSellers()).basicRemove(otherEnd, msgs);
		case DataloggerPackage.SERVICE_PROVIDER__BUYERS:
			return ((InternalEList<?>) getBuyers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DataloggerPackage.SERVICE_PROVIDER__TRANSACTIONS:
			return getTransactions();
		case DataloggerPackage.SERVICE_PROVIDER__SELLERS:
			return getSellers();
		case DataloggerPackage.SERVICE_PROVIDER__BUYERS:
			return getBuyers();
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
		case DataloggerPackage.SERVICE_PROVIDER__TRANSACTIONS:
			getTransactions().clear();
			getTransactions().addAll((Collection<? extends Transaction>) newValue);
			return;
		case DataloggerPackage.SERVICE_PROVIDER__SELLERS:
			getSellers().clear();
			getSellers().addAll((Collection<? extends Seller>) newValue);
			return;
		case DataloggerPackage.SERVICE_PROVIDER__BUYERS:
			getBuyers().clear();
			getBuyers().addAll((Collection<? extends Buyer>) newValue);
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
		case DataloggerPackage.SERVICE_PROVIDER__TRANSACTIONS:
			getTransactions().clear();
			return;
		case DataloggerPackage.SERVICE_PROVIDER__SELLERS:
			getSellers().clear();
			return;
		case DataloggerPackage.SERVICE_PROVIDER__BUYERS:
			getBuyers().clear();
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
		case DataloggerPackage.SERVICE_PROVIDER__TRANSACTIONS:
			return transactions != null && !transactions.isEmpty();
		case DataloggerPackage.SERVICE_PROVIDER__SELLERS:
			return sellers != null && !sellers.isEmpty();
		case DataloggerPackage.SERVICE_PROVIDER__BUYERS:
			return buyers != null && !buyers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceProviderImpl
