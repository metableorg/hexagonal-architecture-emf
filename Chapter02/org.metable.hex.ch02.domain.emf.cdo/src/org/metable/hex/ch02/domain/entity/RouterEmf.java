/**
 */
package org.metable.hex.ch02.domain.entity;

import java.util.List;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.RouterId;
import org.metable.hex.ch02.domain.valueobject.RouterType;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Router Emf</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.metable.hex.ch02.domain.entity.RouterEmf#getId <em>Id</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.entity.RouterEmf#getSwitch <em>Switch</em>}</li>
 * <li>{@link org.metable.hex.ch02.domain.entity.RouterEmf#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.metable.hex.ch02.domain.entity.EntityPackage#getRouterEmf()
 * @model kind="class" superTypes="org.metable.hex.ch02.domain.entity.IRouter"
 * @extends CDOObject
 * @generated
 */
public class RouterEmf extends CDOObjectImpl implements CDOObject, IRouter {

    @Override
    public String toString() {
        return "RouterEmf [entity=" + entity + "]";
    }

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue) {
        super.eSet(eFeature, newValue);

        switch (eFeature.getFeatureID()) {
        case EntityPackage.ROUTER_EMF__ID:
            getEntity().setId(getId());
            break;
        case EntityPackage.ROUTER_EMF__TYPE:
            getEntity().setType(getType());
            break;
        case EntityPackage.ROUTER_EMF__SWITCH:
            getEntity().setSwitch(getSwitch());
            break;
        }
    }

    private Router entity;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected RouterEmf() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EntityPackage.Literals.ROUTER_EMF;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(RouterId)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getRouterEmf_Id()
     * @model dataType="org.metable.hex.ch02.domain.entity.RouterId"
     * @generated
     */
    public RouterId getId() {
        return (RouterId) eGet(EntityPackage.Literals.ROUTER_EMF__ID, true);
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.RouterEmf#getId <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newId the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated OFF
     */
    public void setId(RouterId newId) {
        getEntity().setId(newId);
        eSet(EntityPackage.Literals.ROUTER_EMF__ID, newId);
    }

    /**
     * Returns the value of the '<em><b>Switch</b></em>' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the value of the '<em>Switch</em>' containment reference.
     * @see #setSwitch(SwitchEmf)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getRouterEmf_Switch()
     * @model containment="true"
     * @generated
     */
    public SwitchEmf getSwitch() {
        return (SwitchEmf) eGet(EntityPackage.Literals.ROUTER_EMF__SWITCH, true);
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.RouterEmf#getSwitch <em>Switch</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newSwitch the new value of the '<em>Switch</em>' containment reference.
     * @see #getSwitch()
     * @generated OFF
     */
    public void setSwitch(SwitchEmf newSwitch) {
        eSet(EntityPackage.Literals.ROUTER_EMF__SWITCH, newSwitch);
    }

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(RouterType)
     * @see org.metable.hex.ch02.domain.entity.EntityPackage#getRouterEmf_Type()
     * @model dataType="org.metable.hex.ch02.domain.entity.RouterType"
     * @generated
     */
    public RouterType getType() {
        return (RouterType) eGet(EntityPackage.Literals.ROUTER_EMF__TYPE, true);
    }

    /**
     * Sets the value of the '{@link org.metable.hex.ch02.domain.entity.RouterEmf#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param newType the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated OFF
     */
    public void setType(RouterType newType) {
        eSet(EntityPackage.Literals.ROUTER_EMF__TYPE, newType);
    }

    @Override
    public void addNetworkToSwitch(Network network) {
        getEntity().addNetworkToSwitch(network);
    }

    private Router getEntity() {
        return entity;
    }

    @Override
    public Network createNetwork(IP address, String name, int cidr) {
        return getEntity().createNetwork(address, name, cidr);
    }

    @Override
    public List<Network> retrieveNetworks() {
        return getEntity().retrieveNetworks();
    }

    @Override
    public void setSwitch(ISwitch value) {
        setSwitch((SwitchEmf) value);
    }

    public void setEntity(Router router) {
        entity = router;
        setId(router.getId());
        setType(router.getType());
    }

} // RouterEmf
