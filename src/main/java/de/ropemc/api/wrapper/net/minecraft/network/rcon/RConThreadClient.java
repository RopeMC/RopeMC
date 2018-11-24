package de.ropemc.api.wrapper.net.minecraft.network.rcon;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.rcon.RConThreadClient")
public interface RConThreadClient {

    void closeSocket();

    void sendLoginFailedResponse();

    void sendMultipacketResponse(int var0, String var1);

    void sendResponse(int var0, int var1, String var2);

}
