package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.inventory.IInventory;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityFurnace")
public interface TileEntityFurnace {

    boolean canExtractItem(int var0, ItemStack var1, EnumFacing var2);

    boolean canInsertItem(int var0, ItemStack var1, EnumFacing var2);

    boolean canSmelt();

    void clear();

    void closeInventory(EntityPlayer var0);

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    ItemStack decrStackSize(int var0, int var1);

    int getCookTime(ItemStack var0);

    int getField(int var0);

    int getFieldCount();

    String getGuiID();

    int getInventoryStackLimit();

    int getItemBurnTime(ItemStack var0);

    String getName();

    int getSizeInventory();

    int[] getSlotsForFace(EnumFacing var0);

    ItemStack getStackInSlot(int var0);

    boolean hasCustomName();

    boolean isBurning();

    boolean isBurning(IInventory var0);

    boolean isItemFuel(ItemStack var0);

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isUseableByPlayer(EntityPlayer var0);

    void openInventory(EntityPlayer var0);

    void readFromNBT(NBTTagCompound var0);

    ItemStack removeStackFromSlot(int var0);

    void setCustomInventoryName(String var0);

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

    void smeltItem();

    void update();

    void writeToNBT(NBTTagCompound var0);

}
