package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Map;
import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.RegistrySimple")
public interface RegistrySimple {

    boolean containsKey(Object var0);

    Map createUnderlyingMap();

    Set getKeys();

    Object getObject(Object var0);

    void putObject(Object var0, Object var1);

}
