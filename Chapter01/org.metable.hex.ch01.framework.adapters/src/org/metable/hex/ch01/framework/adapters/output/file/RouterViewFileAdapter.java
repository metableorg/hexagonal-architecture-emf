package org.metable.hex.ch01.framework.adapters.output.file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.ch01.application.ports.output.RouterViewOutputPort;
import org.metable.hex.ch01.domain.Router;
import org.metable.hex.ch01.domain.emf.network.NetworkPackage;

public class RouterViewFileAdapter implements RouterViewOutputPort {

    private static RouterViewFileAdapter instance;

    @Override
    public List<Router> fetchRouters() {
        try {
            return readFileAsString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private static List<Router> readFileAsString() throws IOException {
        List<Router> routers = new ArrayList<>();

        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch1", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./network.ch1");

        Resource resource = resourceSet.createResource(uri);

        resource.load(null);

        resource.getContents().forEach(router -> routers.add((Router) router));

        return routers;
    }

    private RouterViewFileAdapter() {
    }

    public static RouterViewFileAdapter getInstance() {
        if (instance == null) {
            instance = new RouterViewFileAdapter();
            @SuppressWarnings("unused")
            final NetworkPackage networkPackage = NetworkPackage.eINSTANCE;
        }
        return instance;
    }
}
