package de.ropemc.api.wrapper.net.minecraft.network.rcon;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.rcon.RConThreadMain")
public interface RConThreadMain {

    void cleanClientThreadsMap();

    void initClientThreadList();

    void startThread();

}
