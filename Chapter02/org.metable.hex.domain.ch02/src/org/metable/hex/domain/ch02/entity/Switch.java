package org.metable.hex.domain.ch02.entity;

import java.util.ArrayList;
import java.util.List;

import org.metable.hex.domain.ch02.valueobject.IP;
import org.metable.hex.domain.ch02.valueobject.Network;
import org.metable.hex.domain.ch02.valueobject.SwitchId;
import org.metable.hex.domain.ch02.valueobject.SwitchType;

public class Switch implements ISwitch {
    private List<Network> networks;
    private SwitchId id;
    private SwitchType type;
    private IP address;

    Switch() {
        this(SwitchId.withoutId(), SwitchType.LAYER2, new IP("127.0.0.1"));
    }

    Switch(SwitchId id, SwitchType type, IP address) {
        this.id = id;
        this.type = type;
        this.address = address;
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
        return "Switch [networks=" + networks + ", id=" + id + ", type=" + type + ", address=" + address + "]";
    }

    IP getAddress() {
        return address;
    }

    SwitchId getId() {
        return id;
    }

    SwitchType getType() {
        return type;
    }

    void setAddress(IP value) {
        address = value;
    }

    void setId(SwitchId value) {
        id = value;
    }

    void setType(SwitchType value) {
        type = value;
    }
}
