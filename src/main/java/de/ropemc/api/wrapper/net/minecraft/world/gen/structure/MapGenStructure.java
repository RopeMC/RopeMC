package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.ChunkCoordIntPair;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.ChunkPrimer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.MapGenStructure")
public interface MapGenStructure {

    boolean canSpawnStructureAtCoords(int var0, int var1);

    void func_143026_a(int var0, int var1, StructureStart var2);

    void func_143027_a(World var0);

    boolean func_175795_b(BlockPos var0);

    boolean func_175796_a(World var0, BlockPos var1);

    StructureStart func_175797_c(BlockPos var0);

    boolean generateStructure(World var0, Random var1, ChunkCoordIntPair var2);

    BlockPos getClosestStrongholdPos(World var0, BlockPos var1);

    List getCoordList();

    String getStructureName();

    StructureStart getStructureStart(int var0, int var1);

    void recursiveGenerate(World var0, int var1, int var2, int var3, int var4, ChunkPrimer var5);

}
