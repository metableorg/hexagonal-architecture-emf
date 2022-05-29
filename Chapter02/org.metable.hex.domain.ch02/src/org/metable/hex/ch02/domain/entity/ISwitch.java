package org.metable.hex.ch02.domain.entity;

import java.util.List;

import org.metable.hex.ch02.domain.valueobject.Network;

public interface ISwitch {
    void addNetwork(Network network);

    List<Network> getNetworks();
}
