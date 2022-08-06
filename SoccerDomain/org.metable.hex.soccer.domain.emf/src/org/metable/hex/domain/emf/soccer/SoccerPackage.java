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
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfPositionImpl <em>Emf Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.EmfPositionImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfPosition()
     * @generated
     */
    int EMF_POSITION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_POSITION__NAME = 0;

    /**
     * The feature id for the '<em><b>Field Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_POSITION__FIELD_POSITION = 1;

    /**
     * The feature id for the '<em><b>Speciality Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_POSITION__SPECIALITY_POSITION = 2;

    /**
     * The number of structural features of the '<em>Emf Position</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_POSITION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Emf Position</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_POSITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfPlayerImpl <em>Emf Player</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.EmfPlayerImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfPlayer()
     * @generated
     */
    int EMF_PLAYER = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_PLAYER__ID = 0;

    /**
     * The feature id for the '<em><b>First Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_PLAYER__FIRST_NAME = 1;

    /**
     * The feature id for the '<em><b>Last Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_PLAYER__LAST_NAME = 2;

    /**
     * The number of structural features of the '<em>Emf Player</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_PLAYER_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Emf Player</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_PLAYER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfRosterMemberImpl <em>Emf Roster Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.EmfRosterMemberImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfRosterMember()
     * @generated
     */
    int EMF_ROSTER_MEMBER = 2;

    /**
     * The feature id for the '<em><b>Player</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_ROSTER_MEMBER__PLAYER = 0;

    /**
     * The feature id for the '<em><b>Position</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_ROSTER_MEMBER__POSITION = 1;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_ROSTER_MEMBER__NUMBER = 2;

    /**
     * The number of structural features of the '<em>Emf Roster Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_ROSTER_MEMBER_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Emf Roster Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_ROSTER_MEMBER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfTeamImpl <em>Emf Team</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.EmfTeamImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfTeam()
     * @generated
     */
    int EMF_TEAM = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_TEAM__NAME = 0;

    /**
     * The feature id for the '<em><b>Roster</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_TEAM__ROSTER = 1;

    /**
     * The number of structural features of the '<em>Emf Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_TEAM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Emf Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_TEAM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfSoccerUniverseImpl <em>Emf Soccer Universe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.impl.EmfSoccerUniverseImpl
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfSoccerUniverse()
     * @generated
     */
    int EMF_SOCCER_UNIVERSE = 4;

    /**
     * The feature id for the '<em><b>Players</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_SOCCER_UNIVERSE__PLAYERS = 0;

    /**
     * The feature id for the '<em><b>Teams</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_SOCCER_UNIVERSE__TEAMS = 1;

    /**
     * The feature id for the '<em><b>Positions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_SOCCER_UNIVERSE__POSITIONS = 2;

    /**
     * The number of structural features of the '<em>Emf Soccer Universe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_SOCCER_UNIVERSE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Emf Soccer Universe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMF_SOCCER_UNIVERSE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.EmfFieldPosition <em>Emf Field Position</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.EmfFieldPosition
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfFieldPosition()
     * @generated
     */
    int EMF_FIELD_POSITION = 5;

    /**
     * The meta object id for the '{@link org.metable.hex.domain.emf.soccer.EmfSpecialityPosition <em>Emf Speciality Position</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.metable.hex.domain.emf.soccer.EmfSpecialityPosition
     * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfSpecialityPosition()
     * @generated
     */
    int EMF_SPECIALITY_POSITION = 6;


    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.EmfPosition <em>Emf Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emf Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfPosition
     * @generated
     */
    EClass getEmfPosition();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.EmfPosition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfPosition#getName()
     * @see #getEmfPosition()
     * @generated
     */
    EAttribute getEmfPosition_Name();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.EmfPosition#getFieldPosition <em>Field Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfPosition#getFieldPosition()
     * @see #getEmfPosition()
     * @generated
     */
    EAttribute getEmfPosition_FieldPosition();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.EmfPosition#getSpecialityPosition <em>Speciality Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Speciality Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfPosition#getSpecialityPosition()
     * @see #getEmfPosition()
     * @generated
     */
    EAttribute getEmfPosition_SpecialityPosition();

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.EmfPlayer <em>Emf Player</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emf Player</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfPlayer
     * @generated
     */
    EClass getEmfPlayer();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.EmfPlayer#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfPlayer#getId()
     * @see #getEmfPlayer()
     * @generated
     */
    EAttribute getEmfPlayer_Id();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.EmfPlayer#getFirstName <em>First Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>First Name</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfPlayer#getFirstName()
     * @see #getEmfPlayer()
     * @generated
     */
    EAttribute getEmfPlayer_FirstName();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.EmfPlayer#getLastName <em>Last Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Name</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfPlayer#getLastName()
     * @see #getEmfPlayer()
     * @generated
     */
    EAttribute getEmfPlayer_LastName();

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.EmfRosterMember <em>Emf Roster Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emf Roster Member</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfRosterMember
     * @generated
     */
    EClass getEmfRosterMember();

    /**
     * Returns the meta object for the reference '{@link org.metable.hex.domain.emf.soccer.EmfRosterMember#getPlayer <em>Player</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Player</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfRosterMember#getPlayer()
     * @see #getEmfRosterMember()
     * @generated
     */
    EReference getEmfRosterMember_Player();

    /**
     * Returns the meta object for the reference '{@link org.metable.hex.domain.emf.soccer.EmfRosterMember#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfRosterMember#getPosition()
     * @see #getEmfRosterMember()
     * @generated
     */
    EReference getEmfRosterMember_Position();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.EmfRosterMember#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfRosterMember#getNumber()
     * @see #getEmfRosterMember()
     * @generated
     */
    EAttribute getEmfRosterMember_Number();

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.EmfTeam <em>Emf Team</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emf Team</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfTeam
     * @generated
     */
    EClass getEmfTeam();

    /**
     * Returns the meta object for the attribute '{@link org.metable.hex.domain.emf.soccer.EmfTeam#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfTeam#getName()
     * @see #getEmfTeam()
     * @generated
     */
    EAttribute getEmfTeam_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.metable.hex.domain.emf.soccer.EmfTeam#getRoster <em>Roster</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Roster</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfTeam#getRoster()
     * @see #getEmfTeam()
     * @generated
     */
    EReference getEmfTeam_Roster();

    /**
     * Returns the meta object for class '{@link org.metable.hex.domain.emf.soccer.EmfSoccerUniverse <em>Emf Soccer Universe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emf Soccer Universe</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfSoccerUniverse
     * @generated
     */
    EClass getEmfSoccerUniverse();

    /**
     * Returns the meta object for the containment reference list '{@link org.metable.hex.domain.emf.soccer.EmfSoccerUniverse#getPlayers <em>Players</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Players</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfSoccerUniverse#getPlayers()
     * @see #getEmfSoccerUniverse()
     * @generated
     */
    EReference getEmfSoccerUniverse_Players();

    /**
     * Returns the meta object for the containment reference list '{@link org.metable.hex.domain.emf.soccer.EmfSoccerUniverse#getTeams <em>Teams</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Teams</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfSoccerUniverse#getTeams()
     * @see #getEmfSoccerUniverse()
     * @generated
     */
    EReference getEmfSoccerUniverse_Teams();

    /**
     * Returns the meta object for the containment reference list '{@link org.metable.hex.domain.emf.soccer.EmfSoccerUniverse#getPositions <em>Positions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Positions</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfSoccerUniverse#getPositions()
     * @see #getEmfSoccerUniverse()
     * @generated
     */
    EReference getEmfSoccerUniverse_Positions();

    /**
     * Returns the meta object for enum '{@link org.metable.hex.domain.emf.soccer.EmfFieldPosition <em>Emf Field Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Emf Field Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfFieldPosition
     * @generated
     */
    EEnum getEmfFieldPosition();

    /**
     * Returns the meta object for enum '{@link org.metable.hex.domain.emf.soccer.EmfSpecialityPosition <em>Emf Speciality Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Emf Speciality Position</em>'.
     * @see org.metable.hex.domain.emf.soccer.EmfSpecialityPosition
     * @generated
     */
    EEnum getEmfSpecialityPosition();

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
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfPositionImpl <em>Emf Position</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.EmfPositionImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfPosition()
         * @generated
         */
        EClass EMF_POSITION = eINSTANCE.getEmfPosition();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_POSITION__NAME = eINSTANCE.getEmfPosition_Name();

        /**
         * The meta object literal for the '<em><b>Field Position</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_POSITION__FIELD_POSITION = eINSTANCE.getEmfPosition_FieldPosition();

        /**
         * The meta object literal for the '<em><b>Speciality Position</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_POSITION__SPECIALITY_POSITION = eINSTANCE.getEmfPosition_SpecialityPosition();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfPlayerImpl <em>Emf Player</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.EmfPlayerImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfPlayer()
         * @generated
         */
        EClass EMF_PLAYER = eINSTANCE.getEmfPlayer();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_PLAYER__ID = eINSTANCE.getEmfPlayer_Id();

        /**
         * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_PLAYER__FIRST_NAME = eINSTANCE.getEmfPlayer_FirstName();

        /**
         * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_PLAYER__LAST_NAME = eINSTANCE.getEmfPlayer_LastName();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfRosterMemberImpl <em>Emf Roster Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.EmfRosterMemberImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfRosterMember()
         * @generated
         */
        EClass EMF_ROSTER_MEMBER = eINSTANCE.getEmfRosterMember();

        /**
         * The meta object literal for the '<em><b>Player</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMF_ROSTER_MEMBER__PLAYER = eINSTANCE.getEmfRosterMember_Player();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMF_ROSTER_MEMBER__POSITION = eINSTANCE.getEmfRosterMember_Position();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_ROSTER_MEMBER__NUMBER = eINSTANCE.getEmfRosterMember_Number();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfTeamImpl <em>Emf Team</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.EmfTeamImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfTeam()
         * @generated
         */
        EClass EMF_TEAM = eINSTANCE.getEmfTeam();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMF_TEAM__NAME = eINSTANCE.getEmfTeam_Name();

        /**
         * The meta object literal for the '<em><b>Roster</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMF_TEAM__ROSTER = eINSTANCE.getEmfTeam_Roster();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.impl.EmfSoccerUniverseImpl <em>Emf Soccer Universe</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.impl.EmfSoccerUniverseImpl
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfSoccerUniverse()
         * @generated
         */
        EClass EMF_SOCCER_UNIVERSE = eINSTANCE.getEmfSoccerUniverse();

        /**
         * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMF_SOCCER_UNIVERSE__PLAYERS = eINSTANCE.getEmfSoccerUniverse_Players();

        /**
         * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMF_SOCCER_UNIVERSE__TEAMS = eINSTANCE.getEmfSoccerUniverse_Teams();

        /**
         * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMF_SOCCER_UNIVERSE__POSITIONS = eINSTANCE.getEmfSoccerUniverse_Positions();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.EmfFieldPosition <em>Emf Field Position</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.EmfFieldPosition
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfFieldPosition()
         * @generated
         */
        EEnum EMF_FIELD_POSITION = eINSTANCE.getEmfFieldPosition();

        /**
         * The meta object literal for the '{@link org.metable.hex.domain.emf.soccer.EmfSpecialityPosition <em>Emf Speciality Position</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.metable.hex.domain.emf.soccer.EmfSpecialityPosition
         * @see org.metable.hex.domain.emf.soccer.impl.SoccerPackageImpl#getEmfSpecialityPosition()
         * @generated
         */
        EEnum EMF_SPECIALITY_POSITION = eINSTANCE.getEmfSpecialityPosition();

    }

} //SoccerPackage
