package org.metable.hex.ch02.domain.entity;

import org.metable.hex.ch02.domain.valueobject.Protocol;

public interface IEvent {

    void updateProtocol(Protocol protocol);

}
