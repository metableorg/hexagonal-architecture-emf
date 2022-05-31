package org.metable.hex.ch02.domain.entity;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.RouterId;
import org.metable.hex.ch02.domain.valueobject.RouterType;

public interface IRouter {

    static Predicate<IRouter> filterRouterByType(RouterType routerType) {
        return routerType.equals(RouterType.CORE) ? IRouter.isCore() : IRouter.isEdge();
    }

    static Predicate<IRouter> isCore() {
        return p -> p.getType() == RouterType.CORE;
    }

    static Predicate<IRouter> isEdge() {
        return p -> p.getType() == RouterType.EDGE;
    }

    public void addNetworkToSwitch(Network network);

    public Network createNetwork(IP address, String name, int cidr);

    public RouterId getId();

    public RouterType getType();

    public List<Network> retrieveNetworks();

    void setSwitch(ISwitch value);
}
