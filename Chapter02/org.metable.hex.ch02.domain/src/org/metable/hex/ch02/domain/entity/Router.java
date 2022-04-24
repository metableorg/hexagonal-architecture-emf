package org.metable.hex.ch02.domain.entity;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.RouterId;
import org.metable.hex.ch02.domain.valueobject.RouterType;

public interface Router {
    
    public static void addNetworkToSwitch(Router router, Network network) {
        router.getSwitch().addNetwork(network);
    }

    public static Network createNetwork(IP address, String name, int cidr) {
        return new Network(address, name, cidr);
    }

    public static Predicate<Router> filterRouterByType(RouterType routerType) {
        return routerType.equals(RouterType.CORE) ? Router.isCore() : Router.isEdge();
    }

    public static Predicate<Router> isCore() {
        return p -> p.getType() == RouterType.CORE;
    }

    public static Predicate<Router> isEdge() {
        return p -> p.getType() == RouterType.EDGE;
    }

    public static List<Network> retrieveNetworks(Router router) {
        return router.getSwitch().getNetworks();
    }

    public static String toString(Router router) {
        return "Router{" + "routerType=" + router.getType() + ", routerId=" + router.getId() + '}';
    }

    public abstract RouterId getId();

    public abstract Switch getSwitch();

    public abstract RouterType getType();
}