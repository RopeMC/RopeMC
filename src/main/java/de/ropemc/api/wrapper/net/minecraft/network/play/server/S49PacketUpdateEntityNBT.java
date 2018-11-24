package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S49PacketUpdateEntityNBT")
public interface S49PacketUpdateEntityNBT {

    Entity getEntity(World var0);

    NBTTagCompound getTagCompound();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
