package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.block.material.MapColor;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockGlowstone")
public interface BlockGlowstone {

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    MapColor getMapColor(IBlockState var0);

    int quantityDropped(Random var0);

    int quantityDroppedWithBonus(int var0, Random var1);

}
