package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.RegionRenderCacheBuilder")
public interface RegionRenderCacheBuilder {

    WorldRenderer getWorldRendererByLayer(EnumWorldBlockLayer var0);

    WorldRenderer getWorldRendererByLayerId(int var0);

}
