package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S0EPacketSpawnObject")
public interface S0EPacketSpawnObject {

    void func_149002_g(int var0);

    int func_149009_m();

    int getEntityID();

    int getPitch();

    int getSpeedX();

    int getSpeedY();

    int getSpeedZ();

    int getType();

    int getX();

    int getY();

    int getYaw();

    int getZ();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void setSpeedX(int var0);

    void setSpeedY(int var0);

    void setSpeedZ(int var0);

    void setX(int var0);

    void setY(int var0);

    void setZ(int var0);

    void writePacketData(PacketBuffer var0);

}
