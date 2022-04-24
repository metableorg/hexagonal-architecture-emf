/**
 */
package org.metable.hex.ch02.domain.emf.network;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.metable.hex.ch02.domain.emf.network.NetworkPackage
 * @generated
 */
public interface NetworkFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NetworkFactory eINSTANCE = org.metable.hex.ch02.domain.emf.network.impl.NetworkFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Router</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Router</em>'.
     * @generated
     */
    Router createRouter();

    /**
     * Returns a new object of class '<em>Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch</em>'.
     * @generated
     */
    Switch createSwitch();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    NetworkPackage getNetworkPackage();

} //NetworkFactory
