package org.metable.hex.ch02.domain.valueobject;

import java.util.UUID;

public final class SwitchId {

    private final UUID id;

    private SwitchId(UUID id) {
        this.id = id;
    }

    public static SwitchId withId(String id) {
        return new SwitchId(UUID.fromString(id));
    }

    public static SwitchId withoutId() {
        return new SwitchId(UUID.randomUUID());
    }

    public String toString() {
        return id.toString(); 
    }
}
