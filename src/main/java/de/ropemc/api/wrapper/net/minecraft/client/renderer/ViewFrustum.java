package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk.IRenderChunkFactory;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk.RenderChunk;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.ViewFrustum")
public interface ViewFrustum {

    void createRenderChunks(IRenderChunkFactory var0);

    void deleteGlResources();

    int func_178157_a(int var0, int var1, int var2);

    RenderChunk getRenderChunk(BlockPos var0);

    void markBlocksForUpdate(int var0, int var1, int var2, int var3, int var4, int var5);

    void setCountChunksXYZ(int var0);

    void updateChunkPositions(double var0, double var1);

}
