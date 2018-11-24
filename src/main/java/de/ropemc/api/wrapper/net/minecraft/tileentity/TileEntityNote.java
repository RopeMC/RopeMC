package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityNote")
public interface TileEntityNote {

    void changePitch();

    void readFromNBT(NBTTagCompound var0);

    void triggerNote(World var0, BlockPos var1);

    void writeToNBT(NBTTagCompound var0);

}
