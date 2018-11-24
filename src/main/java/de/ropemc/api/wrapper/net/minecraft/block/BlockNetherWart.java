package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockNetherWart")
public interface BlockNetherWart {

    boolean canBlockStay(World var0, BlockPos var1, IBlockState var2);

    boolean canPlaceBlockOn(Block var0);

    BlockState createBlockState();

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    int quantityDropped(Random var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
