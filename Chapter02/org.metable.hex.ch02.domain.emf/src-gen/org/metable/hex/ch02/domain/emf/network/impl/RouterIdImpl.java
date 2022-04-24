package org.metable.hex.ch02.domain.emf.network.impl;

import org.metable.hex.ch02.domain.valueobject.RouterId;

public class RouterIdImpl {
    private RouterId routerId;

    public RouterIdImpl() {
        routerId = RouterId.withoutId();
    }

    public RouterIdImpl(String id) {
        routerId = RouterId.withId(id);
    }

    public RouterId getDomainModel() {
        return routerId;
    }

    @Override
    public String toString() {
        return routerId.toString();
    }

    public void valueOf(String id) {
        routerId = RouterId.withId(id);
    }
}
