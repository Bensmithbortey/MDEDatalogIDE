/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.datalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mde.datalog.Formula#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.mde.datalog.Formula#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.mde.datalog.DatalogPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Formula)
   * @see org.xtext.mde.datalog.DatalogPackage#getFormula_Left()
   * @model containment="true"
   * @generated
   */
  Formula getLeft();

  /**
   * Sets the value of the '{@link org.xtext.mde.datalog.Formula#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Formula value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Atom)
   * @see org.xtext.mde.datalog.DatalogPackage#getFormula_Right()
   * @model containment="true"
   * @generated
   */
  Atom getRight();

  /**
   * Sets the value of the '{@link org.xtext.mde.datalog.Formula#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Atom value);

} // Formula
