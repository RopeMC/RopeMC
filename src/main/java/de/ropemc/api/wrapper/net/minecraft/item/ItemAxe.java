package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemAxe")
public interface ItemAxe {

    float getStrVsBlock(ItemStack var0, Block var1);

}
