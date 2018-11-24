package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemPickaxe")
public interface ItemPickaxe {

    boolean canHarvestBlock(Block var0);

    float getStrVsBlock(ItemStack var0, Block var1);

}
