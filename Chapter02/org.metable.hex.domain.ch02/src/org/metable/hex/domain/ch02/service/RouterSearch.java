package org.metable.hex.domain.ch02.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.metable.hex.domain.ch02.entity.IRouter;

public class RouterSearch {

    public static List<IRouter> retrieveRouter(List<IRouter> routers, Predicate<IRouter> predicate) {
        return routers.stream().filter(predicate).collect(Collectors.<IRouter>toList());
    }
}
