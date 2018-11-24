package de.ropemc.api.wrapper.net.minecraft.network;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.INetHandler")
public interface INetHandler {

    void onDisconnect(IChatComponent var0);

}
