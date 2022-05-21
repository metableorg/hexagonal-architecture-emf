package org.metable.hex.domain.ch02;

import java.util.List;

import org.metable.hex.domain.ch02.valueobject.IP;
import org.metable.hex.domain.ch02.valueobject.Network;
import org.metable.hex.domain.ch02.valueobject.SwitchId;
import org.metable.hex.domain.ch02.valueobject.SwitchType;

public interface Switch {

	public Switch addNetwork(Network network);

	public IP getAddress();

	public SwitchId getId();

	public List<Network> getNetworks();

	public SwitchType getType();
}
