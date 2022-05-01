package org.metable.hex.ch02.domain.emf.network.impl;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Properties;

import org.metable.hex.ch02.domain.valueobject.IP;
import org.metable.hex.ch02.domain.valueobject.Network;

public class NetworkValueObject {

    public static NetworkValueObject valueOf(String value) {
        Properties properties = new Properties();

        try (StringReader reader = new StringReader(value)) {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        final String address = properties.getProperty("address");
        final String name = properties.getProperty("name");
        final String cidr = properties.getProperty("cidr");

        return new NetworkValueObject(new IP(address), name, Integer.parseInt(cidr));
    }

    private final Network network;

    public NetworkValueObject(IP address, String name, int cidr) {
        network = new Network(address, name, cidr);
    }

    public Network getNetwork() {
        return network;
    }

    @Override
    public String toString() {
        Properties properties = new Properties();
        properties.setProperty("address", network.getAddress().toString());
        properties.setProperty("name", network.getName());
        properties.setProperty("cidr", network.getCidr() + "");

        String result = "";

        try (StringWriter writer = new StringWriter()) {
            properties.store(writer, Network.class.getSimpleName());
            result = writer.getBuffer().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
