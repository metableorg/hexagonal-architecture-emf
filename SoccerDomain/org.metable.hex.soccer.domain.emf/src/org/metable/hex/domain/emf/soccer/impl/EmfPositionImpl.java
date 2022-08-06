/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.metable.hex.domain.emf.soccer.EmfFieldPosition;
import org.metable.hex.domain.emf.soccer.EmfPosition;
import org.metable.hex.domain.emf.soccer.EmfSpecialityPosition;
import org.metable.hex.domain.emf.soccer.SoccerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfPositionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfPositionImpl#getFieldPosition <em>Field Position</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfPositionImpl#getSpecialityPosition <em>Speciality Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfPositionImpl extends MinimalEObjectImpl.Container implements EmfPosition {
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
    protected static final EmfFieldPosition FIELD_POSITION_EDEFAULT = EmfFieldPosition.FORWARD;

    /**
     * The cached value of the '{@link #getFieldPosition() <em>Field Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFieldPosition()
     * @generated
     * @ordered
     */
    protected EmfFieldPosition fieldPosition = FIELD_POSITION_EDEFAULT;

    /**
     * The default value of the '{@link #getSpecialityPosition() <em>Speciality Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialityPosition()
     * @generated
     * @ordered
     */
    protected static final EmfSpecialityPosition SPECIALITY_POSITION_EDEFAULT = EmfSpecialityPosition.STRIKER;

    /**
     * The cached value of the '{@link #getSpecialityPosition() <em>Speciality Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialityPosition()
     * @generated
     * @ordered
     */
    protected EmfSpecialityPosition specialityPosition = SPECIALITY_POSITION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmfPositionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.EMF_POSITION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.EMF_POSITION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmfFieldPosition getFieldPosition() {
        return fieldPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFieldPosition(EmfFieldPosition newFieldPosition) {
        EmfFieldPosition oldFieldPosition = fieldPosition;
        fieldPosition = newFieldPosition == null ? FIELD_POSITION_EDEFAULT : newFieldPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.EMF_POSITION__FIELD_POSITION, oldFieldPosition, fieldPosition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmfSpecialityPosition getSpecialityPosition() {
        return specialityPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecialityPosition(EmfSpecialityPosition newSpecialityPosition) {
        EmfSpecialityPosition oldSpecialityPosition = specialityPosition;
        specialityPosition = newSpecialityPosition == null ? SPECIALITY_POSITION_EDEFAULT : newSpecialityPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.EMF_POSITION__SPECIALITY_POSITION, oldSpecialityPosition, specialityPosition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SoccerPackage.EMF_POSITION__NAME:
                return getName();
            case SoccerPackage.EMF_POSITION__FIELD_POSITION:
                return getFieldPosition();
            case SoccerPackage.EMF_POSITION__SPECIALITY_POSITION:
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
            case SoccerPackage.EMF_POSITION__NAME:
                setName((String)newValue);
                return;
            case SoccerPackage.EMF_POSITION__FIELD_POSITION:
                setFieldPosition((EmfFieldPosition)newValue);
                return;
            case SoccerPackage.EMF_POSITION__SPECIALITY_POSITION:
                setSpecialityPosition((EmfSpecialityPosition)newValue);
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
            case SoccerPackage.EMF_POSITION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SoccerPackage.EMF_POSITION__FIELD_POSITION:
                setFieldPosition(FIELD_POSITION_EDEFAULT);
                return;
            case SoccerPackage.EMF_POSITION__SPECIALITY_POSITION:
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
            case SoccerPackage.EMF_POSITION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case SoccerPackage.EMF_POSITION__FIELD_POSITION:
                return fieldPosition != FIELD_POSITION_EDEFAULT;
            case SoccerPackage.EMF_POSITION__SPECIALITY_POSITION:
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

} //EmfPositionImpl
