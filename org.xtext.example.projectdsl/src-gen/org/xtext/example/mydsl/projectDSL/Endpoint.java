/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.projectDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.Endpoint#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends EObject
{
  /**
   * Returns the value of the '<em><b>Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endpoint</em>' reference.
   * @see #setEndpoint(Parameter)
   * @see org.xtext.example.mydsl.projectDSL.ProjectDSLPackage#getEndpoint_Endpoint()
   * @model
   * @generated
   */
  Parameter getEndpoint();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.projectDSL.Endpoint#getEndpoint <em>Endpoint</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endpoint</em>' reference.
   * @see #getEndpoint()
   * @generated
   */
  void setEndpoint(Parameter value);

} // Endpoint
