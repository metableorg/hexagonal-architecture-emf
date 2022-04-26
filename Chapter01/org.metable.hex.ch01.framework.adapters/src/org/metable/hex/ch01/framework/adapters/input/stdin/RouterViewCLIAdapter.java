package org.metable.hex.ch01.framework.adapters.input.stdin;

import java.util.List;

import org.metable.hex.ch01.application.ports.input.RouterViewInputPort;
import org.metable.hex.ch01.application.usecases.RouterViewUseCase;
import org.metable.hex.ch01.domain.Router;
import org.metable.hex.ch01.domain.RouterType;
import org.metable.hex.ch01.framework.adapters.output.file.RouterViewFileAdapter;

public class RouterViewCLIAdapter {

    RouterViewUseCase routerViewUseCase;

    public RouterViewCLIAdapter() {
        setAdapters();
    }

    public List<Router> obtainRelatedRouters(String type) {
        return routerViewUseCase.getRouters(Router.filterRouterByType(RouterType.valueOf(type)));
    }

    private void setAdapters() {
        this.routerViewUseCase = new RouterViewInputPort(RouterViewFileAdapter.getInstance());
    }

    public void prettyPrint(List<Router> routers) {
        routers.forEach(router -> System.out.println(router));
    }
}