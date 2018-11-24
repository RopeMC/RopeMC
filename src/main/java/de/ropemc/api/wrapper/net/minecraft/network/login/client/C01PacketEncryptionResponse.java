package de.ropemc.api.wrapper.net.minecraft.network.login.client;

import java.security.PrivateKey;
import javax.crypto.SecretKey;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.login.INetHandlerLoginServer;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.login.client.C01PacketEncryptionResponse")
public interface C01PacketEncryptionResponse {

    SecretKey getSecretKey(PrivateKey var0);

    byte[] getVerifyToken(PrivateKey var0);

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerLoginServer var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
