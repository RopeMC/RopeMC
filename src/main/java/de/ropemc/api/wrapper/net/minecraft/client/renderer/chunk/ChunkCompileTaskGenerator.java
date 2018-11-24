package de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk;

import java.util.concurrent.locks.ReentrantLock;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.RegionRenderCacheBuilder;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator")
public interface ChunkCompileTaskGenerator {

    void addFinishRunnable(Runnable var0);

    void finish();

    CompiledChunk getCompiledChunk();

    ReentrantLock getLock();

    RegionRenderCacheBuilder getRegionRenderCacheBuilder();

    RenderChunk getRenderChunk();

    //ChunkCompileTaskGenerator$Status getStatus();

    //ChunkCompileTaskGenerator$Type getType();

    boolean isFinished();

    void setCompiledChunk(CompiledChunk var0);

    void setRegionRenderCacheBuilder(RegionRenderCacheBuilder var0);

    //void setStatus(ChunkCompileTaskGenerator$Status var0);

}
