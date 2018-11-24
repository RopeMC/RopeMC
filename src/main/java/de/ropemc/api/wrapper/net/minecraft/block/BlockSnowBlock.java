package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockSnowBlock")
public interface BlockSnowBlock {

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int quantityDropped(Random var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
