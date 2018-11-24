package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRedstoneLight")
public interface BlockRedstoneLight {

    ItemStack createStackedBlock(IBlockState var0);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
