
package org.metable.hex.application.ch02.usecases;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.domain.ch02.entity.IRouter;

public interface RouterViewUseCase {

    List<IRouter> getRouters(Predicate<IRouter> filter);
}
