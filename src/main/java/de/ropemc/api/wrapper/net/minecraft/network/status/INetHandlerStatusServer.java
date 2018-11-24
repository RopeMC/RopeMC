package de.ropemc.api.wrapper.net.minecraft.network.status;

import de.ropemc.api.wrapper.net.minecraft.network.status.client.C01PacketPing;
import de.ropemc.api.wrapper.net.minecraft.network.status.client.C00PacketServerQuery;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.status.INetHandlerStatusServer")
public interface INetHandlerStatusServer {

    void processPing(C01PacketPing var0);

    void processServerQuery(C00PacketServerQuery var0);

}
