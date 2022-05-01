package org.metable.hex.ch02.domain.entity;

import java.util.List;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

public interface SwitchDto {

    IP getAddress();

    String getId();

    List<Network> getNetworks();

    SwitchType getType();

}
