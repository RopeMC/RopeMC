package de.ropemc.api.wrapper.net.minecraft.network.login;

import de.ropemc.api.wrapper.net.minecraft.network.login.client.C01PacketEncryptionResponse;
import de.ropemc.api.wrapper.net.minecraft.network.login.client.C00PacketLoginStart;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.login.INetHandlerLoginServer")
public interface INetHandlerLoginServer {

    void processEncryptionResponse(C01PacketEncryptionResponse var0);

    void processLoginStart(C00PacketLoginStart var0);

}
