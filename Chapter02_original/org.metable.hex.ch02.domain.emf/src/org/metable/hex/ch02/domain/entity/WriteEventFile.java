
package org.metable.hex.ch02.domain.entity;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metable.hex.ch02.domain.emf.network.EventDto;
import org.metable.hex.ch02.domain.emf.network.NetworkFactory;
import org.metable.hex.ch02.domain.policy.EventParser;
import org.metable.hex.ch02.domain.valueobject.Protocol;

public class WriteEventFile {

    public static void main(String[] args) throws IOException {
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ch2", new XMIResourceFactoryImpl());
        URI uri = URI.createURI("./events.ch2");

        Resource resource = resourceSet.createResource(uri);

        for (int i = 0; i < 3; ++i) {
            final EventDto eventDto = NetworkFactory.eINSTANCE.createEventDto();

            final String now = (LocalDateTime.now().atOffset(ZoneOffset.UTC)).format(EventParser.formatter);
            final String id = i + "";
            final String protocol = Protocol.IPV6.toString();
            final String sourceHost = "127.0.0." + i;
            final String destHost = "127.0.0." + (i + 1) * 100;

            eventDto.setLogEntry(now + " " + id + " " + protocol + " " + sourceHost + " > " + destHost);

            resource.getContents().add(eventDto);
        }

        resource.save(null);
    }
}
