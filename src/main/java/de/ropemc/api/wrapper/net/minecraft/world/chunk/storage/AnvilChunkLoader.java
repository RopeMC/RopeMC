package de.ropemc.api.wrapper.net.minecraft.world.chunk.storage;

import de.ropemc.api.wrapper.net.minecraft.world.ChunkCoordIntPair;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.Chunk;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.storage.AnvilChunkLoader")
public interface AnvilChunkLoader {

    void addChunkToPending(ChunkCoordIntPair var0, NBTTagCompound var1);

    Chunk checkedReadChunkFromNBT(World var0, int var1, int var2, NBTTagCompound var3);

    void chunkTick();

    void func_183013_b(ChunkCoordIntPair var0, NBTTagCompound var1);

    Chunk loadChunk(World var0, int var1, int var2);

    Chunk readChunkFromNBT(World var0, NBTTagCompound var1);

    void saveChunk(World var0, Chunk var1);

    void saveExtraChunkData(World var0, Chunk var1);

    void saveExtraData();

    void writeChunkToNBT(Chunk var0, World var1, NBTTagCompound var2);

    boolean writeNextIO();

}
