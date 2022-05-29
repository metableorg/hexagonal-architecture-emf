package org.metable.hex.application.ch02.ports.input;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.application.ch02.ports.output.RouterViewOutputPort;
import org.metable.hex.application.ch02.usecases.RouterViewUseCase;
import org.metable.hex.domain.ch02.entity.IRouter;
import org.metable.hex.domain.ch02.service.RouterSearch;

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
