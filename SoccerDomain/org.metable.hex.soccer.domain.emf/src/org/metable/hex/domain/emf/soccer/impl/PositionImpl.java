/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.metable.hex.domain.emf.soccer.FieldPosition;
import org.metable.hex.domain.emf.soccer.Position;
import org.metable.hex.domain.emf.soccer.SoccerPackage;
import org.metable.hex.domain.emf.soccer.SpecialityPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.PositionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.PositionImpl#getFieldPosition <em>Field Position</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.PositionImpl#getSpecialityPosition <em>Speciality Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
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
     * The default value of the '{@link #getFieldPosition() <em>Field Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFieldPosition()
     * @generated
     * @ordered
     */
    protected static final FieldPosition FIELD_POSITION_EDEFAULT = FieldPosition.FORWARD;

    /**
     * The cached value of the '{@link #getFieldPosition() <em>Field Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFieldPosition()
     * @generated
     * @ordered
     */
    protected FieldPosition fieldPosition = FIELD_POSITION_EDEFAULT;

    /**
     * The default value of the '{@link #getSpecialityPosition() <em>Speciality Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialityPosition()
     * @generated
     * @ordered
     */
    protected static final SpecialityPosition SPECIALITY_POSITION_EDEFAULT = SpecialityPosition.STRIKER;

    /**
     * The cached value of the '{@link #getSpecialityPosition() <em>Speciality Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialityPosition()
     * @generated
     * @ordered
     */
    protected SpecialityPosition specialityPosition = SPECIALITY_POSITION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PositionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.POSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.POSITION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FieldPosition getFieldPosition() {
        return fieldPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFieldPosition(FieldPosition newFieldPosition) {
        FieldPosition oldFieldPosition = fieldPosition;
        fieldPosition = newFieldPosition == null ? FIELD_POSITION_EDEFAULT : newFieldPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.POSITION__FIELD_POSITION, oldFieldPosition, fieldPosition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SpecialityPosition getSpecialityPosition() {
        return specialityPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecialityPosition(SpecialityPosition newSpecialityPosition) {
        SpecialityPosition oldSpecialityPosition = specialityPosition;
        specialityPosition = newSpecialityPosition == null ? SPECIALITY_POSITION_EDEFAULT : newSpecialityPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.POSITION__SPECIALITY_POSITION, oldSpecialityPosition, specialityPosition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SoccerPackage.POSITION__NAME:
                return getName();
            case SoccerPackage.POSITION__FIELD_POSITION:
                return getFieldPosition();
            case SoccerPackage.POSITION__SPECIALITY_POSITION:
                return getSpecialityPosition();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SoccerPackage.POSITION__NAME:
                setName((String)newValue);
                return;
            case SoccerPackage.POSITION__FIELD_POSITION:
                setFieldPosition((FieldPosition)newValue);
                return;
            case SoccerPackage.POSITION__SPECIALITY_POSITION:
                setSpecialityPosition((SpecialityPosition)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case SoccerPackage.POSITION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SoccerPackage.POSITION__FIELD_POSITION:
                setFieldPosition(FIELD_POSITION_EDEFAULT);
                return;
            case SoccerPackage.POSITION__SPECIALITY_POSITION:
                setSpecialityPosition(SPECIALITY_POSITION_EDEFAULT);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SoccerPackage.POSITION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case SoccerPackage.POSITION__FIELD_POSITION:
                return fieldPosition != FIELD_POSITION_EDEFAULT;
            case SoccerPackage.POSITION__SPECIALITY_POSITION:
                return specialityPosition != SPECIALITY_POSITION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", fieldPosition: ");
        result.append(fieldPosition);
        result.append(", specialityPosition: ");
        result.append(specialityPosition);
        result.append(')');
        return result.toString();
    }

} //PositionImpl
