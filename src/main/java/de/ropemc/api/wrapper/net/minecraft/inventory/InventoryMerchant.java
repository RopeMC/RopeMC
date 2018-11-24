package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.village.MerchantRecipe;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.InventoryMerchant")
public interface InventoryMerchant {

    void clear();

    void closeInventory(EntityPlayer var0);

    ItemStack decrStackSize(int var0, int var1);

    MerchantRecipe getCurrentRecipe();

    IChatComponent getDisplayName();

    int getField(int var0);

    int getFieldCount();

    int getInventoryStackLimit();

    String getName();

    int getSizeInventory();

    ItemStack getStackInSlot(int var0);

    boolean hasCustomName();

    boolean inventoryResetNeededOnSlotChange(int var0);

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isUseableByPlayer(EntityPlayer var0);

    void markDirty();

    void openInventory(EntityPlayer var0);

    ItemStack removeStackFromSlot(int var0);

    void resetRecipeAndSlots();

    void setCurrentRecipeIndex(int var0);

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

}
