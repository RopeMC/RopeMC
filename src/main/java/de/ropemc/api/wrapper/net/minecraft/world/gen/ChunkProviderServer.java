package de.ropemc.api.wrapper.net.minecraft.world.gen;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.IChunkProvider;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.Chunk;
import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureType;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.IProgressUpdate;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.ChunkProviderServer")
public interface ChunkProviderServer {

    boolean canSave();

    boolean chunkExists(int var0, int var1);

    void dropChunk(int var0, int var1);

    List func_152380_a();

    boolean func_177460_a(IChunkProvider var0, Chunk var1, int var2, int var3);

    int getLoadedChunkCount();

    List getPossibleCreatures(EnumCreatureType var0, BlockPos var1);

    BlockPos getStrongholdGen(World var0, String var1, BlockPos var2);

    Chunk loadChunk(int var0, int var1);

    Chunk loadChunkFromFile(int var0, int var1);

    String makeString();

    void populate(IChunkProvider var0, int var1, int var2);

    Chunk provideChunk(int var0, int var1);

    Chunk provideChunk(BlockPos var0);

    void recreateStructures(Chunk var0, int var1, int var2);

    void saveChunkData(Chunk var0);

    void saveChunkExtraData(Chunk var0);

    boolean saveChunks(boolean var0, IProgressUpdate var1);

    void saveExtraData();

    void unloadAllChunks();

    boolean unloadQueuedChunks();

}
