package org.metable.hex.soccer.dsl;

public class Parameters {
    private final String[] args;

    public Parameters(String[] args) {
        this.args = args;
    }

    public String Optional(String name, String defaultValue) {
        for (String arg : args) {
            int index = arg.indexOf(name + ": ");
            if (index != -1) {
                return arg.substring(index + name.length() + 2);
            }
        }
        return defaultValue;
    }
}
