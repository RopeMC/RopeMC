package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.Cartesian")
public interface Cartesian {

    //Object[] access$200(Class var0, int var1);

    Iterable arraysAsLists(Iterable var0);

    Iterable cartesianProduct(Class var0, Iterable var1);

    Iterable cartesianProduct(Iterable var0);

    Object[] createArray(Class var0, int var1);

    Object[] toArray(Class var0, Iterable var1);

}
