package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import de.ropemc.api.wrapper.net.minecraft.world.EnumDifficulty;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S41PacketServerDifficulty")
public interface S41PacketServerDifficulty {

    EnumDifficulty getDifficulty();

    boolean isDifficultyLocked();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
