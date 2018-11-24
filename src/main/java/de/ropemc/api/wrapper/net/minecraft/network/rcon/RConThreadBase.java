package de.ropemc.api.wrapper.net.minecraft.network.rcon;

import java.net.ServerSocket;
import java.net.DatagramSocket;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.rcon.RConThreadBase")
public interface RConThreadBase {

    void closeAllSockets();

    void closeAllSockets_do(boolean var0);

    boolean closeServerSocket(ServerSocket var0);

    boolean closeServerSocket_do(ServerSocket var0, boolean var1);

    boolean closeSocket(DatagramSocket var0, boolean var1);

    int getNumberOfPlayers();

    boolean isRunning();

    void logDebug(String var0);

    void logInfo(String var0);

    void logSevere(String var0);

    void logWarning(String var0);

    void registerSocket(DatagramSocket var0);

    void startThread();

}
