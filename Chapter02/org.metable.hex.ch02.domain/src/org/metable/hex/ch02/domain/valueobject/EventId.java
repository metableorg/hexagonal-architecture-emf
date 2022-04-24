package org.metable.hex.ch02.domain.valueobject;

public final class EventId {

    private final String id;

    private EventId(String id) {
        this.id = id;
    }

    public static EventId of(String id) {
        return new EventId(id);
    }

    @Override
    public String toString() {
        return "EventId{" + "id='" + id + '\'' + '}';
    }
}
