
package org.metable.hex.ch02;

import org.metable.hex.ch02.domain.entity.IEvent;
import org.metable.hex.ch02.domain.entity.emf.EntityFactoryEmf;
import org.metable.hex.ch02.domain.service.EntityFactoryRegistry;
import org.metable.hex.ch02.domain.valueobject.Protocol;
import org.metable.hex.ch02.framework.adapters.input.stdin.RouterViewCLIAdapter;

public class App {

    public static void main(String... args) {
        final var cli = new RouterViewCLIAdapter();
        final var type = "CORE";
        cli.prettyPrint(cli.obtainRelatedRouters(type), System.out);

        EntityFactoryRegistry.registerFactory(new EntityFactoryEmf());

        IEvent event = EntityFactoryRegistry.getFactory().newEvent(Protocol.IPV6);

        System.out.println("");
        System.out.println(event);
    }
}