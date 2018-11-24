package de.ropemc.api.wrapper.net.minecraft.network.handshake;

import de.ropemc.api.wrapper.net.minecraft.network.handshake.client.C00Handshake;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.handshake.INetHandlerHandshakeServer")
public interface INetHandlerHandshakeServer {

    void processHandshake(C00Handshake var0);

}
