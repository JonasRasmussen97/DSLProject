/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.projectDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Entity#getParent <em>Parent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Entity#getCtrlr <em>Ctrlr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Entity#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Declaration
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Entity)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getEntity_Parent()
   * @model
   * @generated
   */
  Entity getParent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.Entity#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Entity value);

  /**
   * Returns the value of the '<em><b>Ctrlr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ctrlr</em>' reference.
   * @see #setCtrlr(Controller)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getEntity_Ctrlr()
   * @model
   * @generated
   */
  Controller getCtrlr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.Entity#getCtrlr <em>Ctrlr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ctrlr</em>' reference.
   * @see #getCtrlr()
   * @generated
   */
  void setCtrlr(Controller value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.projectDSL.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getEntity_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // Entity
