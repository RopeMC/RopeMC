package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S14PacketEntity")
public interface S14PacketEntity {

    boolean func_149060_h();

    byte func_149061_d();

    byte func_149062_c();

    byte func_149063_g();

    byte func_149064_e();

    byte func_149066_f();

    Entity getEntity(World var0);

    boolean getOnGround();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
