package de.ropemc.api.wrapper.net.minecraft.network;

import java.util.List;
//import de.ropemc.api.wrapper.net.minecraft.server.MinecraftServer;
import java.net.InetAddress;
import java.net.SocketAddress;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.NetworkSystem")
public interface NetworkSystem {

    //List access$000(NetworkSystem var0);

    //MinecraftServer access$100(NetworkSystem var0);

    void addLanEndpoint(InetAddress var0, int var1);

    SocketAddress addLocalEndpoint();

    //MinecraftServer getServer();

    void networkTick();

    void terminateEndpoints();

}
