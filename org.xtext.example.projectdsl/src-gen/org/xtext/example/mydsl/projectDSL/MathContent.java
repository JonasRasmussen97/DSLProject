/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.projectDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.MathContent#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.MathContent#getMathType <em>Math Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.MathContent#getMath <em>Math</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getMathContent()
 * @model
 * @generated
 */
public interface MathContent extends EObject
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' reference.
   * @see #setRight(Parameter)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getMathContent_Right()
   * @model
   * @generated
   */
  Parameter getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.MathContent#getRight <em>Right</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Parameter value);

  /**
   * Returns the value of the '<em><b>Math Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Math Type</em>' attribute.
   * @see #setMathType(String)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getMathContent_MathType()
   * @model
   * @generated
   */
  String getMathType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.MathContent#getMathType <em>Math Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Math Type</em>' attribute.
   * @see #getMathType()
   * @generated
   */
  void setMathType(String value);

  /**
   * Returns the value of the '<em><b>Math</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Math</em>' containment reference.
   * @see #setMath(MathExp)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getMathContent_Math()
   * @model containment="true"
   * @generated
   */
  MathExp getMath();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.MathContent#getMath <em>Math</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Math</em>' containment reference.
   * @see #getMath()
   * @generated
   */
  void setMath(MathExp value);

} // MathContent
