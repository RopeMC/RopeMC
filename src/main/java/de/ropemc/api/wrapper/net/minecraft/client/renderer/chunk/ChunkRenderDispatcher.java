package de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk;

import java.util.concurrent.BlockingQueue;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.RegionRenderCacheBuilder;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.WorldRenderer;
//import com.google.common.util.concurrent.ListenableFuture;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.vertex.VertexBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.chunk.ChunkRenderDispatcher")
public interface ChunkRenderDispatcher {

    //BlockingQueue access$000(ChunkRenderDispatcher var0);

    RegionRenderCacheBuilder allocateRenderBuilder();

    void clearChunkUpdates();

    void freeRenderBuilder(RegionRenderCacheBuilder var0);

    String getDebugInfo();

    ChunkCompileTaskGenerator getNextChunkUpdate();

    boolean runChunkUploads(long var0);

    void stopChunkUpdates();

    boolean updateChunkLater(RenderChunk var0);

    boolean updateChunkNow(RenderChunk var0);

    boolean updateTransparencyLater(RenderChunk var0);

    //ListenableFuture uploadChunk(EnumWorldBlockLayer var0, WorldRenderer var1, RenderChunk var2, CompiledChunk var3);

    void uploadDisplayList(WorldRenderer var0, int var1, RenderChunk var2);

    void uploadVertexBuffer(WorldRenderer var0, VertexBuffer var1);

}
