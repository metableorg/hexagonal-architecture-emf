package org.metable.hex.ch02.domain.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;
import org.metable.hex.ch02.domain.valueobject.SwitchId;
import org.metable.hex.ch02.domain.valueobject.SwitchType;

public class Switch {

    static Switch fromDto(SwitchDto dto) {
        return new Switch(dto.getType(), SwitchId.withId(dto.getId()), dto.getNetworks(), dto.getAddress());
    }

    private SwitchType switchType;
    private SwitchId switchId;
    private List<Network> networks;
    private IP address;

    private Switch(SwitchType switchType, SwitchId switchId, List<Network> networks, IP address) {
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

    public SwitchDto toDto() {
        return new SwitchDto() {

            @Override
            public IP getAddress() {
                return address;
            }

            @Override
            public String getId() {
                return switchId.toString();
            }

            @Override
            public List<Network> getNetworks() {
                return networks;
            }

            @Override
            public SwitchType getType() {
                return switchType;
            }
        };
    }

    @Override
    public String toString() {
        return "Switch [switchType=" + switchType + ", switchId=" + switchId + ", networks=" + networks + ", address="
                + address + "]";
    }
}
