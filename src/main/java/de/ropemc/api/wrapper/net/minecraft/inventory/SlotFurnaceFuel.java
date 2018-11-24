package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.SlotFurnaceFuel")
public interface SlotFurnaceFuel {

    int getItemStackLimit(ItemStack var0);

    boolean isBucket(ItemStack var0);

    boolean isItemValid(ItemStack var0);

}
