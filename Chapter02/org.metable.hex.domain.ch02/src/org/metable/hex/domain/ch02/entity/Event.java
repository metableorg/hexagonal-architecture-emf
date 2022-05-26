package org.metable.hex.domain.ch02.entity;

import org.metable.hex.domain.ch02.valueobject.Protocol;

public class Event implements IEvent {

    private Protocol protocol;

    public Event(Protocol protocol) {
        this.protocol = protocol;
    }

    @Override
    public String toString() {
        return "Event [protocol=" + protocol + "]";
    }

    // Package scoped methods provide a "back door" for frameworks to get/set entity state.
    void setProtocol(Protocol value) {
        protocol = value;
    }

    Protocol getProtocol() {
        return protocol;
    }

    @Override
    public void updateProtocol(Protocol value) {
        this.protocol = value;
    }
}
