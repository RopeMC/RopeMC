package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityChest")
public interface TileEntityChest {

    void checkForAdjacentChests();

    void clear();

    void closeInventory(EntityPlayer var0);

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    ItemStack decrStackSize(int var0, int var1);

    void func_174910_a(TileEntityChest var0, EnumFacing var1);

    TileEntityChest getAdjacentChest(EnumFacing var0);

    int getChestType();

    int getField(int var0);

    int getFieldCount();

    String getGuiID();

    int getInventoryStackLimit();

    String getName();

    int getSizeInventory();

    ItemStack getStackInSlot(int var0);

    boolean hasCustomName();

    void invalidate();

    boolean isChestAt(BlockPos var0);

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isUseableByPlayer(EntityPlayer var0);

    void openInventory(EntityPlayer var0);

    void readFromNBT(NBTTagCompound var0);

    boolean receiveClientEvent(int var0, int var1);

    ItemStack removeStackFromSlot(int var0);

    void setCustomName(String var0);

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

    void update();

    void updateContainingBlockInfo();

    void writeToNBT(NBTTagCompound var0);

}
