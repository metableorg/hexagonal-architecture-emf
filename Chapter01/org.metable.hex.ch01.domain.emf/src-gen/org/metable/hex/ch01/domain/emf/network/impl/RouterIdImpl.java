package org.metable.hex.ch01.domain.emf.network.impl;

import org.metable.hex.ch01.domain.RouterId;

public class RouterIdImpl {
    private RouterId routerId;

    public RouterIdImpl(String id) {
        routerId = RouterId.of(id);
    }

    @Override
    public String toString() {
        return routerId.toString();
    }

    public void valueOf(String id) {
        routerId = RouterId.of(id);
    }

    public RouterId getDomainModel() {
        return routerId;
    }
}
