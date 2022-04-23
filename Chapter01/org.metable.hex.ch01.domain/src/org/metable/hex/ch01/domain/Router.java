package org.metable.hex.ch01.domain;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface Router {

    public static Predicate<Router> filterRouterByType(RouterType routerType) {
        return routerType.equals(RouterType.CORE) ? isCore() : isEdge();
    }

    private static Predicate<Router> isCore() {
        return p -> p.getType() == RouterType.CORE;
    }

    private static Predicate<Router> isEdge() {
        return p -> p.getType() == RouterType.EDGE;
    }

    public static List<Router> retrieveRouter(List<Router> routers, Predicate<Router> predicate) {
        return routers.stream().filter(predicate).collect(Collectors.<Router>toList());
    }

    public static String toString(Router router) {
        return "Router{" + "routerType=" + router.getType() + ", routerId=" + router.getId() + '}';
    }

    public RouterId getId();

    public RouterType getType();

}
