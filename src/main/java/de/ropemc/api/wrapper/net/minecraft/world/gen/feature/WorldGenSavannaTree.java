package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenSavannaTree")
public interface WorldGenSavannaTree {

    void func_175924_b(World var0, BlockPos var1);

    void func_181642_b(World var0, BlockPos var1);

    boolean generate(World var0, Random var1, BlockPos var2);

}
