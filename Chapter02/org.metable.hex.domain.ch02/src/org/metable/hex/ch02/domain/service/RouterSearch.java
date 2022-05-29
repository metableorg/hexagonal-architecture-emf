package org.metable.hex.ch02.domain.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.metable.hex.ch02.domain.entity.IRouter;

public class RouterSearch {

    public static List<IRouter> retrieveRouter(List<IRouter> routers, Predicate<IRouter> predicate) {
        return routers.stream().filter(predicate).collect(Collectors.<IRouter>toList());
    }
}
