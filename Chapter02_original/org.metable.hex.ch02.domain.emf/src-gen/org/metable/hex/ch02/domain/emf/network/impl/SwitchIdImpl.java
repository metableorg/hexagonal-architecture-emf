package org.metable.hex.ch02.domain.emf.network.impl;

import org.metable.hex.ch02.domain.valueobject.SwitchId;

public class SwitchIdImpl {
    private SwitchId switchId;

    public SwitchIdImpl() {
        switchId = SwitchId.withoutId();
    }

    public SwitchIdImpl(String id) {
        switchId = SwitchId.withId(id);
    }

    public SwitchId getDomainModel() {
        return switchId;
    }

    @Override
    public String toString() {
        return switchId.toString();
    }

    public void valueOf(String id) {
        switchId = SwitchId.withId(id);
    }
}
