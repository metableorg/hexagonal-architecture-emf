/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.metable.hex.domain.emf.soccer.EmfPlayer;
import org.metable.hex.domain.emf.soccer.EmfPosition;
import org.metable.hex.domain.emf.soccer.EmfSoccerUniverse;
import org.metable.hex.domain.emf.soccer.EmfTeam;
import org.metable.hex.domain.emf.soccer.SoccerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Soccer Universe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfSoccerUniverseImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfSoccerUniverseImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfSoccerUniverseImpl#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfSoccerUniverseImpl extends MinimalEObjectImpl.Container implements EmfSoccerUniverse {
    /**
     * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlayers()
     * @generated
     * @ordered
     */
    protected EList<EmfPlayer> players;

    /**
     * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeams()
     * @generated
     * @ordered
     */
    protected EList<EmfTeam> teams;

    /**
     * The cached value of the '{@link #getPositions() <em>Positions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositions()
     * @generated
     * @ordered
     */
    protected EList<EmfPosition> positions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmfSoccerUniverseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.EMF_SOCCER_UNIVERSE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EmfPlayer> getPlayers() {
        if (players == null) {
            players = new EObjectContainmentEList<EmfPlayer>(EmfPlayer.class, this, SoccerPackage.EMF_SOCCER_UNIVERSE__PLAYERS);
        }
        return players;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EmfTeam> getTeams() {
        if (teams == null) {
            teams = new EObjectContainmentEList<EmfTeam>(EmfTeam.class, this, SoccerPackage.EMF_SOCCER_UNIVERSE__TEAMS);
        }
        return teams;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EmfPosition> getPositions() {
        if (positions == null) {
            positions = new EObjectContainmentEList<EmfPosition>(EmfPosition.class, this, SoccerPackage.EMF_SOCCER_UNIVERSE__POSITIONS);
        }
        return positions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SoccerPackage.EMF_SOCCER_UNIVERSE__PLAYERS:
                return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
            case SoccerPackage.EMF_SOCCER_UNIVERSE__TEAMS:
                return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
            case SoccerPackage.EMF_SOCCER_UNIVERSE__POSITIONS:
                return ((InternalEList<?>)getPositions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SoccerPackage.EMF_SOCCER_UNIVERSE__PLAYERS:
                return getPlayers();
            case SoccerPackage.EMF_SOCCER_UNIVERSE__TEAMS:
                return getTeams();
            case SoccerPackage.EMF_SOCCER_UNIVERSE__POSITIONS:
                return getPositions();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SoccerPackage.EMF_SOCCER_UNIVERSE__PLAYERS:
                getPlayers().clear();
                getPlayers().addAll((Collection<? extends EmfPlayer>)newValue);
                return;
            case SoccerPackage.EMF_SOCCER_UNIVERSE__TEAMS:
                getTeams().clear();
                getTeams().addAll((Collection<? extends EmfTeam>)newValue);
                return;
            case SoccerPackage.EMF_SOCCER_UNIVERSE__POSITIONS:
                getPositions().clear();
                getPositions().addAll((Collection<? extends EmfPosition>)newValue);
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
            case SoccerPackage.EMF_SOCCER_UNIVERSE__PLAYERS:
                getPlayers().clear();
                return;
            case SoccerPackage.EMF_SOCCER_UNIVERSE__TEAMS:
                getTeams().clear();
                return;
            case SoccerPackage.EMF_SOCCER_UNIVERSE__POSITIONS:
                getPositions().clear();
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
            case SoccerPackage.EMF_SOCCER_UNIVERSE__PLAYERS:
                return players != null && !players.isEmpty();
            case SoccerPackage.EMF_SOCCER_UNIVERSE__TEAMS:
                return teams != null && !teams.isEmpty();
            case SoccerPackage.EMF_SOCCER_UNIVERSE__POSITIONS:
                return positions != null && !positions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EmfSoccerUniverseImpl
