/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.datalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.mde.datalog.DatalogPackage
 * @generated
 */
public interface DatalogFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DatalogFactory eINSTANCE = org.xtext.mde.datalog.impl.DatalogFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statements</em>'.
   * @generated
   */
  Statements createStatements();

  /**
   * Returns a new object of class '<em>Conditions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditions</em>'.
   * @generated
   */
  Conditions createConditions();

  /**
   * Returns a new object of class '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assertion</em>'.
   * @generated
   */
  Assertion createAssertion();

  /**
   * Returns a new object of class '<em>Formula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula</em>'.
   * @generated
   */
  Formula createFormula();

  /**
   * Returns a new object of class '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom</em>'.
   * @generated
   */
  Atom createAtom();

  /**
   * Returns a new object of class '<em>Par</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Par</em>'.
   * @generated
   */
  Par createPar();

  /**
   * Returns a new object of class '<em>Parameter Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Int</em>'.
   * @generated
   */
  ParameterInt createParameterInt();

  /**
   * Returns a new object of class '<em>Parameter Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Var</em>'.
   * @generated
   */
  ParameterVar createParameterVar();

  /**
   * Returns a new object of class '<em>Parameter Pred</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Pred</em>'.
   * @generated
   */
  ParameterPred createParameterPred();

  /**
   * Returns a new object of class '<em>Param List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param List</em>'.
   * @generated
   */
  ParamList createParamList();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DatalogPackage getDatalogPackage();

} //DatalogFactory
