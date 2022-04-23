package org.metable.hex.ch01.domain;

public final class RouterId {

    private String id;

    private RouterId(String id) {
        this.id = id;
    }

    public static RouterId of(String id) {
        return new RouterId(id);
    }

    @Override
    public String toString() {
        return id; 
    }
}
