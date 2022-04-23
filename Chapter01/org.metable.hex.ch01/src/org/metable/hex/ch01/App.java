
package org.metable.hex.ch01;

import org.metable.hex.ch01.framework.adapters.input.stdin.RouterViewCLIAdapter;

public class App {

    public static void main(String... args) {
        final var cli = new RouterViewCLIAdapter();
        final var type = "CORE";
        cli.prettyPrint(cli.obtainRelatedRouters(type));
    }
}