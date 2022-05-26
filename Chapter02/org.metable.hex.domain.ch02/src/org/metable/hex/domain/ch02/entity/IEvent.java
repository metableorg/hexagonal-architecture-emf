package org.metable.hex.domain.ch02.entity;

import org.metable.hex.domain.ch02.valueobject.Protocol;

public interface IEvent {
    
    void updateProtocol(Protocol protocol);

}
