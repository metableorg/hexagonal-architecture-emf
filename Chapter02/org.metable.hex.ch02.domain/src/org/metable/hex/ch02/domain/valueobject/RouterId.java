package org.metable.hex.ch02.domain.valueobject;

import java.util.UUID;

public final class RouterId {

    public static RouterId withId(String id) {
        return new RouterId(UUID.fromString(id));
    }

    public static RouterId withoutId() {
        return new RouterId(UUID.randomUUID());
    }

    private final UUID id;

    private RouterId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
