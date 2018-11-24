package de.ropemc.api.wrapper.net.minecraft.network.play.client;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayServer;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.client.C08PacketPlayerBlockPlacement")
public interface C08PacketPlayerBlockPlacement {

    int getPlacedBlockDirection();

    float getPlacedBlockOffsetX();

    float getPlacedBlockOffsetY();

    float getPlacedBlockOffsetZ();

    BlockPos getPosition();

    ItemStack getStack();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayServer var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
