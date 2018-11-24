package de.ropemc.api.wrapper.net.minecraft.network;

import de.ropemc.api.wrapper.net.minecraft.util.IThreadListener;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.PacketThreadUtil")
public interface PacketThreadUtil {

    void checkThreadAndEnqueue(Packet var0, INetHandler var1, IThreadListener var2);

}
