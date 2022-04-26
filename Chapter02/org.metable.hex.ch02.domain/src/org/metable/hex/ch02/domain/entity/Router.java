package org.metable.hex.ch02.domain.entity;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.RouterId;
import org.metable.hex.ch02.domain.valueobject.RouterType;

public class Router {

    public static Predicate<Router> filterRouterByType(RouterType routerType) {
        return routerType.equals(RouterType.CORE) ? Router.isCore() : Router.isEdge();
    }

    public static Predicate<Router> isCore() {
        return p -> p.getRouterType() == RouterType.CORE;
    }
    public static Predicate<Router> isEdge() {
        return p -> p.getRouterType() == RouterType.EDGE;
    }

    static Router fromDto(RouterDto dto) {
        return new Router(dto.getType(), RouterId.withId(dto.getId()));
    }

    private final RouterType type;

    private final RouterId id;

    private Switch networkSwitch;

    public Router(RouterType type, RouterId id) {
        this.type = type;
        this.id = id;
    }

    public void addNetworkToSwitch(Network network) {
        this.networkSwitch = networkSwitch.addNetwork(network);
    }

    public Network createNetwork(IP address, String name, int cidr) {
        return new Network(address, name, cidr);
    }

    public RouterType getRouterType() {
        return type;
    }

    public List<Network> retrieveNetworks() {
        return networkSwitch.getNetworks();
    }
    
    @Override
    public String toString() {
        return "Router [type=" + type + ", id=" + id + "]";
    }

    protected RouterDto toDto() {
        return new RouterDto() {

            @Override
            public String getId() {
                return id.toString();
            }

            @Override
            public RouterType getType() {
                return type;
            }
        };
    }
}