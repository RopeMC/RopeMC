package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.ISidedInventory")
public interface ISidedInventory {

    boolean canExtractItem(int var0, ItemStack var1, EnumFacing var2);

    boolean canInsertItem(int var0, ItemStack var1, EnumFacing var2);

    int[] getSlotsForFace(EnumFacing var0);

}
