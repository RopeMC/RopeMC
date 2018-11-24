package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S39PacketPlayerAbilities")
public interface S39PacketPlayerAbilities {

    float getFlySpeed();

    float getWalkSpeed();

    boolean isAllowFlying();

    boolean isCreativeMode();

    boolean isFlying();

    boolean isInvulnerable();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void setAllowFlying(boolean var0);

    void setCreativeMode(boolean var0);

    void setFlySpeed(float var0);

    void setFlying(boolean var0);

    void setInvulnerable(boolean var0);

    void setWalkSpeed(float var0);

    void writePacketData(PacketBuffer var0);

}
