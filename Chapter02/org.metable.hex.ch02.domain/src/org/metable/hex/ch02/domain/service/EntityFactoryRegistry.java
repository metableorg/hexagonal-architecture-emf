package org.metable.hex.ch02.domain.service;

public final class EntityFactoryRegistry {

    private static EntityFactory entityFactory;

    public static EntityFactory getFactory() {
        return entityFactory;
    }

    public static void registerFactory(EntityFactory factory) {
        entityFactory = factory;
    }

    private EntityFactoryRegistry() {
    }
}
