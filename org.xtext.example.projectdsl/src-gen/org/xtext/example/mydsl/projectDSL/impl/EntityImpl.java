/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.projectDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.projectDSL.Controller;
import org.xtext.example.mydsl.projectDSL.Entity;
import org.xtext.example.mydsl.projectDSL.Parameter;
import org.xtext.example.mydsl.projectDSL.ParentEntity;
import org.xtext.example.mydsl.projectDSL.ProjectDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.impl.EntityImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.impl.EntityImpl#getCtrlr <em>Ctrlr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.impl.EntityImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends DeclarationImpl implements Entity
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected ParentEntity parent;

  /**
   * The cached value of the '{@link #getCtrlr() <em>Ctrlr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCtrlr()
   * @generated
   * @ordered
   */
  protected Controller ctrlr;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProjectDSLPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParentEntity getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (ParentEntity)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectDSLPackage.ENTITY__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentEntity basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParent(ParentEntity newParent)
  {
    ParentEntity oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectDSLPackage.ENTITY__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Controller getCtrlr()
  {
    if (ctrlr != null && ctrlr.eIsProxy())
    {
      InternalEObject oldCtrlr = (InternalEObject)ctrlr;
      ctrlr = (Controller)eResolveProxy(oldCtrlr);
      if (ctrlr != oldCtrlr)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectDSLPackage.ENTITY__CTRLR, oldCtrlr, ctrlr));
      }
    }
    return ctrlr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Controller basicGetCtrlr()
  {
    return ctrlr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCtrlr(Controller newCtrlr)
  {
    Controller oldCtrlr = ctrlr;
    ctrlr = newCtrlr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectDSLPackage.ENTITY__CTRLR, oldCtrlr, ctrlr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ProjectDSLPackage.ENTITY__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProjectDSLPackage.ENTITY__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProjectDSLPackage.ENTITY__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case ProjectDSLPackage.ENTITY__CTRLR:
        if (resolve) return getCtrlr();
        return basicGetCtrlr();
      case ProjectDSLPackage.ENTITY__PARAMETERS:
        return getParameters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProjectDSLPackage.ENTITY__PARENT:
        setParent((ParentEntity)newValue);
        return;
      case ProjectDSLPackage.ENTITY__CTRLR:
        setCtrlr((Controller)newValue);
        return;
      case ProjectDSLPackage.ENTITY__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProjectDSLPackage.ENTITY__PARENT:
        setParent((ParentEntity)null);
        return;
      case ProjectDSLPackage.ENTITY__CTRLR:
        setCtrlr((Controller)null);
        return;
      case ProjectDSLPackage.ENTITY__PARAMETERS:
        getParameters().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProjectDSLPackage.ENTITY__PARENT:
        return parent != null;
      case ProjectDSLPackage.ENTITY__CTRLR:
        return ctrlr != null;
      case ProjectDSLPackage.ENTITY__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityImpl
