package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk.RenderChunk;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.ChunkRenderContainer")
public interface ChunkRenderContainer {

    void addRenderChunk(RenderChunk var0, EnumWorldBlockLayer var1);

    void initialize(double var0, double var1, double var2);

    void preRenderChunk(RenderChunk var0);

    void renderChunkLayer(EnumWorldBlockLayer var0);

}
