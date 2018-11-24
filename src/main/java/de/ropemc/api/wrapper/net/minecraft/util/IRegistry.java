package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.IRegistry")
public interface IRegistry {

    Object getObject(Object var0);

    void putObject(Object var0, Object var1);

}
