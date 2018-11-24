package de.ropemc.api.wrapper.net.minecraft.client.network;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.network.handshake.client.C00Handshake;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.network.NetHandlerHandshakeMemory")
public interface NetHandlerHandshakeMemory {

    void onDisconnect(IChatComponent var0);

    void processHandshake(C00Handshake var0);

}
