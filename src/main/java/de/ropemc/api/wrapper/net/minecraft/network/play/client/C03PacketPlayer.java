package de.ropemc.api.wrapper.net.minecraft.network.play.client;

import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayServer;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.client.C03PacketPlayer")
public interface C03PacketPlayer {

    float getPitch();

    double getPositionX();

    double getPositionY();

    double getPositionZ();

    boolean getRotating();

    float getYaw();

    boolean isMoving();

    boolean isOnGround();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayServer var0);

    void readPacketData(PacketBuffer var0);

    void setMoving(boolean var0);

    void writePacketData(PacketBuffer var0);

}
