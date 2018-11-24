package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockMelon")
public interface BlockMelon {

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int quantityDropped(Random var0);

    int quantityDroppedWithBonus(int var0, Random var1);

}
