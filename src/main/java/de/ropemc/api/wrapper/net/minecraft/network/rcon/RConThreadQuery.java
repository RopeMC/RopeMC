package de.ropemc.api.wrapper.net.minecraft.network.rcon;

import java.net.DatagramPacket;
import java.net.SocketAddress;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.rcon.RConThreadQuery")
public interface RConThreadQuery {

    void cleanQueryClientsMap();

    byte[] createQueryResponse(DatagramPacket var0);

    byte[] getRequestID(SocketAddress var0);

    boolean initQuerySystem();

    boolean parseIncomingPacket(DatagramPacket var0);

    void sendAuthChallenge(DatagramPacket var0);

    void sendResponsePacket(byte[] var0, DatagramPacket var1);

    void startThread();

    void stopWithException(Exception var0);

    Boolean verifyClientAuth(DatagramPacket var0);

}
