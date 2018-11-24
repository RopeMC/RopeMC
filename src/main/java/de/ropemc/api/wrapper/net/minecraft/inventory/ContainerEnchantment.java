package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.ContainerEnchantment")
public interface ContainerEnchantment {

    boolean canInteractWith(EntityPlayer var0);

    void detectAndSendChanges();

    boolean enchantItem(EntityPlayer var0, int var1);

    List func_178148_a(ItemStack var0, int var1, int var2);

    int getLapisAmount();

    void onContainerClosed(EntityPlayer var0);

    void onCraftGuiOpened(ICrafting var0);

    void onCraftMatrixChanged(IInventory var0);

    ItemStack transferStackInSlot(EntityPlayer var0, int var1);

    void updateProgressBar(int var0, int var1);

}
