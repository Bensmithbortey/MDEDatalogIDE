/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.datalog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.mde.datalog.DatalogPackage;
import org.xtext.mde.datalog.ParameterVar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mde.datalog.impl.ParameterVarImpl#getUp <em>Up</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterVarImpl extends ParImpl implements ParameterVar
{
  /**
   * The default value of the '{@link #getUp() <em>Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUp()
   * @generated
   * @ordered
   */
  protected static final String UP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUp() <em>Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUp()
   * @generated
   * @ordered
   */
  protected String up = UP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterVarImpl()
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
    return DatalogPackage.Literals.PARAMETER_VAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUp()
  {
    return up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUp(String newUp)
  {
    String oldUp = up;
    up = newUp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatalogPackage.PARAMETER_VAR__UP, oldUp, up));
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
      case DatalogPackage.PARAMETER_VAR__UP:
        return getUp();
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
      case DatalogPackage.PARAMETER_VAR__UP:
        setUp((String)newValue);
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
      case DatalogPackage.PARAMETER_VAR__UP:
        setUp(UP_EDEFAULT);
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
      case DatalogPackage.PARAMETER_VAR__UP:
        return UP_EDEFAULT == null ? up != null : !UP_EDEFAULT.equals(up);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (up: ");
    result.append(up);
    result.append(')');
    return result.toString();
  }

} //ParameterVarImpl
