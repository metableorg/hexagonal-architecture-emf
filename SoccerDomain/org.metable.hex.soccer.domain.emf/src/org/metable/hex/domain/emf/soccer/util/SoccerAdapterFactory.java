/**
 */
package org.metable.hex.domain.emf.soccer.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.metable.hex.domain.emf.soccer.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.metable.hex.domain.emf.soccer.SoccerPackage
 * @generated
 */
public class SoccerAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SoccerPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoccerAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SoccerPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SoccerSwitch<Adapter> modelSwitch =
        new SoccerSwitch<Adapter>() {
            @Override
            public Adapter casePosition(Position object) {
                return createPositionAdapter();
            }
            @Override
            public Adapter casePlayer(Player object) {
                return createPlayerAdapter();
            }
            @Override
            public Adapter caseRosterMember(RosterMember object) {
                return createRosterMemberAdapter();
            }
            @Override
            public Adapter caseTeam(Team object) {
                return createTeamAdapter();
            }
            @Override
            public Adapter caseSoccerUniverse(SoccerUniverse object) {
                return createSoccerUniverseAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.domain.emf.soccer.Position <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.metable.hex.domain.emf.soccer.Position
     * @generated
     */
    public Adapter createPositionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.domain.emf.soccer.Player <em>Player</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.metable.hex.domain.emf.soccer.Player
     * @generated
     */
    public Adapter createPlayerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.domain.emf.soccer.RosterMember <em>Roster Member</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.metable.hex.domain.emf.soccer.RosterMember
     * @generated
     */
    public Adapter createRosterMemberAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.domain.emf.soccer.Team <em>Team</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.metable.hex.domain.emf.soccer.Team
     * @generated
     */
    public Adapter createTeamAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.metable.hex.domain.emf.soccer.SoccerUniverse <em>Universe</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.metable.hex.domain.emf.soccer.SoccerUniverse
     * @generated
     */
    public Adapter createSoccerUniverseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //SoccerAdapterFactory
