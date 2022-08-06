/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.metable.hex.domain.emf.soccer.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoccerFactoryImpl extends EFactoryImpl implements SoccerFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SoccerFactory init() {
        try {
            SoccerFactory theSoccerFactory = (SoccerFactory)EPackage.Registry.INSTANCE.getEFactory(SoccerPackage.eNS_URI);
            if (theSoccerFactory != null) {
                return theSoccerFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SoccerFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoccerFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case SoccerPackage.EMF_POSITION: return createEmfPosition();
            case SoccerPackage.EMF_PLAYER: return createEmfPlayer();
            case SoccerPackage.EMF_ROSTER_MEMBER: return createEmfRosterMember();
            case SoccerPackage.EMF_TEAM: return createEmfTeam();
            case SoccerPackage.EMF_SOCCER_UNIVERSE: return createEmfSoccerUniverse();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case SoccerPackage.EMF_FIELD_POSITION:
                return createEmfFieldPositionFromString(eDataType, initialValue);
            case SoccerPackage.EMF_SPECIALITY_POSITION:
                return createEmfSpecialityPositionFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case SoccerPackage.EMF_FIELD_POSITION:
                return convertEmfFieldPositionToString(eDataType, instanceValue);
            case SoccerPackage.EMF_SPECIALITY_POSITION:
                return convertEmfSpecialityPositionToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmfPosition createEmfPosition() {
        EmfPositionImpl emfPosition = new EmfPositionImpl();
        return emfPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmfPlayer createEmfPlayer() {
        EmfPlayerImpl emfPlayer = new EmfPlayerImpl();
        return emfPlayer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmfRosterMember createEmfRosterMember() {
        EmfRosterMemberImpl emfRosterMember = new EmfRosterMemberImpl();
        return emfRosterMember;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmfTeam createEmfTeam() {
        EmfTeamImpl emfTeam = new EmfTeamImpl();
        return emfTeam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmfSoccerUniverse createEmfSoccerUniverse() {
        EmfSoccerUniverseImpl emfSoccerUniverse = new EmfSoccerUniverseImpl();
        return emfSoccerUniverse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmfFieldPosition createEmfFieldPositionFromString(EDataType eDataType, String initialValue) {
        EmfFieldPosition result = EmfFieldPosition.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEmfFieldPositionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmfSpecialityPosition createEmfSpecialityPositionFromString(EDataType eDataType, String initialValue) {
        EmfSpecialityPosition result = EmfSpecialityPosition.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEmfSpecialityPositionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SoccerPackage getSoccerPackage() {
        return (SoccerPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SoccerPackage getPackage() {
        return SoccerPackage.eINSTANCE;
    }

} //SoccerFactoryImpl
