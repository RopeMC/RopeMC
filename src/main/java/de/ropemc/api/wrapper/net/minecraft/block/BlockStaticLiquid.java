package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockStaticLiquid")
public interface BlockStaticLiquid {

    boolean getCanBlockBurn(World var0, BlockPos var1);

    boolean isSurroundingBlockFlammable(World var0, BlockPos var1);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void updateLiquid(World var0, BlockPos var1, IBlockState var2);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
