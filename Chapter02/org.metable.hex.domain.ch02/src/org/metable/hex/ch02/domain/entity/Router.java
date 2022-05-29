package org.metable.hex.ch02.domain.entity;

import java.util.List;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.RouterId;
import org.metable.hex.ch02.domain.valueobject.RouterType;

public class Router implements IRouter {
    private RouterId id;
    private ISwitch networkSwitch;
    private RouterType type;

    Router(RouterId id, RouterType type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public void addNetworkToSwitch(Network network) {
        networkSwitch.addNetwork(network);
    }

    @Override
    public Network createNetwork(IP address, String name, int cidr) {
        return new Network(address, name, cidr);
    }

    @Override
    public RouterId getId() {
        return id;
    }

    @Override
    public RouterType getType() {
        return type;
    }

    @Override
    public List<Network> retrieveNetworks() {
        return networkSwitch.getNetworks();
    }

    @Override
    public void setSwitch(ISwitch value) {
        networkSwitch = value;
    }

    @Override
    public String toString() {
        return "Router [id=" + id + ", networkSwitch=" + networkSwitch + ", type=" + type + "]";
    }

    // Package level back door access to object state.
    Router() {
        this(RouterId.withoutId(), RouterType.CORE);
    }

    ISwitch getSwitch() {
        return networkSwitch;
    }

    void setId(RouterId value) {
        id = value;
    }

    void setType(RouterType type) {
        this.type = type;
    }

}
