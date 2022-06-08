package org.metable.hex.ch02.domain.entity;

import org.metable.hex.ch02.domain.valueobject.RouterType;

public interface RouterDto {
    public String getId();

    public SwitchDto getSwitch();

    public RouterType getType();
}
