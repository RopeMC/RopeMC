package de.ropemc.api.wrapper.net.minecraft.network;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.Packet")
public interface Packet {

    void processPacket(INetHandler var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
