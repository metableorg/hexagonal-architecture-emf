package org.metable.hex.domain.ch02.entity;

import java.util.ArrayList;
import java.util.List;

import org.metable.hex.domain.ch02.valueobject.Network;
import org.metable.hex.domain.ch02.valueobject.SwitchId;

public class Switch implements ISwitch {

    private final List<Network> networks;

    private SwitchId id;

    Switch(SwitchId id) {
        this.id = id;
        this.networks = new ArrayList<>();
    }

    @Override
    public void addNetwork(Network network) {
        networks.add(network);
    }

    @Override
    public List<Network> getNetworks() {
        return networks;
    }

    @Override
    public String toString() {
        return "Switch [networks=" + networks + ", id=" + id + "]";
    }

    SwitchId getId() {
        return id;
    }

    void setId(SwitchId value) {
        id = value;
    }
}
