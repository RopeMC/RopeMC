package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenMegaPineTree")
public interface WorldGenMegaPineTree {

    void func_150541_c(World var0, int var1, int var2, int var3, int var4, Random var5);

    void func_175933_b(World var0, BlockPos var1);

    void func_175934_c(World var0, BlockPos var1);

    void func_180711_a(World var0, Random var1, BlockPos var2);

    boolean generate(World var0, Random var1, BlockPos var2);

}
