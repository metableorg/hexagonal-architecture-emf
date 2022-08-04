/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.metable.hex.domain.emf.soccer.FieldPosition;
import org.metable.hex.domain.emf.soccer.Player;
import org.metable.hex.domain.emf.soccer.Position;
import org.metable.hex.domain.emf.soccer.RosterMember;
import org.metable.hex.domain.emf.soccer.SoccerFactory;
import org.metable.hex.domain.emf.soccer.SoccerPackage;
import org.metable.hex.domain.emf.soccer.SoccerUniverse;
import org.metable.hex.domain.emf.soccer.SpecialityPosition;
import org.metable.hex.domain.emf.soccer.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoccerPackageImpl extends EPackageImpl implements SoccerPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass positionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass playerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosterMemberEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass teamEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass soccerUniverseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum fieldPositionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum specialityPositionEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SoccerPackageImpl() {
        super(eNS_URI, SoccerFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link SoccerPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SoccerPackage init() {
        if (isInited) return (SoccerPackage)EPackage.Registry.INSTANCE.getEPackage(SoccerPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredSoccerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        SoccerPackageImpl theSoccerPackage = registeredSoccerPackage instanceof SoccerPackageImpl ? (SoccerPackageImpl)registeredSoccerPackage : new SoccerPackageImpl();

        isInited = true;

        // Create package meta-data objects
        theSoccerPackage.createPackageContents();

        // Initialize created meta-data
        theSoccerPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSoccerPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SoccerPackage.eNS_URI, theSoccerPackage);
        return theSoccerPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPosition() {
        return positionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPosition_Name() {
        return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPosition_FieldPosition() {
        return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPosition_SpecialityPosition() {
        return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPlayer() {
        return playerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPlayer_Id() {
        return (EAttribute)playerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPlayer_FirstName() {
        return (EAttribute)playerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPlayer_LastName() {
        return (EAttribute)playerEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosterMember() {
        return rosterMemberEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosterMember_Player() {
        return (EReference)rosterMemberEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosterMember_Position() {
        return (EReference)rosterMemberEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRosterMember_Number() {
        return (EAttribute)rosterMemberEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTeam() {
        return teamEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTeam_Id() {
        return (EAttribute)teamEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTeam_Name() {
        return (EAttribute)teamEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTeam_Roster() {
        return (EReference)teamEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSoccerUniverse() {
        return soccerUniverseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSoccerUniverse_Players() {
        return (EReference)soccerUniverseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSoccerUniverse_Teams() {
        return (EReference)soccerUniverseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSoccerUniverse_Positions() {
        return (EReference)soccerUniverseEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getFieldPosition() {
        return fieldPositionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getSpecialityPosition() {
        return specialityPositionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SoccerFactory getSoccerFactory() {
        return (SoccerFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        positionEClass = createEClass(POSITION);
        createEAttribute(positionEClass, POSITION__NAME);
        createEAttribute(positionEClass, POSITION__FIELD_POSITION);
        createEAttribute(positionEClass, POSITION__SPECIALITY_POSITION);

        playerEClass = createEClass(PLAYER);
        createEAttribute(playerEClass, PLAYER__ID);
        createEAttribute(playerEClass, PLAYER__FIRST_NAME);
        createEAttribute(playerEClass, PLAYER__LAST_NAME);

        rosterMemberEClass = createEClass(ROSTER_MEMBER);
        createEReference(rosterMemberEClass, ROSTER_MEMBER__PLAYER);
        createEReference(rosterMemberEClass, ROSTER_MEMBER__POSITION);
        createEAttribute(rosterMemberEClass, ROSTER_MEMBER__NUMBER);

        teamEClass = createEClass(TEAM);
        createEAttribute(teamEClass, TEAM__ID);
        createEAttribute(teamEClass, TEAM__NAME);
        createEReference(teamEClass, TEAM__ROSTER);

        soccerUniverseEClass = createEClass(SOCCER_UNIVERSE);
        createEReference(soccerUniverseEClass, SOCCER_UNIVERSE__PLAYERS);
        createEReference(soccerUniverseEClass, SOCCER_UNIVERSE__TEAMS);
        createEReference(soccerUniverseEClass, SOCCER_UNIVERSE__POSITIONS);

        // Create enums
        fieldPositionEEnum = createEEnum(FIELD_POSITION);
        specialityPositionEEnum = createEEnum(SPECIALITY_POSITION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPosition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPosition_FieldPosition(), this.getFieldPosition(), "fieldPosition", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPosition_SpecialityPosition(), this.getSpecialityPosition(), "specialityPosition", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPlayer_Id(), ecorePackage.getEString(), "id", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlayer_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlayer_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosterMemberEClass, RosterMember.class, "RosterMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosterMember_Player(), this.getPlayer(), null, "player", null, 0, 1, RosterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosterMember_Position(), this.getPosition(), null, "position", null, 0, 1, RosterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRosterMember_Number(), ecorePackage.getEInt(), "number", null, 0, 1, RosterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTeam_Id(), ecorePackage.getEString(), "id", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTeam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTeam_Roster(), this.getRosterMember(), null, "roster", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(soccerUniverseEClass, SoccerUniverse.class, "SoccerUniverse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSoccerUniverse_Players(), this.getPlayer(), null, "players", null, 0, -1, SoccerUniverse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSoccerUniverse_Teams(), this.getTeam(), null, "teams", null, 0, -1, SoccerUniverse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSoccerUniverse_Positions(), this.getPosition(), null, "positions", null, 0, -1, SoccerUniverse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(fieldPositionEEnum, FieldPosition.class, "FieldPosition");
        addEEnumLiteral(fieldPositionEEnum, FieldPosition.FORWARD);
        addEEnumLiteral(fieldPositionEEnum, FieldPosition.MIDDLE);
        addEEnumLiteral(fieldPositionEEnum, FieldPosition.BACK);

        initEEnum(specialityPositionEEnum, SpecialityPosition.class, "SpecialityPosition");
        addEEnumLiteral(specialityPositionEEnum, SpecialityPosition.STRIKER);
        addEEnumLiteral(specialityPositionEEnum, SpecialityPosition.WING);
        addEEnumLiteral(specialityPositionEEnum, SpecialityPosition.LEFT);
        addEEnumLiteral(specialityPositionEEnum, SpecialityPosition.RIGHT);
        addEEnumLiteral(specialityPositionEEnum, SpecialityPosition.CENTER);
        addEEnumLiteral(specialityPositionEEnum, SpecialityPosition.ATTACKING);
        addEEnumLiteral(specialityPositionEEnum, SpecialityPosition.DEFENSIVE);
        addEEnumLiteral(specialityPositionEEnum, SpecialityPosition.SWEEPER);
        addEEnumLiteral(specialityPositionEEnum, SpecialityPosition.KEEPER);

        // Create resource
        createResource(eNS_URI);
    }

} //SoccerPackageImpl
