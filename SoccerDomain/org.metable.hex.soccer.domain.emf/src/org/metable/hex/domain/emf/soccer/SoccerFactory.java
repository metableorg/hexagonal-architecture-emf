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
     * Returns a new object of class '<em>Emf Position</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Emf Position</em>'.
     * @generated
     */
    EmfPosition createEmfPosition();

    /**
     * Returns a new object of class '<em>Emf Player</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Emf Player</em>'.
     * @generated
     */
    EmfPlayer createEmfPlayer();

    /**
     * Returns a new object of class '<em>Emf Roster Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Emf Roster Member</em>'.
     * @generated
     */
    EmfRosterMember createEmfRosterMember();

    /**
     * Returns a new object of class '<em>Emf Team</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Emf Team</em>'.
     * @generated
     */
    EmfTeam createEmfTeam();

    /**
     * Returns a new object of class '<em>Emf Soccer Universe</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Emf Soccer Universe</em>'.
     * @generated
     */
    EmfSoccerUniverse createEmfSoccerUniverse();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SoccerPackage getSoccerPackage();

} //SoccerFactory
