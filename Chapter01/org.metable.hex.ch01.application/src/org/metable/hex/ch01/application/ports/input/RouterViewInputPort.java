package org.metable.hex.ch01.application.ports.input;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.ch01.application.ports.output.RouterViewOutputPort;
import org.metable.hex.ch01.application.usecases.RouterViewUseCase;
import org.metable.hex.ch01.domain.Router;

public class RouterViewInputPort implements RouterViewUseCase {

    private RouterViewOutputPort routerListOutputPort;

    public RouterViewInputPort(RouterViewOutputPort routerViewOutputPort) {
        this.routerListOutputPort = routerViewOutputPort;
    }

    @Override
    public List<Router> getRouters(Predicate<Router> filter) {
        var routers = routerListOutputPort.fetchRouters();
        return Router.retrieveRouter(routers, filter);
    }
}
