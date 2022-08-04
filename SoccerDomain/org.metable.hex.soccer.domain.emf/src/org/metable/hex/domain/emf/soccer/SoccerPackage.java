/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.metable.hex.domain.emf.soccer.SoccerFactory
 * @model kind="package"
 * @generated
 */
public interface SoccerPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "soccer";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://org.metable.hex.soccer.domain.emf/soccer/v1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.metable.hex.soccer.domain.emf";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SoccerPackage eINSTANCE = org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl.init();

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.PositionImpl <em>Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.PositionImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getPosition()
     * @generated
     */
    int POSITION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__NAME = 0;

    /**
     * The feature id for the '<em><b>Field Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__FIELD_POSITION = 1;

    /**
     * The feature id for the '<em><b>Speciality Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__SPECIALITY_POSITION = 2;

    /**
     * The number of structural features of the '<em>Position</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Position</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.PlayerImpl <em>Player</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.PlayerImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getPlayer()
     * @generated
     */
    int PLAYER = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER__ID = 0;

    /**
     * The feature id for the '<em><b>First Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER__FIRST_NAME = 1;

    /**
     * The feature id for the '<em><b>Last Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER__LAST_NAME = 2;

    /**
     * The number of structural features of the '<em>Player</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Player</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.RosterMemberImpl <em>Roster Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.RosterMemberImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getRosterMember()
     * @generated
     */
    int ROSTER_MEMBER = 2;

    /**
     * The feature id for the '<em><b>Player</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSTER_MEMBER__PLAYER = 0;

    /**
     * The feature id for the '<em><b>Position</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSTER_MEMBER__POSITION = 1;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSTER_MEMBER__NUMBER = 2;

    /**
     * The number of structural features of the '<em>Roster Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSTER_MEMBER_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Roster Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSTER_MEMBER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.TeamImpl <em>Team</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.TeamImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getTeam()
     * @generated
     */
    int TEAM = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM__ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM__NAME = 1;

    /**
     * The feature id for the '<em><b>Roster</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM__ROSTER = 2;

    /**
     * The number of structural features of the '<em>Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.SoccerUniverseImpl <em>Universe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerUniverseImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getSoccerUniverse()
     * @generated
     */
    int SOCCER_UNIVERSE = 4;

    /**
     * The feature id for the '<em><b>Players</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOCCER_UNIVERSE__PLAYERS = 0;

    /**
     * The feature id for the '<em><b>Teams</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOCCER_UNIVERSE__TEAMS = 1;

    /**
     * The feature id for the '<em><b>Positions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOCCER_UNIVERSE__POSITIONS = 2;

    /**
     * The number of structural features of the '<em>Universe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOCCER_UNIVERSE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Universe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOCCER_UNIVERSE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.FieldPosition <em>Field Position</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.FieldPosition
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getFieldPosition()
     * @generated
     */
    int FIELD_POSITION = 5;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.SpecialityPosition <em>Speciality Position</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.SpecialityPosition
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getSpecialityPosition()
     * @generated
     */
    int SPECIALITY_POSITION = 6;


    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.Position <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.Position
     * @generated
     */
    EClass getPosition();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.Position#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.metable.hex.domain.emf.soccer.Position#getName()
     * @see #getPosition()
     * @generated
     */
    EAttribute getPosition_Name();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.Position#getFieldPosition <em>Field Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.Position#getFieldPosition()
     * @see #getPosition()
     * @generated
     */
    EAttribute getPosition_FieldPosition();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.Position#getSpecialityPosition <em>Speciality Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Speciality Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.Position#getSpecialityPosition()
     * @see #getPosition()
     * @generated
     */
    EAttribute getPosition_SpecialityPosition();

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.Player <em>Player</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Player</em>'.
     * @see org.metable.hex.domain.emf.soccer.Player
     * @generated
     */
    EClass getPlayer();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.Player#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.domain.emf.soccer.Player#getId()
     * @see #getPlayer()
     * @generated
     */
    EAttribute getPlayer_Id();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.Player#getFirstName <em>First Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>First Name</em>'.
     * @see org.metable.hex.domain.emf.soccer.Player#getFirstName()
     * @see #getPlayer()
     * @generated
     */
    EAttribute getPlayer_FirstName();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.Player#getLastName <em>Last Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Name</em>'.
     * @see org.metable.hex.domain.emf.soccer.Player#getLastName()
     * @see #getPlayer()
     * @generated
     */
    EAttribute getPlayer_LastName();

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.RosterMember <em>Roster Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Roster Member</em>'.
     * @see org.metable.hex.domain.emf.soccer.RosterMember
     * @generated
     */
    EClass getRosterMember();

    /**
     * Returns the meta object for the reference '{@link org.metable.hex.domain.emf.soccer.RosterMember#getPlayer <em>Player</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Player</em>'.
     * @see org.metable.hex.domain.emf.soccer.RosterMember#getPlayer()
     * @see #getRosterMember()
     * @generated
     */
    EReference getRosterMember_Player();

    /**
     * Returns the meta object for the reference '{@link org.metable.hex.domain.emf.soccer.RosterMember#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.RosterMember#getPosition()
     * @see #getRosterMember()
     * @generated
     */
    EReference getRosterMember_Position();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.RosterMember#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see org.metable.hex.domain.emf.soccer.RosterMember#getNumber()
     * @see #getRosterMember()
     * @generated
     */
    EAttribute getRosterMember_Number();

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.Team <em>Team</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Team</em>'.
     * @see org.metable.hex.domain.emf.soccer.Team
     * @generated
     */
    EClass getTeam();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.Team#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.domain.emf.soccer.Team#getId()
     * @see #getTeam()
     * @generated
     */
    EAttribute getTeam_Id();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.Team#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.metable.hex.domain.emf.soccer.Team#getName()
     * @see #getTeam()
     * @generated
     */
    EAttribute getTeam_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.metable.hex.domain.emf.soccer.Team#getRoster <em>Roster</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Roster</em>'.
     * @see org.metable.hex.domain.emf.soccer.Team#getRoster()
     * @see #getTeam()
     * @generated
     */
    EReference getTeam_Roster();

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.SoccerUniverse <em>Universe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Universe</em>'.
     * @see org.metable.hex.domain.emf.soccer.SoccerUniverse
     * @generated
     */
    EClass getSoccerUniverse();

    /**
     * Returns the meta object for the containment reference list '{@link org.metable.hex.domain.emf.soccer.SoccerUniverse#getPlayers <em>Players</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Players</em>'.
     * @see org.metable.hex.domain.emf.soccer.SoccerUniverse#getPlayers()
     * @see #getSoccerUniverse()
     * @generated
     */
    EReference getSoccerUniverse_Players();

    /**
     * Returns the meta object for the containment reference list '{@link org.metable.hex.domain.emf.soccer.SoccerUniverse#getTeams <em>Teams</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Teams</em>'.
     * @see org.metable.hex.domain.emf.soccer.SoccerUniverse#getTeams()
     * @see #getSoccerUniverse()
     * @generated
     */
    EReference getSoccerUniverse_Teams();

    /**
     * Returns the meta object for the containment reference list '{@link org.metable.hex.domain.emf.soccer.SoccerUniverse#getPositions <em>Positions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Positions</em>'.
     * @see org.metable.hex.domain.emf.soccer.SoccerUniverse#getPositions()
     * @see #getSoccerUniverse()
     * @generated
     */
    EReference getSoccerUniverse_Positions();

    /**
     * Returns the meta object for enum '{@link org.metable.hex.domain.emf.soccer.FieldPosition <em>Field Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Field Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.FieldPosition
     * @generated
     */
    EEnum getFieldPosition();

    /**
     * Returns the meta object for enum '{@link org.metable.hex.domain.emf.soccer.SpecialityPosition <em>Speciality Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Speciality Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.SpecialityPosition
     * @generated
     */
    EEnum getSpecialityPosition();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SoccerFactory getSoccerFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.PositionImpl <em>Position</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.PositionImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getPosition()
         * @generated
         */
        EClass POSITION = eINSTANCE.getPosition();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POSITION__NAME = eINSTANCE.getPosition_Name();

        /**
         * The meta object literal for the '<em><b>Field Position</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POSITION__FIELD_POSITION = eINSTANCE.getPosition_FieldPosition();

        /**
         * The meta object literal for the '<em><b>Speciality Position</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POSITION__SPECIALITY_POSITION = eINSTANCE.getPosition_SpecialityPosition();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.PlayerImpl <em>Player</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.PlayerImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getPlayer()
         * @generated
         */
        EClass PLAYER = eINSTANCE.getPlayer();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLAYER__ID = eINSTANCE.getPlayer_Id();

        /**
         * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLAYER__FIRST_NAME = eINSTANCE.getPlayer_FirstName();

        /**
         * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLAYER__LAST_NAME = eINSTANCE.getPlayer_LastName();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.RosterMemberImpl <em>Roster Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.RosterMemberImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getRosterMember()
         * @generated
         */
        EClass ROSTER_MEMBER = eINSTANCE.getRosterMember();

        /**
         * The meta object literal for the '<em><b>Player</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROSTER_MEMBER__PLAYER = eINSTANCE.getRosterMember_Player();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROSTER_MEMBER__POSITION = eINSTANCE.getRosterMember_Position();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROSTER_MEMBER__NUMBER = eINSTANCE.getRosterMember_Number();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.TeamImpl <em>Team</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.TeamImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getTeam()
         * @generated
         */
        EClass TEAM = eINSTANCE.getTeam();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEAM__ID = eINSTANCE.getTeam_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

        /**
         * The meta object literal for the '<em><b>Roster</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEAM__ROSTER = eINSTANCE.getTeam_Roster();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.SoccerUniverseImpl <em>Universe</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerUniverseImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getSoccerUniverse()
         * @generated
         */
        EClass SOCCER_UNIVERSE = eINSTANCE.getSoccerUniverse();

        /**
         * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOCCER_UNIVERSE__PLAYERS = eINSTANCE.getSoccerUniverse_Players();

        /**
         * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOCCER_UNIVERSE__TEAMS = eINSTANCE.getSoccerUniverse_Teams();

        /**
         * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOCCER_UNIVERSE__POSITIONS = eINSTANCE.getSoccerUniverse_Positions();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.FieldPosition <em>Field Position</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.FieldPosition
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getFieldPosition()
         * @generated
         */
        EEnum FIELD_POSITION = eINSTANCE.getFieldPosition();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.SpecialityPosition <em>Speciality Position</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.SpecialityPosition
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getSpecialityPosition()
         * @generated
         */
        EEnum SPECIALITY_POSITION = eINSTANCE.getSpecialityPosition();

    }

} //SoccerPackage
