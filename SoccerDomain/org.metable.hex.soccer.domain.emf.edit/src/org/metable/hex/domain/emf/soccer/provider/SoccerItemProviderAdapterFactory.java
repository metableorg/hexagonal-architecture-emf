/**
 */
package org.metable.hex.domain.emf.soccer.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.metable.hex.domain.emf.soccer.util.SoccerAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoccerItemProviderAdapterFactory extends SoccerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoccerItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.metable.hex.domain.emf.soccer.EmfPosition} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmfPositionItemProvider emfPositionItemProvider;

    /**
     * This creates an adapter for a {@link org.metable.hex.domain.emf.soccer.EmfPosition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEmfPositionAdapter() {
        if (emfPositionItemProvider == null) {
            emfPositionItemProvider = new EmfPositionItemProvider(this);
        }

        return emfPositionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.metable.hex.domain.emf.soccer.EmfPlayer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmfPlayerItemProvider emfPlayerItemProvider;

    /**
     * This creates an adapter for a {@link org.metable.hex.domain.emf.soccer.EmfPlayer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEmfPlayerAdapter() {
        if (emfPlayerItemProvider == null) {
            emfPlayerItemProvider = new EmfPlayerItemProvider(this);
        }

        return emfPlayerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.metable.hex.domain.emf.soccer.EmfRosterMember} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmfRosterMemberItemProvider emfRosterMemberItemProvider;

    /**
     * This creates an adapter for a {@link org.metable.hex.domain.emf.soccer.EmfRosterMember}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEmfRosterMemberAdapter() {
        if (emfRosterMemberItemProvider == null) {
            emfRosterMemberItemProvider = new EmfRosterMemberItemProvider(this);
        }

        return emfRosterMemberItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.metable.hex.domain.emf.soccer.EmfTeam} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmfTeamItemProvider emfTeamItemProvider;

    /**
     * This creates an adapter for a {@link org.metable.hex.domain.emf.soccer.EmfTeam}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEmfTeamAdapter() {
        if (emfTeamItemProvider == null) {
            emfTeamItemProvider = new EmfTeamItemProvider(this);
        }

        return emfTeamItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.metable.hex.domain.emf.soccer.EmfSoccerUniverse} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmfSoccerUniverseItemProvider emfSoccerUniverseItemProvider;

    /**
     * This creates an adapter for a {@link org.metable.hex.domain.emf.soccer.EmfSoccerUniverse}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEmfSoccerUniverseAdapter() {
        if (emfSoccerUniverseItemProvider == null) {
            emfSoccerUniverseItemProvider = new EmfSoccerUniverseItemProvider(this);
        }

        return emfSoccerUniverseItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void dispose() {
        if (emfPositionItemProvider != null) emfPositionItemProvider.dispose();
        if (emfPlayerItemProvider != null) emfPlayerItemProvider.dispose();
        if (emfRosterMemberItemProvider != null) emfRosterMemberItemProvider.dispose();
        if (emfTeamItemProvider != null) emfTeamItemProvider.dispose();
        if (emfSoccerUniverseItemProvider != null) emfSoccerUniverseItemProvider.dispose();
    }

}
