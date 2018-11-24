package de.ropemc.api.wrapper.net.minecraft.network.status;

import de.ropemc.api.wrapper.net.minecraft.network.status.server.S01PacketPong;
import de.ropemc.api.wrapper.net.minecraft.network.status.server.S00PacketServerInfo;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.status.INetHandlerStatusClient")
public interface INetHandlerStatusClient {

    void handlePong(S01PacketPong var0);

    void handleServerInfo(S00PacketServerInfo var0);

}
