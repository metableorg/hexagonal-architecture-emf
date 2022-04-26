package org.metable.hex.ch01.domain;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Router {
    public static Predicate<Router> filterRouterByType(RouterType routerType) {
        return routerType.equals(RouterType.CORE) ? isCore() : isEdge();
    }

    public static List<Router> retrieveRouter(List<Router> routers, Predicate<Router> predicate) {
        return routers.stream().filter(predicate).collect(Collectors.<Router>toList());
    }

    private static Predicate<Router> isCore() {
        return p -> p.getRouterType() == RouterType.CORE;
    }

    private static Predicate<Router> isEdge() {
        return p -> p.getRouterType() == RouterType.EDGE;
    }

    static Router fromDto(RouterDto dto) {
        return new Router(dto.getType(), RouterId.of(dto.getId()));
    }

    private RouterType type;

    private RouterId id;

    private Router(RouterType type, RouterId id) {
        this.type = type;
        this.id = id;
    }

    public RouterType getRouterType() {
        return type;
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