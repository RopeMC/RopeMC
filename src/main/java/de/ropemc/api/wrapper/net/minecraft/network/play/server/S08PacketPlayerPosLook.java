package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S08PacketPlayerPosLook")
public interface S08PacketPlayerPosLook {

    Set func_179834_f();

    float getPitch();

    double getX();

    double getY();

    float getYaw();

    double getZ();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
