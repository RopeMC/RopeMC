package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.Slot")
public interface Slot {

    boolean canBeHovered();

    boolean canTakeStack(EntityPlayer var0);

    ItemStack decrStackSize(int var0);

    boolean getHasStack();

    int getItemStackLimit(ItemStack var0);

    int getSlotStackLimit();

    String getSlotTexture();

    ItemStack getStack();

    boolean isHere(IInventory var0, int var1);

    boolean isItemValid(ItemStack var0);

    void onCrafting(ItemStack var0);

    void onCrafting(ItemStack var0, int var1);

    void onPickupFromSlot(EntityPlayer var0, ItemStack var1);

    void onSlotChange(ItemStack var0, ItemStack var1);

    void onSlotChanged();

    void putStack(ItemStack var0);

}
