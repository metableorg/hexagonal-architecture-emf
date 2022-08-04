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
            case SoccerPackage.POSITION: return createPosition();
            case SoccerPackage.PLAYER: return createPlayer();
            case SoccerPackage.ROSTER_MEMBER: return createRosterMember();
            case SoccerPackage.TEAM: return createTeam();
            case SoccerPackage.SOCCER_UNIVERSE: return createSoccerUniverse();
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
            case SoccerPackage.FIELD_POSITION:
                return createFieldPositionFromString(eDataType, initialValue);
            case SoccerPackage.SPECIALITY_POSITION:
                return createSpecialityPositionFromString(eDataType, initialValue);
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
            case SoccerPackage.FIELD_POSITION:
                return convertFieldPositionToString(eDataType, instanceValue);
            case SoccerPackage.SPECIALITY_POSITION:
                return convertSpecialityPositionToString(eDataType, instanceValue);
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
    public Position createPosition() {
        PositionImpl position = new PositionImpl();
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Player createPlayer() {
        PlayerImpl player = new PlayerImpl();
        return player;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosterMember createRosterMember() {
        RosterMemberImpl rosterMember = new RosterMemberImpl();
        return rosterMember;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Team createTeam() {
        TeamImpl team = new TeamImpl();
        return team;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SoccerUniverse createSoccerUniverse() {
        SoccerUniverseImpl soccerUniverse = new SoccerUniverseImpl();
        return soccerUniverse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FieldPosition createFieldPositionFromString(EDataType eDataType, String initialValue) {
        FieldPosition result = FieldPosition.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFieldPositionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecialityPosition createSpecialityPositionFromString(EDataType eDataType, String initialValue) {
        SpecialityPosition result = SpecialityPosition.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSpecialityPositionToString(EDataType eDataType, Object instanceValue) {
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
