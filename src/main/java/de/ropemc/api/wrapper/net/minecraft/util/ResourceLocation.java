package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ResourceLocation")
public interface ResourceLocation {

    String getResourceDomain();

    String getResourcePath();

    String[] splitObjectName(String var0);

}
