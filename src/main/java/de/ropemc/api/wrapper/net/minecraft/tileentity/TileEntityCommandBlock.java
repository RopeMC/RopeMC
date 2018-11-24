package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.command.server.CommandBlockLogic;
import de.ropemc.api.wrapper.net.minecraft.command.CommandResultStats;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityCommandBlock")
public interface TileEntityCommandBlock {

    boolean func_183000_F();

    CommandBlockLogic getCommandBlockLogic();

    CommandResultStats getCommandResultStats();

    Packet getDescriptionPacket();

    void readFromNBT(NBTTagCompound var0);

    void writeToNBT(NBTTagCompound var0);

}
