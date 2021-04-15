/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.datalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mde.datalog.AtomC#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mde.datalog.AtomC#getLp <em>Lp</em>}</li>
 *   <li>{@link org.xtext.mde.datalog.AtomC#getList <em>List</em>}</li>
 *   <li>{@link org.xtext.mde.datalog.AtomC#getRp <em>Rp</em>}</li>
 * </ul>
 *
 * @see org.xtext.mde.datalog.DatalogPackage#getAtomC()
 * @model
 * @generated
 */
public interface AtomC extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Atom)
   * @see org.xtext.mde.datalog.DatalogPackage#getAtomC_Name()
   * @model
   * @generated
   */
  Atom getName();

  /**
   * Sets the value of the '{@link org.xtext.mde.datalog.AtomC#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Atom value);

  /**
   * Returns the value of the '<em><b>Lp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lp</em>' attribute.
   * @see #setLp(String)
   * @see org.xtext.mde.datalog.DatalogPackage#getAtomC_Lp()
   * @model
   * @generated
   */
  String getLp();

  /**
   * Sets the value of the '{@link org.xtext.mde.datalog.AtomC#getLp <em>Lp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lp</em>' attribute.
   * @see #getLp()
   * @generated
   */
  void setLp(String value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(Par)
   * @see org.xtext.mde.datalog.DatalogPackage#getAtomC_List()
   * @model containment="true"
   * @generated
   */
  Par getList();

  /**
   * Sets the value of the '{@link org.xtext.mde.datalog.AtomC#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(Par value);

  /**
   * Returns the value of the '<em><b>Rp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rp</em>' attribute.
   * @see #setRp(String)
   * @see org.xtext.mde.datalog.DatalogPackage#getAtomC_Rp()
   * @model
   * @generated
   */
  String getRp();

  /**
   * Sets the value of the '{@link org.xtext.mde.datalog.AtomC#getRp <em>Rp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rp</em>' attribute.
   * @see #getRp()
   * @generated
   */
  void setRp(String value);

} // AtomC
