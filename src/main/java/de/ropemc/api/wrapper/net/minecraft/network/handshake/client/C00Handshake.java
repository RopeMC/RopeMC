package de.ropemc.api.wrapper.net.minecraft.network.handshake.client;

import de.ropemc.api.wrapper.net.minecraft.network.EnumConnectionState;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.handshake.INetHandlerHandshakeServer;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.handshake.client.C00Handshake")
public interface C00Handshake {

    int getProtocolVersion();

    EnumConnectionState getRequestedState();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerHandshakeServer var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
