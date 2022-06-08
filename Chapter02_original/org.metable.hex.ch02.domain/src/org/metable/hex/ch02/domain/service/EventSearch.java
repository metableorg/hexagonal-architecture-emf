package org.metable.hex.ch02.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.metable.hex.ch02.domain.entity.Event;
import org.metable.hex.ch02.domain.valueobject.ParsePolicyType;

public class EventSearch {

    public List<Event> retrieveEvents(List<String> unparsedEvents, ParsePolicyType policyType) {
        var parsedEvents = new ArrayList<Event>();
        unparsedEvents.stream().forEach(event -> {
            parsedEvents.add(Event.parsedEvent(event, policyType));
        });
        return parsedEvents;
    }
}
