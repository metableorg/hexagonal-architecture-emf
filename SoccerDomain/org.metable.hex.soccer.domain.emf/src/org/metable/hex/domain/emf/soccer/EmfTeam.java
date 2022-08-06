/**
 */
package org.metable.hex.domain.emf.soccer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfTeam#getId <em>Id</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfTeam#getName <em>Name</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.EmfTeam#getRoster <em>Roster</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfTeam()
 * @model
 * @generated
 */
public interface EmfTeam extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfTeam_Id()
     * @model id="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfTeam#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfTeam_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.metable.hex.domain.emf.soccer.EmfTeam#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Roster</b></em>' containment reference list.
     * The list contents are of type {@link org.metable.hex.domain.emf.soccer.EmfRosterMember}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Roster</em>' containment reference list.
     * @see org.metable.hex.domain.emf.soccer.SoccerPackage#getEmfTeam_Roster()
     * @model containment="true"
     * @generated
     */
    EList<EmfRosterMember> getRoster();

} // EmfTeam
