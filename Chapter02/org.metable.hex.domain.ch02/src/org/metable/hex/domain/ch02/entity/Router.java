package org.metable.hex.domain.ch02.entity;

import org.metable.hex.domain.ch02.valueobject.RouterId;

public class Router implements IRouter {

    @Override
    public String toString() {
        return "Router [id=" + id + ", networkSwitch=" + networkSwitch + "]";
    }

    private RouterId id;
    private ISwitch networkSwitch;

    Router(RouterId id) {
        this.id = id;
    }
    
    @Override
    public void setSwitch(ISwitch value) {
        networkSwitch = value;
    }

    ISwitch getSwitch() {
        return networkSwitch;
    }
    
    public RouterId getId() {
        return id;
    }
    
    void setId(RouterId value) {
        id = value;
    }
}
