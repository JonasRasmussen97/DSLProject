/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.projectDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Controller#getBase <em>Base</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Controller#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends Declaration
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.projectDSL.Entity}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference list.
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getController_Base()
   * @model
   * @generated
   */
  EList<Entity> getBase();

  /**
   * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.projectDSL.Endpoint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endpoint</em>' containment reference list.
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getController_Endpoint()
   * @model containment="true"
   * @generated
   */
  EList<Endpoint> getEndpoint();

} // Controller
