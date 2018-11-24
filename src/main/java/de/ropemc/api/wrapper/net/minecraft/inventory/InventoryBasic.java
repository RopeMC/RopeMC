package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.InventoryBasic")
public interface InventoryBasic {

    void clear();

    void closeInventory(EntityPlayer var0);

    ItemStack decrStackSize(int var0, int var1);

    void func_110132_b(IInvBasic var0);

    void func_110134_a(IInvBasic var0);

    ItemStack func_174894_a(ItemStack var0);

    IChatComponent getDisplayName();

    int getField(int var0);

    int getFieldCount();

    int getInventoryStackLimit();

    String getName();

    int getSizeInventory();

    ItemStack getStackInSlot(int var0);

    boolean hasCustomName();

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isUseableByPlayer(EntityPlayer var0);

    void markDirty();

    void openInventory(EntityPlayer var0);

    ItemStack removeStackFromSlot(int var0);

    void setCustomName(String var0);

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

}
