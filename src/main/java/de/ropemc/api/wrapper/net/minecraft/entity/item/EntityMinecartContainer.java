package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.LockCode;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityMinecartContainer")
public interface EntityMinecartContainer {

    void applyDrag();

    void clear();

    void closeInventory(EntityPlayer var0);

    ItemStack decrStackSize(int var0, int var1);

    int getField(int var0);

    int getFieldCount();

    int getInventoryStackLimit();

    LockCode getLockCode();

    String getName();

    ItemStack getStackInSlot(int var0);

    boolean interactFirst(EntityPlayer var0);

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isLocked();

    boolean isUseableByPlayer(EntityPlayer var0);

    void killMinecart(DamageSource var0);

    void markDirty();

    void openInventory(EntityPlayer var0);

    void readEntityFromNBT(NBTTagCompound var0);

    ItemStack removeStackFromSlot(int var0);

    void setDead();

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

    void setLockCode(LockCode var0);

    void travelToDimension(int var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
