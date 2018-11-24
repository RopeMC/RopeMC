package de.ropemc.api.wrapper.net.minecraft.network.login.server;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.login.INetHandlerLoginClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.login.server.S00PacketDisconnect")
public interface S00PacketDisconnect {

    IChatComponent func_149603_c();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerLoginClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
