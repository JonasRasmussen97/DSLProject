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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.projectDSL.MathExp;
import org.xtext.example.mydsl.projectDSL.Parameter;
import org.xtext.example.mydsl.projectDSL.ProjectDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.impl.ParameterImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.impl.ParameterImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.impl.ParameterImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.projectDSL.impl.ParameterImpl#getMath <em>Math</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected static final String DATA_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected String dataType = DATA_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<String> type;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Parameter left;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getMath() <em>Math</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMath()
   * @generated
   * @ordered
   */
  protected MathExp math;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return ProjectDSLPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectDSLPackage.PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataType(String newDataType)
  {
    String oldDataType = dataType;
    dataType = newDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectDSLPackage.PARAMETER__DATA_TYPE, oldDataType, dataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getType()
  {
    if (type == null)
    {
      type = new EDataTypeEList<String>(String.class, this, ProjectDSLPackage.PARAMETER__TYPE);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter getLeft()
  {
    if (left != null && left.eIsProxy())
    {
      InternalEObject oldLeft = (InternalEObject)left;
      left = (Parameter)eResolveProxy(oldLeft);
      if (left != oldLeft)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectDSLPackage.PARAMETER__LEFT, oldLeft, left));
      }
    }
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeft(Parameter newLeft)
  {
    Parameter oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectDSLPackage.PARAMETER__LEFT, oldLeft, left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectDSLPackage.PARAMETER__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathExp getMath()
  {
    return math;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMath(MathExp newMath, NotificationChain msgs)
  {
    MathExp oldMath = math;
    math = newMath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectDSLPackage.PARAMETER__MATH, oldMath, newMath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMath(MathExp newMath)
  {
    if (newMath != math)
    {
      NotificationChain msgs = null;
      if (math != null)
        msgs = ((InternalEObject)math).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectDSLPackage.PARAMETER__MATH, null, msgs);
      if (newMath != null)
        msgs = ((InternalEObject)newMath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectDSLPackage.PARAMETER__MATH, null, msgs);
      msgs = basicSetMath(newMath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectDSLPackage.PARAMETER__MATH, newMath, newMath));
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
      case ProjectDSLPackage.PARAMETER__MATH:
        return basicSetMath(null, msgs);
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
      case ProjectDSLPackage.PARAMETER__NAME:
        return getName();
      case ProjectDSLPackage.PARAMETER__DATA_TYPE:
        return getDataType();
      case ProjectDSLPackage.PARAMETER__TYPE:
        return getType();
      case ProjectDSLPackage.PARAMETER__LEFT:
        if (resolve) return getLeft();
        return basicGetLeft();
      case ProjectDSLPackage.PARAMETER__OP:
        return getOp();
      case ProjectDSLPackage.PARAMETER__MATH:
        return getMath();
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
      case ProjectDSLPackage.PARAMETER__NAME:
        setName((String)newValue);
        return;
      case ProjectDSLPackage.PARAMETER__DATA_TYPE:
        setDataType((String)newValue);
        return;
      case ProjectDSLPackage.PARAMETER__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends String>)newValue);
        return;
      case ProjectDSLPackage.PARAMETER__LEFT:
        setLeft((Parameter)newValue);
        return;
      case ProjectDSLPackage.PARAMETER__OP:
        setOp((String)newValue);
        return;
      case ProjectDSLPackage.PARAMETER__MATH:
        setMath((MathExp)newValue);
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
      case ProjectDSLPackage.PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProjectDSLPackage.PARAMETER__DATA_TYPE:
        setDataType(DATA_TYPE_EDEFAULT);
        return;
      case ProjectDSLPackage.PARAMETER__TYPE:
        getType().clear();
        return;
      case ProjectDSLPackage.PARAMETER__LEFT:
        setLeft((Parameter)null);
        return;
      case ProjectDSLPackage.PARAMETER__OP:
        setOp(OP_EDEFAULT);
        return;
      case ProjectDSLPackage.PARAMETER__MATH:
        setMath((MathExp)null);
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
      case ProjectDSLPackage.PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProjectDSLPackage.PARAMETER__DATA_TYPE:
        return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
      case ProjectDSLPackage.PARAMETER__TYPE:
        return type != null && !type.isEmpty();
      case ProjectDSLPackage.PARAMETER__LEFT:
        return left != null;
      case ProjectDSLPackage.PARAMETER__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case ProjectDSLPackage.PARAMETER__MATH:
        return math != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", dataType: ");
    result.append(dataType);
    result.append(", type: ");
    result.append(type);
    result.append(", op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
