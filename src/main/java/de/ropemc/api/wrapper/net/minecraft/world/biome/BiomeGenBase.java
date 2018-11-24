package de.ropemc.api.wrapper.net.minecraft.world.biome;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.gen.feature.WorldGenAbstractTree;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.ChunkPrimer;
import de.ropemc.api.wrapper.net.minecraft.world.gen.feature.WorldGenerator;
import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureType;
import java.util.List;
//import de.ropemc.api.wrapper.net.minecraft.block.BlockFlower$EnumFlowerType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.BiomeGenBase")
public interface BiomeGenBase {

    boolean canSpawnLightningBolt();

    BiomeDecorator createBiomeDecorator();

    BiomeGenBase createMutatedBiome(int var0);

    BiomeGenBase createMutation();

    void decorate(World var0, Random var1, BlockPos var2);

    BiomeGenBase func_150557_a(int var0, boolean var1);

    BiomeGenBase func_150563_c(int var0);

    WorldGenAbstractTree genBigTreeChance(Random var0);

    void genTerrainBlocks(World var0, Random var1, ChunkPrimer var2, int var3, int var4, double var5);

    void generateBiomeTerrain(World var0, Random var1, ChunkPrimer var2, int var3, int var4, double var5);

    BiomeGenBase getBiome(int var0);

    Class getBiomeClass();

    BiomeGenBase getBiomeFromBiomeList(int var0, BiomeGenBase var1);

    BiomeGenBase[] getBiomeGenArray();

    boolean getEnableSnow();

    float getFloatRainfall();

    float getFloatTemperature(BlockPos var0);

    int getFoliageColorAtPos(BlockPos var0);

    int getGrassColorAtPos(BlockPos var0);

    int getIntRainfall();

    WorldGenerator getRandomWorldGenForGrass(Random var0);

    int getSkyColorByTemp(float var0);

    List getSpawnableList(EnumCreatureType var0);

    float getSpawningChance();

    //BiomeGenBase$TempCategory getTempCategory();

    boolean isEqualTo(BiomeGenBase var0);

    boolean isHighHumidity();

    boolean isSnowyBiome();

    //BlockFlower$EnumFlowerType pickRandomFlower(Random var0, BlockPos var1);

    BiomeGenBase setBiomeName(String var0);

    BiomeGenBase setColor(int var0);

    BiomeGenBase setDisableRain();

    BiomeGenBase setEnableSnow();

    BiomeGenBase setFillerBlockMetadata(int var0);

    //BiomeGenBase setHeight(BiomeGenBase$Height var0);

    BiomeGenBase setTemperatureRainfall(float var0, float var1);

}
