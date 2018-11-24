package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.ContainerDispenser")
public interface ContainerDispenser {

    boolean canInteractWith(EntityPlayer var0);

    ItemStack transferStackInSlot(EntityPlayer var0, int var1);

}
