package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.StatCollector")
public interface StatCollector {

    boolean canTranslate(String var0);

    long getLastTranslationUpdateTimeInMilliseconds();

    String translateToFallback(String var0);

    String translateToLocal(String var0);

    String translateToLocalFormatted(String var0, Object[] var1);

}
