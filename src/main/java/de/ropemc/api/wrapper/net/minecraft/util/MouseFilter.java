package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.MouseFilter")
public interface MouseFilter {

    void reset();

    float smooth(float var0, float var1);

}
