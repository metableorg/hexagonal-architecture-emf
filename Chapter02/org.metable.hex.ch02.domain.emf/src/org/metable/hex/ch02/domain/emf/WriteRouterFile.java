
package org.metable.hex.ch02.domain.emf;

import java.io.IOException;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.ch02.domain.emf.network.NetworkFactory;
import org.metable.hex.ch02.domain.emf.network.RouterDto;
import org.metable.hex.ch02.domain.valueobject.RouterType;

public class WriteRouterFile {

    public static void main(String[] args) throws IOException {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch2", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./network.ch2");

        Resource resource = resourceSet.createResource(uri);

        for (int i = 0; i < 10; ++i) {
            final RouterDto router = NetworkFactory.eINSTANCE.createRouterDto();

            final RouterType type = ((i % 2) == 0) ? RouterType.CORE : RouterType.EDGE;

            router.setId(UUID.randomUUID().toString());
            router.setType(type);
            resource.getContents().add(router);
        }

        resource.save(null);
    }
}
