package org.metable.hex.ch01.domain;

public interface RouterFactory {

    static Router newRouter(RouterDto dto) {
        return Router.fromDto(dto);
    }

}
