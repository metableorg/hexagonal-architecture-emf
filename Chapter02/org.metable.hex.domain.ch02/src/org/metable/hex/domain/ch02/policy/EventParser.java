package org.metable.hex.domain.ch02.policy;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.metable.hex.domain.ch02.entity.Event;

public interface EventParser {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd:HH:mm:ss.SSS").withZone(ZoneId.of("UTC"));

    Event parseEvent(String event);
}
