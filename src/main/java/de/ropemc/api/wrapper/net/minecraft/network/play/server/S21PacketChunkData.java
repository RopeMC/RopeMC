package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import de.ropemc.api.wrapper.net.minecraft.world.chunk.Chunk;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S21PacketChunkData")
public interface S21PacketChunkData {

    byte[] func_149272_d();

    boolean func_149274_i();

    //S21PacketChunkData$Extracted func_179756_a(Chunk var0, boolean var1, boolean var2, int var3);

    int func_179757_a(byte[] var0, byte[] var1, int var2);

    int func_180737_a(int var0, boolean var1, boolean var2);

    int getChunkX();

    int getChunkZ();

    int getExtractedSize();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
