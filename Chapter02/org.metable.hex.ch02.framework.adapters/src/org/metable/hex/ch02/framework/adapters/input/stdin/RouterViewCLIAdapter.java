package org.metable.hex.ch02.framework.adapters.input.stdin;

import java.io.PrintStream;
import java.util.List;

import org.metable.hex.ch02.application.ports.input.RouterViewInputPort;
import org.metable.hex.ch02.application.usecases.RouterViewUseCase;
import org.metable.hex.ch02.domain.entity.IRouter;
import org.metable.hex.ch02.domain.valueobject.RouterType;
import org.metable.hex.ch02.framework.adapters.output.file.RouterViewFileAdapter;

public class RouterViewCLIAdapter {

    RouterViewUseCase routerViewUseCase;

    public RouterViewCLIAdapter() {
        setAdapters();
    }

    public List<IRouter> obtainRelatedRouters(String type) {
        return routerViewUseCase.getRouters(IRouter.filterRouterByType(RouterType.valueOf(type)));
    }

    private void setAdapters() {
        this.routerViewUseCase = new RouterViewInputPort(RouterViewFileAdapter.getInstance());
    }

    public void prettyPrint(List<IRouter> routers, PrintStream printStream) {
        routers.forEach(router -> printStream.println(router.toString() + "\n"));
    }
}