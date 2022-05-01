package org.metable.hex.ch02.domain.entity;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.ch02.domain.emf.network.NetworkPackage;
import org.metable.hex.ch02.domain.valueobject.ParsePolicyType;

public class ReadEventFile {

    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        final NetworkPackage networkPackage = NetworkPackage.eINSTANCE;

        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch2", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./events.ch2");

        Resource resource = resourceSet.createResource(uri);

        resource.load(null);

        EventDto eventDto = (EventDto) resource.getContents().get(0);

        Event event = Event.parsedEvent(eventDto.getLogEntry(), ParsePolicyType.SPLIT);

        System.out.println(event);
    }
}
