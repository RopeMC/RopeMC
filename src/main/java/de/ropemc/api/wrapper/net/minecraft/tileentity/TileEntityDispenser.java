package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityDispenser")
public interface TileEntityDispenser {

    int addItemStack(ItemStack var0);

    void clear();

    void closeInventory(EntityPlayer var0);

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    ItemStack decrStackSize(int var0, int var1);

    int getDispenseSlot();

    int getField(int var0);

    int getFieldCount();

    String getGuiID();

    int getInventoryStackLimit();

    String getName();

    int getSizeInventory();

    ItemStack getStackInSlot(int var0);

    boolean hasCustomName();

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isUseableByPlayer(EntityPlayer var0);

    void openInventory(EntityPlayer var0);

    void readFromNBT(NBTTagCompound var0);

    ItemStack removeStackFromSlot(int var0);

    void setCustomName(String var0);

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

    void writeToNBT(NBTTagCompound var0);

}
