package org.metable.hex.ch02.domain.specification;

import org.metable.hex.ch02.domain.entity.Router;
import org.metable.hex.ch02.domain.specification.common.AbstractSpecification;

public class NetworkAmountSpecification extends AbstractSpecification<Router> {

    final static public int MAXIMUM_ALLOWED_NETWORKS = 6;

    @Override
    public boolean isSatisfiedBy(Router router) {
        return router.retrieveNetworks().size() <= MAXIMUM_ALLOWED_NETWORKS;
    }
}
