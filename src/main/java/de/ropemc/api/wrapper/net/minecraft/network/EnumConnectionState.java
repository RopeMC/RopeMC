package de.ropemc.api.wrapper.net.minecraft.network;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.EnumConnectionState")
public interface EnumConnectionState {

    EnumConnectionState getById(int var0);

    EnumConnectionState getFromPacket(Packet var0);

    int getId();

    Packet getPacket(EnumPacketDirection var0, int var1);

    Integer getPacketId(EnumPacketDirection var0, Packet var1);

    EnumConnectionState registerPacket(EnumPacketDirection var0, Class var1);

}
