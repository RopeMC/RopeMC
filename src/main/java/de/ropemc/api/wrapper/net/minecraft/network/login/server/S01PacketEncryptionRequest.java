package de.ropemc.api.wrapper.net.minecraft.network.login.server;

import java.security.PublicKey;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.login.INetHandlerLoginClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.login.server.S01PacketEncryptionRequest")
public interface S01PacketEncryptionRequest {

    PublicKey getPublicKey();

    String getServerId();

    byte[] getVerifyToken();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerLoginClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
