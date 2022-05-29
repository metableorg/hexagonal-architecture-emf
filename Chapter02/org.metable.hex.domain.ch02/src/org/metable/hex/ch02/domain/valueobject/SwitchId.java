package org.metable.hex.ch02.domain.valueobject;

import java.util.UUID;

public final class SwitchId {
    
    public static SwitchId valueOf(String value) {
        return withId(value);
    }

    public static SwitchId withId(String id) {
        return new SwitchId(UUID.fromString(id));
    }

    public static SwitchId withoutId() {
        return new SwitchId(UUID.randomUUID());
    }

    private final UUID id;

    private SwitchId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
