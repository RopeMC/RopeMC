package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.world.LockCode;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.InventoryLargeChest")
public interface InventoryLargeChest {

    void clear();

    void closeInventory(EntityPlayer var0);

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    ItemStack decrStackSize(int var0, int var1);

    IChatComponent getDisplayName();

    int getField(int var0);

    int getFieldCount();

    String getGuiID();

    int getInventoryStackLimit();

    LockCode getLockCode();

    String getName();

    int getSizeInventory();

    ItemStack getStackInSlot(int var0);

    boolean hasCustomName();

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isLocked();

    boolean isPartOfLargeChest(IInventory var0);

    boolean isUseableByPlayer(EntityPlayer var0);

    void markDirty();

    void openInventory(EntityPlayer var0);

    ItemStack removeStackFromSlot(int var0);

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

    void setLockCode(LockCode var0);

}
