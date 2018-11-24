package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import de.ropemc.api.wrapper.net.minecraft.util.EnumParticleTypes;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S2APacketParticles")
public interface S2APacketParticles {

    int[] getParticleArgs();

    int getParticleCount();

    float getParticleSpeed();

    EnumParticleTypes getParticleType();

    double getXCoordinate();

    float getXOffset();

    double getYCoordinate();

    float getYOffset();

    double getZCoordinate();

    float getZOffset();

    boolean isLongDistance();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
