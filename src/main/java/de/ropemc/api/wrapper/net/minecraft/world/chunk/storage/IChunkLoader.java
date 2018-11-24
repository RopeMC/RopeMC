package de.ropemc.api.wrapper.net.minecraft.world.chunk.storage;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.Chunk;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.storage.IChunkLoader")
public interface IChunkLoader {

    void chunkTick();

    Chunk loadChunk(World var0, int var1, int var2);

    void saveChunk(World var0, Chunk var1);

    void saveExtraChunkData(World var0, Chunk var1);

    void saveExtraData();

}
