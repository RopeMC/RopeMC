package de.ropemc.api.wrapper.net.minecraft.network.login;

import de.ropemc.api.wrapper.net.minecraft.network.login.server.S00PacketDisconnect;
import de.ropemc.api.wrapper.net.minecraft.network.login.server.S03PacketEnableCompression;
import de.ropemc.api.wrapper.net.minecraft.network.login.server.S01PacketEncryptionRequest;
import de.ropemc.api.wrapper.net.minecraft.network.login.server.S02PacketLoginSuccess;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.login.INetHandlerLoginClient")
public interface INetHandlerLoginClient {

    void handleDisconnect(S00PacketDisconnect var0);

    void handleEnableCompression(S03PacketEnableCompression var0);

    void handleEncryptionRequest(S01PacketEncryptionRequest var0);

    void handleLoginSuccess(S02PacketLoginSuccess var0);

}
