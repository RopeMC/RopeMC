package de.ropemc.api.wrapper.net.minecraft.network.status.client;

import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.status.INetHandlerStatusServer;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.status.client.C00PacketServerQuery")
public interface C00PacketServerQuery {

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerStatusServer var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
