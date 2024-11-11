/**
 */
package datalogger.impl;

import datalogger.Buyer;
import datalogger.DataloggerPackage;
import datalogger.Seller;
import datalogger.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datalogger.impl.TransactionImpl#getSeller <em>Seller</em>}</li>
 *   <li>{@link datalogger.impl.TransactionImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link datalogger.impl.TransactionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link datalogger.impl.TransactionImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link datalogger.impl.TransactionImpl#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction {
	/**
	 * The cached value of the '{@link #getSeller() <em>Seller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeller()
	 * @generated
	 * @ordered
	 */
	protected Seller seller;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Buyer> customers;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected String details = DETAILS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataloggerPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Seller getSeller() {
		if (seller != null && seller.eIsProxy()) {
			InternalEObject oldSeller = (InternalEObject) seller;
			seller = (Seller) eResolveProxy(oldSeller);
			if (seller != oldSeller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataloggerPackage.TRANSACTION__SELLER,
							oldSeller, seller));
			}
		}
		return seller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seller basicGetSeller() {
		return seller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeller(Seller newSeller) {
		Seller oldSeller = seller;
		seller = newSeller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataloggerPackage.TRANSACTION__SELLER, oldSeller,
					seller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Buyer> getCustomers() {
		if (customers == null) {
			customers = new EObjectResolvingEList<Buyer>(Buyer.class, this, DataloggerPackage.TRANSACTION__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataloggerPackage.TRANSACTION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataloggerPackage.TRANSACTION__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetails(String newDetails) {
		String oldDetails = details;
		details = newDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataloggerPackage.TRANSACTION__DETAILS, oldDetails,
					details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DataloggerPackage.TRANSACTION__SELLER:
			if (resolve)
				return getSeller();
			return basicGetSeller();
		case DataloggerPackage.TRANSACTION__CUSTOMERS:
			return getCustomers();
		case DataloggerPackage.TRANSACTION__DATE:
			return getDate();
		case DataloggerPackage.TRANSACTION__COST:
			return getCost();
		case DataloggerPackage.TRANSACTION__DETAILS:
			return getDetails();
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
		case DataloggerPackage.TRANSACTION__SELLER:
			setSeller((Seller) newValue);
			return;
		case DataloggerPackage.TRANSACTION__CUSTOMERS:
			getCustomers().clear();
			getCustomers().addAll((Collection<? extends Buyer>) newValue);
			return;
		case DataloggerPackage.TRANSACTION__DATE:
			setDate((String) newValue);
			return;
		case DataloggerPackage.TRANSACTION__COST:
			setCost((Float) newValue);
			return;
		case DataloggerPackage.TRANSACTION__DETAILS:
			setDetails((String) newValue);
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
		case DataloggerPackage.TRANSACTION__SELLER:
			setSeller((Seller) null);
			return;
		case DataloggerPackage.TRANSACTION__CUSTOMERS:
			getCustomers().clear();
			return;
		case DataloggerPackage.TRANSACTION__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case DataloggerPackage.TRANSACTION__COST:
			setCost(COST_EDEFAULT);
			return;
		case DataloggerPackage.TRANSACTION__DETAILS:
			setDetails(DETAILS_EDEFAULT);
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
		case DataloggerPackage.TRANSACTION__SELLER:
			return seller != null;
		case DataloggerPackage.TRANSACTION__CUSTOMERS:
			return customers != null && !customers.isEmpty();
		case DataloggerPackage.TRANSACTION__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case DataloggerPackage.TRANSACTION__COST:
			return cost != COST_EDEFAULT;
		case DataloggerPackage.TRANSACTION__DETAILS:
			return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
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
		result.append(" (date: ");
		result.append(date);
		result.append(", cost: ");
		result.append(cost);
		result.append(", details: ");
		result.append(details);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
