package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.ContainerPlayer")
public interface ContainerPlayer {

    boolean canInteractWith(EntityPlayer var0);

    boolean canMergeSlot(ItemStack var0, Slot var1);

    void onContainerClosed(EntityPlayer var0);

    void onCraftMatrixChanged(IInventory var0);

    ItemStack transferStackInSlot(EntityPlayer var0, int var1);

}
