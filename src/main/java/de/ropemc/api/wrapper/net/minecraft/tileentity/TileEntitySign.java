package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.command.CommandResultStats;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntitySign")
public interface TileEntitySign {

    //CommandResultStats access$000(TileEntitySign var0);

    boolean executeCommand(EntityPlayer var0);

    boolean func_183000_F();

    Packet getDescriptionPacket();

    boolean getIsEditable();

    EntityPlayer getPlayer();

    CommandResultStats getStats();

    void readFromNBT(NBTTagCompound var0);

    void setEditable(boolean var0);

    void setPlayer(EntityPlayer var0);

    void writeToNBT(NBTTagCompound var0);

}
