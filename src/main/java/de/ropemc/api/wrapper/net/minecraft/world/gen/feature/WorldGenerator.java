package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenerator")
public interface WorldGenerator {

    void func_175904_e();

    boolean generate(World var0, Random var1, BlockPos var2);

    void setBlockAndNotifyAdequately(World var0, BlockPos var1, IBlockState var2);

}
