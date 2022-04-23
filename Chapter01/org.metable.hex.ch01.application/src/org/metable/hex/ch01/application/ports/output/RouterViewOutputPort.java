package org.metable.hex.ch01.application.ports.output;

import java.util.List;

import org.metable.hex.ch01.domain.Router;

public interface RouterViewOutputPort {

    List<Router> fetchRouters();
}
