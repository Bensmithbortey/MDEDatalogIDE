/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.datalog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.mde.datalog.AtomC;
import org.xtext.mde.datalog.DatalogPackage;
import org.xtext.mde.datalog.Formula;
import org.xtext.mde.datalog.FormulaC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mde.datalog.impl.FormulaImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.mde.datalog.impl.FormulaImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link org.xtext.mde.datalog.impl.FormulaImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaImpl extends FormulaCImpl implements Formula
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected FormulaC left;

  /**
   * The default value of the '{@link #getComma() <em>Comma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComma()
   * @generated
   * @ordered
   */
  protected static final String COMMA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComma() <em>Comma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComma()
   * @generated
   * @ordered
   */
  protected String comma = COMMA_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected AtomC right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormulaImpl()
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
    return DatalogPackage.Literals.FORMULA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormulaC getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(FormulaC newLeft, NotificationChain msgs)
  {
    FormulaC oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatalogPackage.FORMULA__LEFT, oldLeft, newLeft);
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
  public void setLeft(FormulaC newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatalogPackage.FORMULA__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatalogPackage.FORMULA__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatalogPackage.FORMULA__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getComma()
  {
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComma(String newComma)
  {
    String oldComma = comma;
    comma = newComma;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatalogPackage.FORMULA__COMMA, oldComma, comma));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtomC getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(AtomC newRight, NotificationChain msgs)
  {
    AtomC oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatalogPackage.FORMULA__RIGHT, oldRight, newRight);
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
  public void setRight(AtomC newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatalogPackage.FORMULA__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatalogPackage.FORMULA__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatalogPackage.FORMULA__RIGHT, newRight, newRight));
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
      case DatalogPackage.FORMULA__LEFT:
        return basicSetLeft(null, msgs);
      case DatalogPackage.FORMULA__RIGHT:
        return basicSetRight(null, msgs);
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
      case DatalogPackage.FORMULA__LEFT:
        return getLeft();
      case DatalogPackage.FORMULA__COMMA:
        return getComma();
      case DatalogPackage.FORMULA__RIGHT:
        return getRight();
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
      case DatalogPackage.FORMULA__LEFT:
        setLeft((FormulaC)newValue);
        return;
      case DatalogPackage.FORMULA__COMMA:
        setComma((String)newValue);
        return;
      case DatalogPackage.FORMULA__RIGHT:
        setRight((AtomC)newValue);
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
      case DatalogPackage.FORMULA__LEFT:
        setLeft((FormulaC)null);
        return;
      case DatalogPackage.FORMULA__COMMA:
        setComma(COMMA_EDEFAULT);
        return;
      case DatalogPackage.FORMULA__RIGHT:
        setRight((AtomC)null);
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
      case DatalogPackage.FORMULA__LEFT:
        return left != null;
      case DatalogPackage.FORMULA__COMMA:
        return COMMA_EDEFAULT == null ? comma != null : !COMMA_EDEFAULT.equals(comma);
      case DatalogPackage.FORMULA__RIGHT:
        return right != null;
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
    result.append(" (comma: ");
    result.append(comma);
    result.append(')');
    return result.toString();
  }

} //FormulaImpl
