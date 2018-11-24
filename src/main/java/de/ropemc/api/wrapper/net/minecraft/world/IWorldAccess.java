package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.IWorldAccess")
public interface IWorldAccess {

    void broadcastSound(int var0, BlockPos var1, int var2);

    void markBlockForUpdate(BlockPos var0);

    void markBlockRangeForRenderUpdate(int var0, int var1, int var2, int var3, int var4, int var5);

    void notifyLightSet(BlockPos var0);

    void onEntityAdded(Entity var0);

    void onEntityRemoved(Entity var0);

    void playAuxSFX(EntityPlayer var0, int var1, BlockPos var2, int var3);

    void playRecord(String var0, BlockPos var1);

    void playSound(String var0, double var1, double var2, double var3, float var4, float var5);

    void playSoundToNearExcept(EntityPlayer var0, String var1, double var2, double var3, double var4, float var5, float var6);

    void sendBlockBreakProgress(int var0, BlockPos var1, int var2);

    void spawnParticle(int var0, boolean var1, double var2, double var3, double var4, double var5, double var6, double var7, int[] var8);

}
