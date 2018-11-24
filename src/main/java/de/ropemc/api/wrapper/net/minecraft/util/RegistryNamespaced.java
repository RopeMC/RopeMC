package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.RegistryNamespaced")
public interface RegistryNamespaced {

    boolean containsKey(Object var0);

    Map createUnderlyingMap();

    int getIDForObject(Object var0);

    Object getNameForObject(Object var0);

    Object getObject(Object var0);

    Object getObjectById(int var0);

    void register(int var0, Object var1, Object var2);

}
