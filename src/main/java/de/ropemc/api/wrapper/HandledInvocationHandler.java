package de.ropemc.api.wrapper;

import java.lang.reflect.InvocationHandler;

public interface HandledInvocationHandler extends InvocationHandler {
    Object getHandle();
}
