package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRedstoneTorch")
public interface BlockRedstoneTorch {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canProvidePower();

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getStrongPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    int getWeakPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    boolean isAssociatedBlock(Block var0);

    boolean isBurnedOut(World var0, BlockPos var1, boolean var2);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void randomTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    boolean shouldBeOff(World var0, BlockPos var1, IBlockState var2);

    int tickRate(World var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
