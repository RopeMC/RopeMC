package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S27PacketExplosion")
public interface S27PacketExplosion {

    float func_149144_d();

    float func_149147_e();

    float func_149149_c();

    List getAffectedBlockPositions();

    float getStrength();

    double getX();

    double getY();

    double getZ();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
