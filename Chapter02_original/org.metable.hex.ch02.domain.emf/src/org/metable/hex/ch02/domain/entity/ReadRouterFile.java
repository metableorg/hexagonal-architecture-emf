package org.metable.hex.ch02.domain.entity;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.emf.network.RouterDto;

public class ReadRouterFile {

    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        final NetworkPackage networkPackage = NetworkPackage.eINSTANCE;

        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch2", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./network.ch2");

        Resource resource = resourceSet.createResource(uri);

        resource.load(null);

        Router router = Router.fromDto((RouterDto) resource.getContents().get(0));

        System.out.println(router);
    }
}
