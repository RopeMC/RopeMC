package de.ropemc.api.event.instrumentation;

import de.ropemc.api.event.Event;

import java.util.ArrayList;
import java.util.List;

public class InjectionEvent extends Event {
    private List<Class<?>> injectors = new ArrayList<>();

    public void add(Class<?> injector) {
        this.injectors.add(injector);
    }

    public List<Class<?>> getInjectors() {
        return injectors;
    }
}
