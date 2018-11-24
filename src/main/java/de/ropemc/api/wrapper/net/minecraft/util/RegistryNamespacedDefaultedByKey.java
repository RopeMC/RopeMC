package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.RegistryNamespacedDefaultedByKey")
public interface RegistryNamespacedDefaultedByKey {

    Object getObject(Object var0);

    Object getObjectById(int var0);

    void register(int var0, Object var1, Object var2);

    void validateKey();

}
