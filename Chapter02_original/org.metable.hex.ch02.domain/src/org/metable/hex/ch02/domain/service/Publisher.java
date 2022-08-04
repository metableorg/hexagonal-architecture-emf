package org.metable.hex.ch02.domain.service;

import org.metable.hex.ch02.domain.entity.Event;

public interface Publisher {
    
    public void publish(Event event);

}
