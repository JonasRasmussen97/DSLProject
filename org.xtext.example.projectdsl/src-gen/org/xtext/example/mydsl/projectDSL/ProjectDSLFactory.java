/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.projectDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage
 * @generated
 */
public interface ProjectDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProjectDSLFactory eINSTANCE = org.xtext.example.mydsl.projectDSL.impl.ProjectDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Rest API</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rest API</em>'.
   * @generated
   */
  RestAPI createRestAPI();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Parent Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent Entity</em>'.
   * @generated
   */
  ParentEntity createParentEntity();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Controller</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Controller</em>'.
   * @generated
   */
  Controller createController();

  /**
   * Returns a new object of class '<em>Endpoint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Endpoint</em>'.
   * @generated
   */
  Endpoint createEndpoint();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Math Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Math Exp</em>'.
   * @generated
   */
  MathExp createMathExp();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult</em>'.
   * @generated
   */
  Mult createMult();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Num</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Num</em>'.
   * @generated
   */
  Num createNum();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProjectDSLPackage getProjectDSLPackage();

} //ProjectDSLFactory
