package de.ropemc.api.wrapper.net.minecraft.server.network;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.network.handshake.client.C00Handshake;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.network.NetHandlerHandshakeTCP")
public interface NetHandlerHandshakeTCP {

    void onDisconnect(IChatComponent var0);

    void processHandshake(C00Handshake var0);

}
