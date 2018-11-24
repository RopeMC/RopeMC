package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.StringUtils")
public interface StringUtils {

    boolean isNullOrEmpty(String var0);

    String stripControlCodes(String var0);

    String ticksToElapsedTime(int var0);

}
