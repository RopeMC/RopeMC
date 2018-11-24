package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayerMP;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityTrackerEntry")
public interface EntityTrackerEntry {

    Packet func_151260_c();

    void func_151261_b(Packet var0);

    boolean func_180233_c(EntityPlayerMP var0);

    boolean isPlayerWatchingThisChunk(EntityPlayerMP var0);

    void removeFromTrackedPlayers(EntityPlayerMP var0);

    void removeTrackedPlayerSymmetric(EntityPlayerMP var0);

    void sendDestroyEntityPacketToTrackedPlayers();

    void sendMetadataToAllAssociatedPlayers();

    void sendPacketToTrackedPlayers(Packet var0);

    void updatePlayerEntities(List var0);

    void updatePlayerEntity(EntityPlayerMP var0);

    void updatePlayerList(List var0);

}
