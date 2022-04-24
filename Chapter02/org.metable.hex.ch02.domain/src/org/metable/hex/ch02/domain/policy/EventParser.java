package org.metable.hex.ch02.domain.policy;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.metable.hex.ch02.domain.entity.Event;

public interface EventParser {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS").withZone(ZoneId.of("UTC"));

    Event parseEvent(String event);
}
