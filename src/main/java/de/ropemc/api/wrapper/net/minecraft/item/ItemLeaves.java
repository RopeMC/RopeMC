package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemLeaves")
public interface ItemLeaves {

    int getColorFromItemStack(ItemStack var0, int var1);

    int getMetadata(int var0);

    String getUnlocalizedName(ItemStack var0);

}
