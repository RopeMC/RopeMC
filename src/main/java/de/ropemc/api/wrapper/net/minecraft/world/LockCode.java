package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.LockCode")
public interface LockCode {

    LockCode fromNBT(NBTTagCompound var0);

    String getLock();

    boolean isEmpty();

    void toNBT(NBTTagCompound var0);

}
