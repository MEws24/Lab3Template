/**
 */
package datalogger.impl;

import datalogger.DataloggerPackage;
import datalogger.Platform;
import datalogger.ServiceProvider;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datalogger.impl.PlatformImpl#getServiceProviders <em>Service Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformImpl extends NamedElementImpl implements Platform {
	/**
	 * The cached value of the '{@link #getServiceProviders() <em>Service Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceProvider> serviceProviders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataloggerPackage.Literals.PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceProvider> getServiceProviders() {
		if (serviceProviders == null) {
			serviceProviders = new EObjectContainmentEList<ServiceProvider>(ServiceProvider.class, this,
					DataloggerPackage.PLATFORM__SERVICE_PROVIDERS);
		}
		return serviceProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DataloggerPackage.PLATFORM__SERVICE_PROVIDERS:
			return ((InternalEList<?>) getServiceProviders()).basicRemove(otherEnd, msgs);
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
		case DataloggerPackage.PLATFORM__SERVICE_PROVIDERS:
			return getServiceProviders();
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
		case DataloggerPackage.PLATFORM__SERVICE_PROVIDERS:
			getServiceProviders().clear();
			getServiceProviders().addAll((Collection<? extends ServiceProvider>) newValue);
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
		case DataloggerPackage.PLATFORM__SERVICE_PROVIDERS:
			getServiceProviders().clear();
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
		case DataloggerPackage.PLATFORM__SERVICE_PROVIDERS:
			return serviceProviders != null && !serviceProviders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformImpl
