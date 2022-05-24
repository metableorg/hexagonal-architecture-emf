package org.metable.hex.domain.ch02.entity;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ReadRouterFile {

    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        final EntityPackage entityPackage = EntityPackage.eINSTANCE;

        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch2", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./routers.ch2");

        Resource resource = resourceSet.createResource(uri);

        resource.load(null);

        resource.getContents().forEach(router -> {
            System.out.println(router.toString());
        });

        // IRouter router = (IRouter) resource.getContents().get(0);
    }
}
