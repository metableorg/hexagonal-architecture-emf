package org.metable.hex.ch01.domain.emf;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.ch01.domain.emf.network.NetworkPackage;
import org.metable.hex.ch01.domain.emf.network.Router;

public class ReadRouterFile {

    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        final NetworkPackage networkPackage = NetworkPackage.eINSTANCE;

        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch1", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./network.ch1");

        Resource resource = resourceSet.createResource(uri);

        resource.load(null);

        Router router = (Router) resource.getContents().get(0);

        System.out.println("Router id: " + router.getId() + " type: " + router.getType());
    }
}
