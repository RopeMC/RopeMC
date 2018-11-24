package de.ropemc.api.wrapper.net.minecraft.world;

//import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving$SpawnPlacementType;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.biome.BiomeGenBase;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.SpawnerAnimals")
public interface SpawnerAnimals {

    //boolean canCreatureTypeSpawnAtLocation(EntityLiving$SpawnPlacementType var0, World var1, BlockPos var2);

    int findChunksForSpawning(WorldServer var0, boolean var1, boolean var2, boolean var3);

    BlockPos getRandomChunkPosition(World var0, int var1, int var2);

    void performWorldGenSpawning(World var0, BiomeGenBase var1, int var2, int var3, int var4, int var5, Random var6);

}
