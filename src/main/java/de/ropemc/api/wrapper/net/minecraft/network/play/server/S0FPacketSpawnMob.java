package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S0FPacketSpawnMob")
public interface S0FPacketSpawnMob {

    List func_149027_c();

    int getEntityID();

    int getEntityType();

    byte getHeadPitch();

    byte getPitch();

    int getVelocityX();

    int getVelocityY();

    int getVelocityZ();

    int getX();

    int getY();

    byte getYaw();

    int getZ();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
