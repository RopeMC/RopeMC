package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenAbstractTree")
public interface WorldGenAbstractTree {

    boolean func_150523_a(Block var0);

    void func_175921_a(World var0, BlockPos var1);

    void func_180711_a(World var0, Random var1, BlockPos var2);

}
