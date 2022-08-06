/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.metable.hex.domain.emf.soccer.EmfFieldPosition;
import org.metable.hex.domain.emf.soccer.EmfPlayer;
import org.metable.hex.domain.emf.soccer.EmfPosition;
import org.metable.hex.domain.emf.soccer.EmfRosterMember;
import org.metable.hex.domain.emf.soccer.EmfSoccerUniverse;
import org.metable.hex.domain.emf.soccer.EmfSpecialityPosition;
import org.metable.hex.domain.emf.soccer.EmfTeam;
import org.metable.hex.domain.emf.soccer.SoccerFactory;
import org.metable.hex.domain.emf.soccer.SoccerPackage;

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
    private EClass emfPositionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass emfPlayerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass emfRosterMemberEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass emfTeamEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass emfSoccerUniverseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum emfFieldPositionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum emfSpecialityPositionEEnum = null;

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
    public EClass getEmfPosition() {
        return emfPositionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEmfPosition_Name() {
        return (EAttribute)emfPositionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEmfPosition_FieldPosition() {
        return (EAttribute)emfPositionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEmfPosition_SpecialityPosition() {
        return (EAttribute)emfPositionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEmfPlayer() {
        return emfPlayerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEmfPlayer_Id() {
        return (EAttribute)emfPlayerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEmfPlayer_FirstName() {
        return (EAttribute)emfPlayerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEmfPlayer_LastName() {
        return (EAttribute)emfPlayerEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEmfRosterMember() {
        return emfRosterMemberEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEmfRosterMember_Player() {
        return (EReference)emfRosterMemberEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEmfRosterMember_Position() {
        return (EReference)emfRosterMemberEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEmfRosterMember_Number() {
        return (EAttribute)emfRosterMemberEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEmfTeam() {
        return emfTeamEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEmfTeam_Id() {
        return (EAttribute)emfTeamEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEmfTeam_Name() {
        return (EAttribute)emfTeamEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEmfTeam_Roster() {
        return (EReference)emfTeamEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEmfSoccerUniverse() {
        return emfSoccerUniverseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEmfSoccerUniverse_Players() {
        return (EReference)emfSoccerUniverseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEmfSoccerUniverse_Teams() {
        return (EReference)emfSoccerUniverseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEmfSoccerUniverse_Positions() {
        return (EReference)emfSoccerUniverseEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEmfFieldPosition() {
        return emfFieldPositionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEmfSpecialityPosition() {
        return emfSpecialityPositionEEnum;
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
        emfPositionEClass = createEClass(EMF_POSITION);
        createEAttribute(emfPositionEClass, EMF_POSITION__NAME);
        createEAttribute(emfPositionEClass, EMF_POSITION__FIELD_POSITION);
        createEAttribute(emfPositionEClass, EMF_POSITION__SPECIALITY_POSITION);

        emfPlayerEClass = createEClass(EMF_PLAYER);
        createEAttribute(emfPlayerEClass, EMF_PLAYER__ID);
        createEAttribute(emfPlayerEClass, EMF_PLAYER__FIRST_NAME);
        createEAttribute(emfPlayerEClass, EMF_PLAYER__LAST_NAME);

        emfRosterMemberEClass = createEClass(EMF_ROSTER_MEMBER);
        createEReference(emfRosterMemberEClass, EMF_ROSTER_MEMBER__PLAYER);
        createEReference(emfRosterMemberEClass, EMF_ROSTER_MEMBER__POSITION);
        createEAttribute(emfRosterMemberEClass, EMF_ROSTER_MEMBER__NUMBER);

        emfTeamEClass = createEClass(EMF_TEAM);
        createEAttribute(emfTeamEClass, EMF_TEAM__ID);
        createEAttribute(emfTeamEClass, EMF_TEAM__NAME);
        createEReference(emfTeamEClass, EMF_TEAM__ROSTER);

        emfSoccerUniverseEClass = createEClass(EMF_SOCCER_UNIVERSE);
        createEReference(emfSoccerUniverseEClass, EMF_SOCCER_UNIVERSE__PLAYERS);
        createEReference(emfSoccerUniverseEClass, EMF_SOCCER_UNIVERSE__TEAMS);
        createEReference(emfSoccerUniverseEClass, EMF_SOCCER_UNIVERSE__POSITIONS);

        // Create enums
        emfFieldPositionEEnum = createEEnum(EMF_FIELD_POSITION);
        emfSpecialityPositionEEnum = createEEnum(EMF_SPECIALITY_POSITION);
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
        initEClass(emfPositionEClass, EmfPosition.class, "EmfPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEmfPosition_Name(), ecorePackage.getEString(), "name", null, 0, 1, EmfPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEmfPosition_FieldPosition(), this.getEmfFieldPosition(), "fieldPosition", null, 0, 1, EmfPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEmfPosition_SpecialityPosition(), this.getEmfSpecialityPosition(), "specialityPosition", null, 0, 1, EmfPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(emfPlayerEClass, EmfPlayer.class, "EmfPlayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEmfPlayer_Id(), ecorePackage.getEString(), "id", null, 0, 1, EmfPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEmfPlayer_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, EmfPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEmfPlayer_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, EmfPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(emfRosterMemberEClass, EmfRosterMember.class, "EmfRosterMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEmfRosterMember_Player(), this.getEmfPlayer(), null, "player", null, 0, 1, EmfRosterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEmfRosterMember_Position(), this.getEmfPosition(), null, "position", null, 0, 1, EmfRosterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEmfRosterMember_Number(), ecorePackage.getEInt(), "number", null, 0, 1, EmfRosterMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(emfTeamEClass, EmfTeam.class, "EmfTeam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEmfTeam_Id(), ecorePackage.getEString(), "id", null, 0, 1, EmfTeam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEmfTeam_Name(), ecorePackage.getEString(), "name", null, 0, 1, EmfTeam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEmfTeam_Roster(), this.getEmfRosterMember(), null, "roster", null, 0, -1, EmfTeam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(emfSoccerUniverseEClass, EmfSoccerUniverse.class, "EmfSoccerUniverse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEmfSoccerUniverse_Players(), this.getEmfPlayer(), null, "players", null, 0, -1, EmfSoccerUniverse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEmfSoccerUniverse_Teams(), this.getEmfTeam(), null, "teams", null, 0, -1, EmfSoccerUniverse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEmfSoccerUniverse_Positions(), this.getEmfPosition(), null, "positions", null, 0, -1, EmfSoccerUniverse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(emfFieldPositionEEnum, EmfFieldPosition.class, "EmfFieldPosition");
        addEEnumLiteral(emfFieldPositionEEnum, EmfFieldPosition.FORWARD);
        addEEnumLiteral(emfFieldPositionEEnum, EmfFieldPosition.MIDDLE);
        addEEnumLiteral(emfFieldPositionEEnum, EmfFieldPosition.BACK);

        initEEnum(emfSpecialityPositionEEnum, EmfSpecialityPosition.class, "EmfSpecialityPosition");
        addEEnumLiteral(emfSpecialityPositionEEnum, EmfSpecialityPosition.STRIKER);
        addEEnumLiteral(emfSpecialityPositionEEnum, EmfSpecialityPosition.WING);
        addEEnumLiteral(emfSpecialityPositionEEnum, EmfSpecialityPosition.LEFT);
        addEEnumLiteral(emfSpecialityPositionEEnum, EmfSpecialityPosition.RIGHT);
        addEEnumLiteral(emfSpecialityPositionEEnum, EmfSpecialityPosition.CENTER);
        addEEnumLiteral(emfSpecialityPositionEEnum, EmfSpecialityPosition.ATTACKING);
        addEEnumLiteral(emfSpecialityPositionEEnum, EmfSpecialityPosition.DEFENSIVE);
        addEEnumLiteral(emfSpecialityPositionEEnum, EmfSpecialityPosition.SWEEPER);
        addEEnumLiteral(emfSpecialityPositionEEnum, EmfSpecialityPosition.KEEPER);

        // Create resource
        createResource(eNS_URI);
    }

} //SoccerPackageImpl
