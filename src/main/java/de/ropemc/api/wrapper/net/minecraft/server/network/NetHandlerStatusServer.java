package de.ropemc.api.wrapper.net.minecraft.server.network;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.network.status.client.C01PacketPing;
import de.ropemc.api.wrapper.net.minecraft.network.status.client.C00PacketServerQuery;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.network.NetHandlerStatusServer")
public interface NetHandlerStatusServer {

    void onDisconnect(IChatComponent var0);

    void processPing(C01PacketPing var0);

    void processServerQuery(C00PacketServerQuery var0);

}
