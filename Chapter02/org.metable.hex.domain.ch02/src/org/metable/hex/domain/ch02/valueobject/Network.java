package org.metable.hex.domain.ch02.valueobject;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Properties;

public final class Network {
    public static Network valueOf(String value) {
        Properties properties = new Properties();

        try (StringReader reader = new StringReader(value)) {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        final String address = properties.getProperty("address");
        final String name = properties.getProperty("name");
        final String cidr = properties.getProperty("cidr");

        return new Network(new IP(address), name, Integer.parseInt(cidr));
    }
    private final IP address;
    private final String name;

    private final int cidr;

    public Network(IP address, String name, int cidr) {
        if (cidr < 1 || cidr > 32) {
            throw new IllegalArgumentException("Invalid CIDR value");
        }
        this.address = address;
        this.name = name;
        this.cidr = cidr;
    }

    public IP getAddress() {
        return address;
    }

    public int getCidr() {
        return cidr;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        Properties properties = new Properties();
        properties.setProperty("address", getAddress().toString());
        properties.setProperty("name", getName());
        properties.setProperty("cidr", getCidr() + "");

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
