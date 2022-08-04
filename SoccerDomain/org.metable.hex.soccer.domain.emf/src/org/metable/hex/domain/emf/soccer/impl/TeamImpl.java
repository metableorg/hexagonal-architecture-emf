/**
 */
package org.metable.hex.domain.emf.soccer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.metable.hex.domain.emf.soccer.RosterMember;
import org.metable.hex.domain.emf.soccer.SoccerPackage;
import org.metable.hex.domain.emf.soccer.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.TeamImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.metable.hex.domain.emf.soccer.impl.TeamImpl#getRoster <em>Roster</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getRoster() <em>Roster</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoster()
     * @generated
     * @ordered
     */
    protected EList<RosterMember> roster;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TeamImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.TEAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.TEAM__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.TEAM__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RosterMember> getRoster() {
        if (roster == null) {
            roster = new EObjectContainmentEList<RosterMember>(RosterMember.class, this, SoccerPackage.TEAM__ROSTER);
        }
        return roster;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SoccerPackage.TEAM__ROSTER:
                return ((InternalEList<?>)getRoster()).basicRemove(otherEnd, msgs);
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
            case SoccerPackage.TEAM__ID:
                return getId();
            case SoccerPackage.TEAM__NAME:
                return getName();
            case SoccerPackage.TEAM__ROSTER:
                return getRoster();
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
            case SoccerPackage.TEAM__ID:
                setId((String)newValue);
                return;
            case SoccerPackage.TEAM__NAME:
                setName((String)newValue);
                return;
            case SoccerPackage.TEAM__ROSTER:
                getRoster().clear();
                getRoster().addAll((Collection<? extends RosterMember>)newValue);
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
            case SoccerPackage.TEAM__ID:
                setId(ID_EDEFAULT);
                return;
            case SoccerPackage.TEAM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SoccerPackage.TEAM__ROSTER:
                getRoster().clear();
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
            case SoccerPackage.TEAM__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case SoccerPackage.TEAM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case SoccerPackage.TEAM__ROSTER:
                return roster != null && !roster.isEmpty();
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
        result.append(" (id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //TeamImpl
