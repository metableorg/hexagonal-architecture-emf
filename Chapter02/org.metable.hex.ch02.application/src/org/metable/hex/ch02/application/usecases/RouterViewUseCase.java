
package org.metable.hex.ch02.application.usecases;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.ch02.domain.entity.IRouter;

public interface RouterViewUseCase {

    List<IRouter> getRouters(Predicate<IRouter> filter);
}
