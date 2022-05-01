package org.metable.hex.ch02.domain.policy;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.metable.hex.ch02.domain.entity.Event;
import org.metable.hex.ch02.domain.valueobject.Activity;
import org.metable.hex.ch02.domain.valueobject.EventId;
import org.metable.hex.ch02.domain.valueobject.Protocol;

public class RegexEventParser implements EventParser {

    @Override
    public Event parseEvent(String event) {
        final String regex = "(\\\"[^\\\"]+\\\")|\\S+";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(event);

        var fields = new ArrayList<>();
        while (matcher.find()) {
            fields.add(matcher.group(0));
        }

        var timestamp = LocalDateTime.parse(fields.get(0).toString(), formatter).atOffset(ZoneOffset.UTC);
        var id = EventId.of(fields.get(1).toString());
        var protocol = Protocol.valueOf(fields.get(2).toString());
        var activity = new Activity(fields.get(3).toString(), fields.get(5).toString());

        return new Event(timestamp, id, protocol, activity);
    }
}
