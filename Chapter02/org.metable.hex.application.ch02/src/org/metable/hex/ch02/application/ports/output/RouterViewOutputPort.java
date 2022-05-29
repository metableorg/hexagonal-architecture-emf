package org.metable.hex.ch02.application.ports.output;

import java.util.List;

import org.metable.hex.ch02.domain.entity.IRouter;

public interface RouterViewOutputPort {

    List<IRouter> fetchRouters();
}
