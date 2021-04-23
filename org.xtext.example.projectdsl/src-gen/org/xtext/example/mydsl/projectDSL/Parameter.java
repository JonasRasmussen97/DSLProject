/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.projectDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Parameter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Parameter#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Parameter#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Parameter#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' attribute.
   * @see #setDataType(String)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getParameter_DataType()
   * @model
   * @generated
   */
  String getDataType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.Parameter#getDataType <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' attribute.
   * @see #getDataType()
   * @generated
   */
  void setDataType(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute list.
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getParameter_Type()
   * @model unique="false"
   * @generated
   */
  EList<String> getType();

  /**
   * Returns the value of the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' reference.
   * @see #setLeft(Parameter)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getParameter_Left()
   * @model
   * @generated
   */
  Parameter getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.Parameter#getLeft <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Parameter value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getParameter_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.Parameter#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getParameter_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.Parameter#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Parameter
