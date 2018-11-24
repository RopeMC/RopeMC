package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockOre")
public interface BlockOre {

    int damageDropped(IBlockState var0);

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    int getDamageValue(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int quantityDropped(Random var0);

    int quantityDroppedWithBonus(int var0, Random var1);

}
