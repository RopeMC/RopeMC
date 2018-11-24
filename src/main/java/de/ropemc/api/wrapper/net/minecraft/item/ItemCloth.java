package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemCloth")
public interface ItemCloth {

    int getMetadata(int var0);

    String getUnlocalizedName(ItemStack var0);

}
