package de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.concurrent.locks.ReentrantLock;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.vertex.VertexBuffer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.WorldRenderer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.chunk.RenderChunk")
public interface RenderChunk {

    void deleteGlResources();

    void finishCompileTask();

    BlockPos func_181701_a(EnumFacing var0);

    CompiledChunk getCompiledChunk();

    ReentrantLock getLockCompileTask();

    BlockPos getPosition();

    VertexBuffer getVertexBufferByLayer(int var0);

    void initModelviewMatrix();

    boolean isNeedsUpdate();

    ChunkCompileTaskGenerator makeCompileTaskChunk();

    ChunkCompileTaskGenerator makeCompileTaskTransparency();

    void multModelviewMatrix();

    void postRenderBlocks(EnumWorldBlockLayer var0, float var1, float var2, float var3, WorldRenderer var4, CompiledChunk var5);

    void preRenderBlocks(WorldRenderer var0, BlockPos var1);

    void rebuildChunk(float var0, float var1, float var2, ChunkCompileTaskGenerator var3);

    void resortTransparency(float var0, float var1, float var2, ChunkCompileTaskGenerator var3);

    void setCompiledChunk(CompiledChunk var0);

    boolean setFrameIndex(int var0);

    void setNeedsUpdate(boolean var0);

    void setPosition(BlockPos var0);

    void stopCompileTask();

}
