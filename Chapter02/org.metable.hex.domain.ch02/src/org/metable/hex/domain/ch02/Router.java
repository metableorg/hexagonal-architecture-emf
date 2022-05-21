package org.metable.hex.domain.ch02;

import java.util.List;
import java.util.function.Predicate;

import org.metable.hex.domain.ch02.valueobject.IP;
import org.metable.hex.domain.ch02.valueobject.Network;
import org.metable.hex.domain.ch02.valueobject.RouterId;
import org.metable.hex.domain.ch02.valueobject.RouterType;

public interface Router {

	public static Predicate<Router> filterRouterByType(RouterType routerType) {
		return routerType.equals(RouterType.CORE) ? Router.isCore() : Router.isEdge();
	}

	public static Predicate<Router> isCore() {
		return p -> p.getRouterType() == RouterType.CORE;
	}

	public static Predicate<Router> isEdge() {
		return p -> p.getRouterType() == RouterType.EDGE;
	}

	public void addNetworkToSwitch(Network network);

	public Network createNetwork(IP address, String name, int cidr);

	public RouterId getId();

	public RouterType getRouterType();

	public Switch getSwitch();

	public RouterType getType();

	public List<Network> retrieveNetworks();
}