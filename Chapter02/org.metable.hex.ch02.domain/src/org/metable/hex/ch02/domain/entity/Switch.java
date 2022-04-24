package org.metable.hex.ch02.domain.entity;

import java.util.List;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.SwitchId;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

public interface Switch {

    public Switch addNetwork(Network network);

    public List<Network> getNetworks();

    public SwitchType getType();

    public SwitchId getId();

    public IP getIpAddress();
}
