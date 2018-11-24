package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityBeacon")
public interface TileEntityBeacon {

    void addEffectsToPlayers();

    void clear();

    void closeInventory(EntityPlayer var0);

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    ItemStack decrStackSize(int var0, int var1);

    int func_183001_h(int var0);

    List getBeamSegments();

    Packet getDescriptionPacket();

    int getField(int var0);

    int getFieldCount();

    String getGuiID();

    int getInventoryStackLimit();

    double getMaxRenderDistanceSquared();

    String getName();

    int getSizeInventory();

    ItemStack getStackInSlot(int var0);

    boolean hasCustomName();

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isUseableByPlayer(EntityPlayer var0);

    void openInventory(EntityPlayer var0);

    void readFromNBT(NBTTagCompound var0);

    boolean receiveClientEvent(int var0, int var1);

    ItemStack removeStackFromSlot(int var0);

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

    void setName(String var0);

    float shouldBeamRender();

    void update();

    void updateBeacon();

    void updateSegmentColors();

    void writeToNBT(NBTTagCompound var0);

}
