package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ObjectIntIdentityMap")
public interface ObjectIntIdentityMap {

    int get(Object var0);

    Object getByValue(int var0);

    void put(Object var0, int var1);

}
