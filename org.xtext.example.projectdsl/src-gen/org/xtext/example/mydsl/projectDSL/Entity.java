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
