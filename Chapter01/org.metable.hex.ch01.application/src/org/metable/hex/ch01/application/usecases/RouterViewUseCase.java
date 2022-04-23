
package org.metable.hex.ch01.application.usecases;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.ch01.domain.Router;

public interface RouterViewUseCase {

    List<Router> getRouters(Predicate<Router> filter);
}
