package de.ropemc.api.wrapper.net.minecraft.network.status.server;

import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.status.INetHandlerStatusClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.status.server.S01PacketPong")
public interface S01PacketPong {

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerStatusClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
