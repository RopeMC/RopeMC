package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.ContainerRepair")
public interface ContainerRepair {

    //IInventory access$000(ContainerRepair var0);

    //int access$100(ContainerRepair var0);

    boolean canInteractWith(EntityPlayer var0);

    void onContainerClosed(EntityPlayer var0);

    void onCraftGuiOpened(ICrafting var0);

    void onCraftMatrixChanged(IInventory var0);

    ItemStack transferStackInSlot(EntityPlayer var0, int var1);

    void updateItemName(String var0);

    void updateProgressBar(int var0, int var1);

    void updateRepairOutput();

}
