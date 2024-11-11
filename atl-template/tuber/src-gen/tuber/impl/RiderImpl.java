/**
 */
package tuber.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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

import tuber.Payment;
import tuber.RideStatus;
import tuber.Rider;
import tuber.TuberPackage;
import tuber.TuberTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuber.impl.RiderImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link tuber.impl.RiderImpl#getSpendings <em>Spendings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiderImpl extends AppUserImpl implements Rider {
	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payment;

	/**
	 * The default value of the '{@link #getSpendings() <em>Spendings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpendings()
	 * @generated
	 * @ordered
	 */
	protected static final float SPENDINGS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpendings() <em>Spendings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpendings()
	 * @generated
	 * @ordered
	 */
	protected float spendings = SPENDINGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberPackage.Literals.RIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Payment> getPayment() {
		if (payment == null) {
			payment = new EObjectContainmentEList<Payment>(Payment.class, this, TuberPackage.RIDER__PAYMENT);
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSpendings() {
		return spendings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpendings(float newSpendings) {
		float oldSpendings = spendings;
		spendings = newSpendings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TuberPackage.RIDER__SPENDINGS, oldSpendings,
					spendings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean inv4(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Rider::inv4";
		try {
			/**
			 *
			 * inv inv4:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Sequence{RideStatus::ONGOING, RideStatus::IDLE, RideStatus::REQUESTED
			 *         }
			 *         ->includes(self.status)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TuberPackage.Literals.RIDER___INV4__DIAGNOSTICCHAIN_MAP);
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
						.evaluate(TuberTables.Sequence, BOXED_status).booleanValue();
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
		case TuberPackage.RIDER__PAYMENT:
			return ((InternalEList<?>) getPayment()).basicRemove(otherEnd, msgs);
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
		case TuberPackage.RIDER__PAYMENT:
			return getPayment();
		case TuberPackage.RIDER__SPENDINGS:
			return getSpendings();
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
		case TuberPackage.RIDER__PAYMENT:
			getPayment().clear();
			getPayment().addAll((Collection<? extends Payment>) newValue);
			return;
		case TuberPackage.RIDER__SPENDINGS:
			setSpendings((Float) newValue);
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
		case TuberPackage.RIDER__PAYMENT:
			getPayment().clear();
			return;
		case TuberPackage.RIDER__SPENDINGS:
			setSpendings(SPENDINGS_EDEFAULT);
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
		case TuberPackage.RIDER__PAYMENT:
			return payment != null && !payment.isEmpty();
		case TuberPackage.RIDER__SPENDINGS:
			return spendings != SPENDINGS_EDEFAULT;
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
		case TuberPackage.RIDER___INV4__DIAGNOSTICCHAIN_MAP:
			return inv4((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (spendings: ");
		result.append(spendings);
		result.append(')');
		return result.toString();
	}

} //RiderImpl
