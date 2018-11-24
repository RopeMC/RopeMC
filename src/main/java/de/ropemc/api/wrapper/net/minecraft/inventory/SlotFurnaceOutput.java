package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.SlotFurnaceOutput")
public interface SlotFurnaceOutput {

    ItemStack decrStackSize(int var0);

    boolean isItemValid(ItemStack var0);

    void onCrafting(ItemStack var0);

    void onCrafting(ItemStack var0, int var1);

    void onPickupFromSlot(EntityPlayer var0, ItemStack var1);

}
