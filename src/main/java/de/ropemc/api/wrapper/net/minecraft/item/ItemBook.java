package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemBook")
public interface ItemBook {

    int getItemEnchantability();

    boolean isItemTool(ItemStack var0);

}
