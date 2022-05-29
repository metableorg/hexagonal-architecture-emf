package org.metable.hex.ch02.application.ports.input;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.ch02.application.ports.output.RouterViewOutputPort;
import org.metable.hex.ch02.application.usecases.RouterViewUseCase;
import org.metable.hex.ch02.domain.entity.IRouter;
import org.metable.hex.ch02.domain.service.RouterSearch;

public class RouterViewInputPort implements RouterViewUseCase {

    private RouterViewOutputPort routerListOutputPort;

    public RouterViewInputPort(RouterViewOutputPort routerViewOutputPort) {
        this.routerListOutputPort = routerViewOutputPort;
    }

    @Override
    public List<IRouter> getRouters(Predicate<IRouter> filter) {
        var routers = routerListOutputPort.fetchRouters();
        return RouterSearch.retrieveRouter(routers, filter);
    }
}
