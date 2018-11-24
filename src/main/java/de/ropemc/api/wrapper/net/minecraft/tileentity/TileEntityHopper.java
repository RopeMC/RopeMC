package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.inventory.IInventory;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItem;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityHopper")
public interface TileEntityHopper {

    boolean canCombine(ItemStack var0, ItemStack var1);

    boolean canExtractItemFromSlot(IInventory var0, ItemStack var1, int var2, EnumFacing var3);

    boolean canInsertItemInSlot(IInventory var0, ItemStack var1, int var2, EnumFacing var3);

    boolean captureDroppedItems(IHopper var0);

    void clear();

    void closeInventory(EntityPlayer var0);

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    ItemStack decrStackSize(int var0, int var1);

    List func_181556_a(World var0, double var1, double var2, double var3);

    int getField(int var0);

    int getFieldCount();

    String getGuiID();

    IInventory getHopperInventory(IHopper var0);

    IInventory getInventoryAtPosition(World var0, double var1, double var2, double var3);

    IInventory getInventoryForHopperTransfer();

    int getInventoryStackLimit();

    String getName();

    int getSizeInventory();

    ItemStack getStackInSlot(int var0);

    double getXPos();

    double getYPos();

    double getZPos();

    boolean hasCustomName();

    ItemStack insertStack(IInventory var0, ItemStack var1, int var2, EnumFacing var3);

    boolean isEmpty();

    boolean isFull();

    boolean isInventoryEmpty(IInventory var0, EnumFacing var1);

    boolean isInventoryFull(IInventory var0, EnumFacing var1);

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isOnTransferCooldown();

    boolean isUseableByPlayer(EntityPlayer var0);

    void markDirty();

    boolean mayTransfer();

    void openInventory(EntityPlayer var0);

    boolean pullItemFromSlot(IHopper var0, IInventory var1, int var2, EnumFacing var3);

    boolean putDropInInventoryAllSlots(IInventory var0, EntityItem var1);

    ItemStack putStackInInventoryAllSlots(IInventory var0, ItemStack var1, EnumFacing var2);

    void readFromNBT(NBTTagCompound var0);

    ItemStack removeStackFromSlot(int var0);

    void setCustomName(String var0);

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

    void setTransferCooldown(int var0);

    boolean transferItemsOut();

    void update();

    boolean updateHopper();

    void writeToNBT(NBTTagCompound var0);

}
