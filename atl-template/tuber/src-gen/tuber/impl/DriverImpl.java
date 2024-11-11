/**
 */
package tuber.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import tuber.Driver;
import tuber.RideStatus;
import tuber.TuberPackage;
import tuber.TuberTables;
import tuber.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuber.impl.DriverImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link tuber.impl.DriverImpl#getEarnings <em>Earnings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriverImpl extends AppUserImpl implements Driver {
	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected Vehicle vehicle;

	/**
	 * The default value of the '{@link #getEarnings() <em>Earnings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarnings()
	 * @generated
	 * @ordered
	 */
	protected static final float EARNINGS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEarnings() <em>Earnings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarnings()
	 * @generated
	 * @ordered
	 */
	protected float earnings = EARNINGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberPackage.Literals.DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vehicle getVehicle() {
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicle(Vehicle newVehicle, NotificationChain msgs) {
		Vehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TuberPackage.DRIVER__VEHICLE,
					oldVehicle, newVehicle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicle(Vehicle newVehicle) {
		if (newVehicle != vehicle) {
			NotificationChain msgs = null;
			if (vehicle != null)
				msgs = ((InternalEObject) vehicle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TuberPackage.DRIVER__VEHICLE, null, msgs);
			if (newVehicle != null)
				msgs = ((InternalEObject) newVehicle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TuberPackage.DRIVER__VEHICLE, null, msgs);
			msgs = basicSetVehicle(newVehicle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.DRIVER__VEHICLE, newVehicle,
					newVehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getEarnings() {
		return earnings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEarnings(float newEarnings) {
		float oldEarnings = earnings;
		earnings = newEarnings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.DRIVER__EARNINGS, oldEarnings,
					earnings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean inv5(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Driver::inv5";
		try {
			/**
			 *
			 * inv inv5:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Sequence{RideStatus::ONGOING, RideStatus::IDLE
			 *         }
			 *         ->includes(self.status)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TuberPackage.Literals.DRIVER___INV5__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TuberTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ RideStatus status = this.getStatus();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_status = TuberTables.ENUMid_RideStatus
						.getEnumerationLiteralId(ClassUtil.nonNullState(status.getName()));
				final /*@NonInvalid*/ boolean result = CollectionIncludesOperation.INSTANCE
						.evaluate(TuberTables.Sequence_0, BOXED_status).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, TuberTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TuberPackage.DRIVER__VEHICLE:
			return basicSetVehicle(null, msgs);
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
		case TuberPackage.DRIVER__VEHICLE:
			return getVehicle();
		case TuberPackage.DRIVER__EARNINGS:
			return getEarnings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TuberPackage.DRIVER__VEHICLE:
			setVehicle((Vehicle) newValue);
			return;
		case TuberPackage.DRIVER__EARNINGS:
			setEarnings((Float) newValue);
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
		case TuberPackage.DRIVER__VEHICLE:
			setVehicle((Vehicle) null);
			return;
		case TuberPackage.DRIVER__EARNINGS:
			setEarnings(EARNINGS_EDEFAULT);
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
		case TuberPackage.DRIVER__VEHICLE:
			return vehicle != null;
		case TuberPackage.DRIVER__EARNINGS:
			return earnings != EARNINGS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TuberPackage.DRIVER___INV5__DIAGNOSTICCHAIN_MAP:
			return inv5((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (earnings: ");
		result.append(earnings);
		result.append(')');
		return result.toString();
	}

} //DriverImpl
