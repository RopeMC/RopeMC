package de.ropemc.api.wrapper.net.minecraft.client.multiplayer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.multiplayer.ServerAddress")
public interface ServerAddress {

    ServerAddress func_78860_a(String var0);

    String getIP();

    int getPort();

    String[] getServerAddress(String var0);

    int parseIntWithDefault(String var0, int var1);

}
