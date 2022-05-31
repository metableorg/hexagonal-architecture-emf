
package org.metable.hex.ch02.framework.adapters.output.file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.ch02.application.ports.output.RouterViewOutputPort;
import org.metable.hex.ch02.domain.entity.EntityPackage;
import org.metable.hex.ch02.domain.entity.IRouter;

public class RouterViewFileAdapter implements RouterViewOutputPort {

    private static RouterViewFileAdapter instance;

    @Override
    public List<IRouter> fetchRouters() {
        try {
            return readFileAsString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private static List<IRouter> readFileAsString() throws IOException {
        List<IRouter> routers = new ArrayList<>();

        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch2", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./routers.ch2");

        Resource resource = resourceSet.createResource(uri);

        resource.load(null);

        resource.getContents().forEach(router -> routers.add((IRouter) router));

        return routers;
    }

    private RouterViewFileAdapter() {
    }

    public static RouterViewFileAdapter getInstance() {
        if (instance == null) {
            instance = new RouterViewFileAdapter();
            @SuppressWarnings("unused")
            final EntityPackage networkPackage = EntityPackage.eINSTANCE;
        }
        return instance;
    }
}
