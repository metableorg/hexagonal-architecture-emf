package org.metable.hex.application.ch02.ports.output;

import java.util.List;

import org.metable.hex.domain.ch02.entity.IRouter;

public interface RouterViewOutputPort {

    List<IRouter> fetchRouters();
}
