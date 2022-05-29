package org.metable.hex.ch02.domain.valueobject;

public final class EventId {

    public static EventId of(String id) {
        return new EventId(id);
    }

    private final String id;

    private EventId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id; 
    }
}
