package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.ContainerBeacon")
public interface ContainerBeacon {

    boolean canInteractWith(EntityPlayer var0);

    IInventory func_180611_e();

    void onContainerClosed(EntityPlayer var0);

    void onCraftGuiOpened(ICrafting var0);

    ItemStack transferStackInSlot(EntityPlayer var0, int var1);

    void updateProgressBar(int var0, int var1);

}
