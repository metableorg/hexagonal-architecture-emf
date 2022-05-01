
package org.metable.hex.ch02.domain.entity;

import java.io.IOException;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.ch02.domain.emf.network.NetworkFactory;
import org.metable.hex.ch02.domain.emf.network.RouterDto;
import org.metable.hex.ch02.domain.emf.network.SwitchDto;
import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.NetworkValueObject;
import org.metable.hex.ch02.domain.valueobject.RouterType;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

public class WriteRouterFile {

    public static void main(String[] args) throws IOException {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch2", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./network.ch2");

        Resource resource = resourceSet.createResource(uri);

        for (int i = 0; i < 10; ++i) {
            final SwitchDto switchDto = NetworkFactory.eINSTANCE.createSwitchDto();
            switchDto.getNetworkValueObjects().add(new NetworkValueObject(new IP("256.1.1.3"), "N1", 3));
            switchDto.getNetworkValueObjects().add(new NetworkValueObject(new IP("256.1.1.4"), "N2", 4));
            switchDto.setId(UUID.randomUUID().toString());
            switchDto.setAddress(new IP("12.0.0.1"));
            switchDto.setType(SwitchType.LAYER3);

            final RouterDto router = NetworkFactory.eINSTANCE.createRouterDto();

            final RouterType type = ((i % 2) == 0) ? RouterType.CORE : RouterType.EDGE;

            router.setId(UUID.randomUUID().toString());
            router.setType(type);
            router.setSwitch(switchDto);

            resource.getContents().add(router);
        }

        resource.save(null);
    }
}
