package de.ropemc.api.wrapper.net.minecraft.world.biome;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.gen.feature.WorldGenerator;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.BiomeDecorator")
public interface BiomeDecorator {

    void decorate(World var0, Random var1, BiomeGenBase var2, BlockPos var3);

    void genDecorations(BiomeGenBase var0);

    void genStandardOre1(int var0, WorldGenerator var1, int var2, int var3);

    void genStandardOre2(int var0, WorldGenerator var1, int var2, int var3);

    void generateOres();

}
