package org.metable.hex.ch02.domain.entity.emf;

import org.metable.hex.ch02.domain.entity.EntityFactory;
import org.metable.hex.ch02.domain.entity.EventEmf;
import org.metable.hex.ch02.domain.entity.IEvent;
import org.metable.hex.ch02.domain.valueobject.Protocol;

public class EntityFactoryEmf implements org.metable.hex.ch02.domain.service.EntityFactory {

    @Override
    public IEvent newEvent(Protocol protocol) {
        EventEmf event = EntityFactory.eINSTANCE.createEventEmf();
        event.setProtocol(protocol);
        return event;
    }

}
