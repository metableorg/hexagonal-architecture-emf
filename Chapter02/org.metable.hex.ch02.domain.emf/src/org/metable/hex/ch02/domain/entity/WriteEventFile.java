
package org.metable.hex.ch02.domain.entity;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.ch02.domain.valueobject.Protocol;

public class WriteEventFile {

    public static void main(String[] args) throws IOException {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch2", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./events.ch2");

        Resource resource = resourceSet.createResource(uri);

        for (int i = 0; i < 5; ++i) {
            IEvent event = EntityFactory.eINSTANCE.createEventEmf();

            if ((i % 2) == 0) {
                event.updateProtocol(Protocol.IPV4);
            } else {
                event.updateProtocol(Protocol.IPV6);
            }

            resource.getContents().add((EObject) event);
        }

        resource.save(null);
    }
}
