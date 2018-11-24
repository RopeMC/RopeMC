package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayerMP;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.Chunk;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityTracker")
public interface EntityTracker {

    void addEntityToTracker(Entity var0, int var1, int var2, boolean var3);

    void func_151248_b(Entity var0, Packet var1);

    void func_180245_a(EntityPlayerMP var0);

    void func_85172_a(EntityPlayerMP var0, Chunk var1);

    void removePlayerFromTrackers(EntityPlayerMP var0);

    void sendToAllTrackingEntity(Entity var0, Packet var1);

    void trackEntity(Entity var0);

    void trackEntity(Entity var0, int var1, int var2);

    void untrackEntity(Entity var0);

    void updateTrackedEntities();

}
