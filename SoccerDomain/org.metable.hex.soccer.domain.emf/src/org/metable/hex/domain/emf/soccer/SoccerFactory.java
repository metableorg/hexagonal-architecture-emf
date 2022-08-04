/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage
 * @generated
 */
public interface SoccerFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SoccerFactory eINSTANCE = org.metable.hex.domain.emf.soccer.impl.SoccerFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Position</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Position</em>'.
     * @generated
     */
    Position createPosition();

    /**
     * Returns a new object of class '<em>Player</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Player</em>'.
     * @generated
     */
    Player createPlayer();

    /**
     * Returns a new object of class '<em>Roster Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Roster Member</em>'.
     * @generated
     */
    RosterMember createRosterMember();

    /**
     * Returns a new object of class '<em>Team</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Team</em>'.
     * @generated
     */
    Team createTeam();

    /**
     * Returns a new object of class '<em>Universe</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Universe</em>'.
     * @generated
     */
    SoccerUniverse createSoccerUniverse();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SoccerPackage getSoccerPackage();

} //SoccerFactory
