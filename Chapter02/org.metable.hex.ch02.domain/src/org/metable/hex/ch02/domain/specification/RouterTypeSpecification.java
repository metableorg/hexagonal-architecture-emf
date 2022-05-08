package org.metable.hex.ch02.domain.specification;

import org.metable.hex.ch02.domain.entity.Router;
import org.metable.hex.ch02.domain.specification.common.AbstractSpecification;
import org.metable.hex.ch02.domain.valueobject.RouterType;

public class RouterTypeSpecification extends AbstractSpecification<Router> {

    @Override
    public boolean isSatisfiedBy(Router router) {
        return router.getRouterType().equals(RouterType.EDGE) || router.getRouterType().equals(RouterType.CORE);
    }
}
