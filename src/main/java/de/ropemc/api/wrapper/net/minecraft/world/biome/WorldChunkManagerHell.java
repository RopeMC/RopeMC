package de.ropemc.api.wrapper.net.minecraft.world.biome;

import java.util.List;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.WorldChunkManagerHell")
public interface WorldChunkManagerHell {

    boolean areBiomesViable(int var0, int var1, int var2, List var3);

    BlockPos findBiomePosition(int var0, int var1, int var2, List var3, Random var4);

    BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] var0, int var1, int var2, int var3, int var4, boolean var5);

    BiomeGenBase getBiomeGenerator(BlockPos var0);

    BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] var0, int var1, int var2, int var3, int var4);

    float[] getRainfall(float[] var0, int var1, int var2, int var3, int var4);

    BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] var0, int var1, int var2, int var3, int var4);

}
