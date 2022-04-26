package org.metable.hex.ch02.domain.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.SwitchId;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

public class Switch {

    private SwitchType switchType;
    private SwitchId switchId;
    private List<Network> networks;
    private IP address;

    public Switch(SwitchType switchType, SwitchId switchId, List<Network> networks, IP address) {
        this.switchType = switchType;
        this.switchId = switchId;
        this.networks = networks;
        this.address = address;
    }

    public Switch addNetwork(Network network) {
        var networks = new ArrayList<>(Arrays.asList(network));
        networks.add(network);
        return new Switch(this.switchType, this.switchId, networks, this.address);
    }

    public List<Network> getNetworks() {
        return networks;
    }
}
