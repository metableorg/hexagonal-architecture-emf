
package org.metable.hex.domain.ch02.entity;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.domain.ch02.valueobject.IP;
import org.metable.hex.domain.ch02.valueobject.Network;

public class WriteRouterFile {

    public static void main(String[] args) throws IOException {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch2", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./routers.ch2");

        Resource resource = resourceSet.createResource(uri);

        for (int i = 0; i < 5; ++i) {
            RouterEmf router = EntityFactory.eINSTANCE.createRouterEmf();
            ISwitch networkSwitch = EntityFactory.eINSTANCE.createSwitchEmf();

            for (int j = 0; j < 2; ++j) {
                Network network = new Network(new IP("127.0.0." + j), "Network " + i + (j * 10), 23);
                networkSwitch.addNetwork(network);
            }

            router.setSwitch(networkSwitch);
            resource.getContents().add((EObject) router);
        }

        resource.save(null);
    }
}
