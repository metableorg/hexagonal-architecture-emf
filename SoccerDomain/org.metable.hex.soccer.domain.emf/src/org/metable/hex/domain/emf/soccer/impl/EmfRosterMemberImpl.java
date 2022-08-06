/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.metable.hex.domain.emf.soccer.EmfPlayer;
import org.metable.hex.domain.emf.soccer.EmfPosition;
import org.metable.hex.domain.emf.soccer.EmfRosterMember;
import org.metable.hex.domain.emf.soccer.SoccerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Roster Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfRosterMemberImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfRosterMemberImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.EmfRosterMemberImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfRosterMemberImpl extends MinimalEObjectImpl.Container implements EmfRosterMember {
    /**
     * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlayer()
     * @generated
     * @ordered
     */
    protected EmfPlayer player;

    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected EmfPosition position;

    /**
     * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected int number = NUMBER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmfRosterMemberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.EMF_ROSTER_MEMBER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmfPlayer getPlayer() {
        if (player != null && player.eIsProxy()) {
            InternalEObject oldPlayer = (InternalEObject)player;
            player = (EmfPlayer)eResolveProxy(oldPlayer);
            if (player != oldPlayer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoccerPackage.EMF_ROSTER_MEMBER__PLAYER, oldPlayer, player));
            }
        }
        return player;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmfPlayer basicGetPlayer() {
        return player;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlayer(EmfPlayer newPlayer) {
        EmfPlayer oldPlayer = player;
        player = newPlayer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.EMF_ROSTER_MEMBER__PLAYER, oldPlayer, player));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmfPosition getPosition() {
        if (position != null && position.eIsProxy()) {
            InternalEObject oldPosition = (InternalEObject)position;
            position = (EmfPosition)eResolveProxy(oldPosition);
            if (position != oldPosition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoccerPackage.EMF_ROSTER_MEMBER__POSITION, oldPosition, position));
            }
        }
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmfPosition basicGetPosition() {
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPosition(EmfPosition newPosition) {
        EmfPosition oldPosition = position;
        position = newPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.EMF_ROSTER_MEMBER__POSITION, oldPosition, position));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNumber(int newNumber) {
        int oldNumber = number;
        number = newNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.EMF_ROSTER_MEMBER__NUMBER, oldNumber, number));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SoccerPackage.EMF_ROSTER_MEMBER__PLAYER:
                if (resolve) return getPlayer();
                return basicGetPlayer();
            case SoccerPackage.EMF_ROSTER_MEMBER__POSITION:
                if (resolve) return getPosition();
                return basicGetPosition();
            case SoccerPackage.EMF_ROSTER_MEMBER__NUMBER:
                return getNumber();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SoccerPackage.EMF_ROSTER_MEMBER__PLAYER:
                setPlayer((EmfPlayer)newValue);
                return;
            case SoccerPackage.EMF_ROSTER_MEMBER__POSITION:
                setPosition((EmfPosition)newValue);
                return;
            case SoccerPackage.EMF_ROSTER_MEMBER__NUMBER:
                setNumber((Integer)newValue);
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
            case SoccerPackage.EMF_ROSTER_MEMBER__PLAYER:
                setPlayer((EmfPlayer)null);
                return;
            case SoccerPackage.EMF_ROSTER_MEMBER__POSITION:
                setPosition((EmfPosition)null);
                return;
            case SoccerPackage.EMF_ROSTER_MEMBER__NUMBER:
                setNumber(NUMBER_EDEFAULT);
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
            case SoccerPackage.EMF_ROSTER_MEMBER__PLAYER:
                return player != null;
            case SoccerPackage.EMF_ROSTER_MEMBER__POSITION:
                return position != null;
            case SoccerPackage.EMF_ROSTER_MEMBER__NUMBER:
                return number != NUMBER_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (number: ");
        result.append(number);
        result.append(')');
        return result.toString();
    }

} //EmfRosterMemberImpl
