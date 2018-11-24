package de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.RenderGlobal;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.chunk.IRenderChunkFactory")
public interface IRenderChunkFactory {

    RenderChunk makeRenderChunk(World var0, RenderGlobal var1, BlockPos var2, int var3);

}
