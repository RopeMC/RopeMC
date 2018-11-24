package de.ropemc.api.wrapper.net.minecraft.world.biome;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.gen.feature.WorldGenAbstractTree;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.BiomeGenSnow")
public interface BiomeGenSnow {

    BiomeGenBase createMutatedBiome(int var0);

    void decorate(World var0, Random var1, BlockPos var2);

    WorldGenAbstractTree genBigTreeChance(Random var0);

}
