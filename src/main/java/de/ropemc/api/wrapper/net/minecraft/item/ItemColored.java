package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemColored")
public interface ItemColored {

    int getColorFromItemStack(ItemStack var0, int var1);

    int getMetadata(int var0);

    String getUnlocalizedName(ItemStack var0);

    ItemColored setSubtypeNames(String[] var0);

}
