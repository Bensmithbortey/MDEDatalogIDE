/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.datalog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.mde.datalog.Assertion;
import org.xtext.mde.datalog.Conditions;
import org.xtext.mde.datalog.DatalogPackage;
import org.xtext.mde.datalog.Statements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mde.datalog.impl.StatementsImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.mde.datalog.impl.StatementsImpl#getAssertion <em>Assertion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementsImpl extends MinimalEObjectImpl.Container implements Statements
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Conditions condition;

  /**
   * The cached value of the '{@link #getAssertion() <em>Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertion()
   * @generated
   * @ordered
   */
  protected Assertion assertion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DatalogPackage.Literals.STATEMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conditions getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Conditions newCondition, NotificationChain msgs)
  {
    Conditions oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatalogPackage.STATEMENTS__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(Conditions newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatalogPackage.STATEMENTS__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatalogPackage.STATEMENTS__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatalogPackage.STATEMENTS__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assertion getAssertion()
  {
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertion(Assertion newAssertion, NotificationChain msgs)
  {
    Assertion oldAssertion = assertion;
    assertion = newAssertion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatalogPackage.STATEMENTS__ASSERTION, oldAssertion, newAssertion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssertion(Assertion newAssertion)
  {
    if (newAssertion != assertion)
    {
      NotificationChain msgs = null;
      if (assertion != null)
        msgs = ((InternalEObject)assertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatalogPackage.STATEMENTS__ASSERTION, null, msgs);
      if (newAssertion != null)
        msgs = ((InternalEObject)newAssertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatalogPackage.STATEMENTS__ASSERTION, null, msgs);
      msgs = basicSetAssertion(newAssertion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatalogPackage.STATEMENTS__ASSERTION, newAssertion, newAssertion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DatalogPackage.STATEMENTS__CONDITION:
        return basicSetCondition(null, msgs);
      case DatalogPackage.STATEMENTS__ASSERTION:
        return basicSetAssertion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DatalogPackage.STATEMENTS__CONDITION:
        return getCondition();
      case DatalogPackage.STATEMENTS__ASSERTION:
        return getAssertion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DatalogPackage.STATEMENTS__CONDITION:
        setCondition((Conditions)newValue);
        return;
      case DatalogPackage.STATEMENTS__ASSERTION:
        setAssertion((Assertion)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DatalogPackage.STATEMENTS__CONDITION:
        setCondition((Conditions)null);
        return;
      case DatalogPackage.STATEMENTS__ASSERTION:
        setAssertion((Assertion)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DatalogPackage.STATEMENTS__CONDITION:
        return condition != null;
      case DatalogPackage.STATEMENTS__ASSERTION:
        return assertion != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementsImpl
