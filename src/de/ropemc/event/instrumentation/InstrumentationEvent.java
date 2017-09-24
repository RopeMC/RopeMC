package de.ropemc.event.instrumentation;

import de.ropemc.event.Event;

import java.lang.instrument.Instrumentation;

public class InstrumentationEvent extends Event {

    private Instrumentation instrumentation;

    public InstrumentationEvent(Instrumentation instrumentation)
    {
        this.instrumentation=instrumentation;
    }

    public Instrumentation getInstrumentation()
    {
        return this.instrumentation;
    }

}
