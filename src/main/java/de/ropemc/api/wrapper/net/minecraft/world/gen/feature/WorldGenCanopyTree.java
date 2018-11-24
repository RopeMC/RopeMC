package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenCanopyTree")
public interface WorldGenCanopyTree {

    void func_150526_a(World var0, int var1, int var2, int var3);

    boolean func_181638_a(World var0, BlockPos var1, int var2);

    void func_181639_b(World var0, BlockPos var1);

    boolean generate(World var0, Random var1, BlockPos var2);

}
