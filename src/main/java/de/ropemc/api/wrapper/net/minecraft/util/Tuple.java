package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.Tuple")
public interface Tuple {

    Object getFirst();

    Object getSecond();

}
