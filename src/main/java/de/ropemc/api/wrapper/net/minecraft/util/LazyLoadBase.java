package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.LazyLoadBase")
public interface LazyLoadBase {

    Object getValue();

    Object load();

}
