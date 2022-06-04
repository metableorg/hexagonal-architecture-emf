package org.metable.hex.ch02.domain.service;

import org.metable.hex.ch02.domain.entity.IEvent;
import org.metable.hex.ch02.domain.valueobject.Protocol;

public interface EntityFactory {
    IEvent newEvent(Protocol protocol);
}
