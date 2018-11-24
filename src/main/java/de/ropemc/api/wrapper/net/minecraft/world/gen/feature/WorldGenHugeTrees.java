package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenHugeTrees")
public interface WorldGenHugeTrees {

    int func_150533_a(Random var0);

    void func_175925_a(World var0, BlockPos var1, int var2);

    boolean func_175926_c(World var0, BlockPos var1, int var2);

    boolean func_175927_a(BlockPos var0, World var1);

    void func_175928_b(World var0, BlockPos var1, int var2);

    boolean func_175929_a(World var0, Random var1, BlockPos var2, int var3);

}
