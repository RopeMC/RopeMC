package de.ropemc.api.wrapper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

public interface HandledInvocationHandler extends InvocationHandler {
    Object getHandle();

    Field getField(String fieldName) throws NoSuchFieldException;
}
