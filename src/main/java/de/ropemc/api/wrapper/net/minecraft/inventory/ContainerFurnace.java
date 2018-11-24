package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.ContainerFurnace")
public interface ContainerFurnace {

    boolean canInteractWith(EntityPlayer var0);

    void detectAndSendChanges();

    void onCraftGuiOpened(ICrafting var0);

    ItemStack transferStackInSlot(EntityPlayer var0, int var1);

    void updateProgressBar(int var0, int var1);

}
