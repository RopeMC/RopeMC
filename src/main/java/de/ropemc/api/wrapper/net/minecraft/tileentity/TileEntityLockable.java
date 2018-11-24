package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.world.LockCode;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityLockable")
public interface TileEntityLockable {

    IChatComponent getDisplayName();

    LockCode getLockCode();

    boolean isLocked();

    void readFromNBT(NBTTagCompound var0);

    void setLockCode(LockCode var0);

    void writeToNBT(NBTTagCompound var0);

}
