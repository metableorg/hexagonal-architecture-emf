package org.metable.hex.domain.ch02.entity;

import java.util.List;

import org.metable.hex.domain.ch02.valueobject.Network;

public interface ISwitch {
    void addNetwork(Network network);

    List<Network> getNetworks();
}
