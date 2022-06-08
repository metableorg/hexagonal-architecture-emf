package org.metable.hex.ch02.domain.service;

import org.metable.hex.ch02.domain.entity.Router;
import org.metable.hex.ch02.domain.specification.CIDRSpecification;
import org.metable.hex.ch02.domain.specification.NetworkAmountSpecification;
import org.metable.hex.ch02.domain.specification.NetworkAvailabilitySpecification;
import org.metable.hex.ch02.domain.specification.RouterTypeSpecification;
import org.metable.hex.ch02.domain.valueobject.Network;

public class NetworkOperation {

    public static Router createNewNetwork(Router router, Network network) {
        var availabilitySpec = new NetworkAvailabilitySpecification(network.getAddress(), network.getName(),
                network.getCidr());
        var cidrSpec = new CIDRSpecification();
        var routerTypeSpec = new RouterTypeSpecification();
        var amountSpec = new NetworkAmountSpecification();

        if (cidrSpec.isSatisfiedBy(network.getCidr()))
            throw new IllegalArgumentException("CIDR is below " + CIDRSpecification.MINIMUM_ALLOWED_CIDR);

        if (!availabilitySpec.isSatisfiedBy(router))
            throw new IllegalArgumentException("Address already exist");

        if (amountSpec.and(routerTypeSpec).isSatisfiedBy(router)) {
            Network newNetwork = router.createNetwork(network.getAddress(), network.getName(), network.getCidr());
            router.addNetworkToSwitch(newNetwork);
        }
        return router;
    }
}
