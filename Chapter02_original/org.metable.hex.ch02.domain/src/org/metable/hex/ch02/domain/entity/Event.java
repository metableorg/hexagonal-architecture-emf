package org.metable.hex.ch02.domain.entity;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.metable.hex.ch02.domain.policy.RegexEventParser;
import org.metable.hex.ch02.domain.policy.SplitEventParser;
import org.metable.hex.ch02.domain.valueobject.Activity;
import org.metable.hex.ch02.domain.valueobject.EventId;
import org.metable.hex.ch02.domain.valueobject.ParsePolicyType;
import org.metable.hex.ch02.domain.valueobject.Protocol;

public class Event implements Comparable<Event> {

    public static Event parsedEvent(String unparsedEvent, ParsePolicyType policy) {
        switch (policy) {
        case REGEX:
            return new RegexEventParser().parseEvent(unparsedEvent);
        case SPLIT:
            return new SplitEventParser().parseEvent(unparsedEvent);
        default:
            throw new IllegalArgumentException("");
        }
    }

    private OffsetDateTime timestamp;
    private EventId id;
    private Protocol protocol;
    private Activity activity;

    public Event(OffsetDateTime timestamp, EventId id, Protocol protocol, Activity activity) {
        this.timestamp = timestamp;
        this.id = id;
        this.protocol = protocol;
        this.activity = activity;
    }

    @Override
    public int compareTo(Event event) {
        return timestamp.compareTo(event.timestamp);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Event) {
            Event event = (Event) obj;
            return (event.timestamp.equals(this.timestamp) && event.id.equals(this.id)
                    && event.protocol.equals(this.protocol) && event.activity.equals(this.activity));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, id, protocol, activity) + 31;
    }

    @Override
    public String toString() {
        return "Event [timestamp=" + timestamp + ", id=" + id + ", protocol=" + protocol + ", activity=" + activity
                + "]";
    }

    EventDto toDto() {
        return new EventDto() {
            @Override
            public String getLogEntry() {
                return timestamp.toString() + " " + id.toString() + " " + protocol.toString() + " "
                        + activity.getSourceHost() + " " + activity.getDestHost();
            }

            @Override
            public String getId() {
                return id.toString();
            }
        };
    }
}
