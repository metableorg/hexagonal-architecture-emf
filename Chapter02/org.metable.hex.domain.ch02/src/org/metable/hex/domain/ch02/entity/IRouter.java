package org.metable.hex.domain.ch02.entity;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.domain.ch02.valueobject.IP;
import org.metable.hex.domain.ch02.valueobject.Network;
import org.metable.hex.domain.ch02.valueobject.RouterId;
import org.metable.hex.domain.ch02.valueobject.RouterType;

public interface IRouter {

    static Predicate<Router> filterRouterByType(RouterType routerType) {
        return routerType.equals(RouterType.CORE) ? IRouter.isCore() : IRouter.isEdge();
    }

    static Predicate<Router> isCore() {
        return p -> p.getType() == RouterType.CORE;
    }

    static Predicate<Router> isEdge() {
        return p -> p.getType() == RouterType.EDGE;
    }

    public void addNetworkToSwitch(Network network);

    public Network createNetwork(IP address, String name, int cidr);

    public RouterId getId();

    public RouterType getType();

    public List<Network> retrieveNetworks();

    void setSwitch(ISwitch value);
}
