package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.WorldProviderSurface")
public interface WorldProviderSurface {

    String getDimensionName();

    String getInternalNameSuffix();

}
