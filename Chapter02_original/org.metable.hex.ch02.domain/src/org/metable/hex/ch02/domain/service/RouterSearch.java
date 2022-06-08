package org.metable.hex.ch02.domain.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.metable.hex.ch02.domain.entity.Router;

public class RouterSearch {

    public static List<Router> retrieveRouter(List<Router> routers, Predicate<Router> predicate) {
        return routers.stream().filter(predicate).collect(Collectors.<Router>toList());
    }
}
