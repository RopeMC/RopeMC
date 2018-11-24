package de.ropemc.api.wrapper.net.minecraft.client.multiplayer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.multiplayer.ServerList")
public interface ServerList {

    void addServerData(ServerData var0);

    int countServers();

    void func_147413_a(int var0, ServerData var1);

    void func_147414_b(ServerData var0);

    ServerData getServerData(int var0);

    void loadServerList();

    void removeServerData(int var0);

    void saveServerList();

    void swapServers(int var0, int var1);

}
