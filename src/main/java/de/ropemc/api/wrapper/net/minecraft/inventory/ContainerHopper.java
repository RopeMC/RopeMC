package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.ContainerHopper")
public interface ContainerHopper {

    boolean canInteractWith(EntityPlayer var0);

    void onContainerClosed(EntityPlayer var0);

    ItemStack transferStackInSlot(EntityPlayer var0, int var1);

}
