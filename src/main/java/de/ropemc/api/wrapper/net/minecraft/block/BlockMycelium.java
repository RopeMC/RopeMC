package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockMycelium")
public interface BlockMycelium {

    BlockState createBlockState();

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
