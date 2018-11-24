package de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk;

import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.chunk.ListedRenderChunk")
public interface ListedRenderChunk {

    void deleteGlResources();

    int getDisplayList(EnumWorldBlockLayer var0, CompiledChunk var1);

}
