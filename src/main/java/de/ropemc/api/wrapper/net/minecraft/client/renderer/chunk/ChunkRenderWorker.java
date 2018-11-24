package de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk;

//import org.apache.logging.log4j.Logger;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.RegionRenderCacheBuilder;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.chunk.ChunkRenderWorker")
public interface ChunkRenderWorker {

    //void access$000(ChunkRenderWorker var0, ChunkCompileTaskGenerator var1);

    //Logger access$100();

    void freeRenderBuilder(ChunkCompileTaskGenerator var0);

    RegionRenderCacheBuilder getRegionRenderCacheBuilder();

    void processTask(ChunkCompileTaskGenerator var0);

}
