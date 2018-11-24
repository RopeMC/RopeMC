package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import java.util.List;
import java.util.UUID;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S0CPacketSpawnPlayer")
public interface S0CPacketSpawnPlayer {

    List func_148944_c();

    int getCurrentItemID();

    int getEntityID();

    byte getPitch();

    UUID getPlayer();

    int getX();

    int getY();

    byte getYaw();

    int getZ();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
