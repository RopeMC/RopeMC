package de.ropemc.api.wrapper.net.minecraft.client.multiplayer;

import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.crash.CrashReport;
import de.ropemc.api.wrapper.net.minecraft.crash.CrashReportCategory;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.IChunkProvider;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.Scoreboard;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.multiplayer.WorldClient")
public interface WorldClient {

    //Set access$000(WorldClient var0);

    //Set access$100(WorldClient var0);

    //Minecraft access$200(WorldClient var0);

    void addEntityToWorld(int var0, Entity var1);

    CrashReportCategory addWorldInfoToCrashReport(CrashReport var0);

    IChunkProvider createChunkProvider();

    void doPreChunk(int var0, int var1, boolean var2);

    void doVoidFogParticles(int var0, int var1, int var2);

    Entity getEntityByID(int var0);

    int getRenderDistanceChunks();

    void invalidateBlockReceiveRegion(int var0, int var1, int var2, int var3, int var4, int var5);

    boolean invalidateRegionAndSetBlock(BlockPos var0, IBlockState var1);

    void makeFireworks(double var0, double var1, double var2, double var3, double var4, double var5, NBTTagCompound var6);

    void onEntityAdded(Entity var0);

    void onEntityRemoved(Entity var0);

    void playSound(double var0, double var1, double var2, String var3, float var4, float var5, boolean var6);

    void playSoundAtPos(BlockPos var0, String var1, float var2, float var3, boolean var4);

    void removeAllEntities();

    void removeEntity(Entity var0);

    Entity removeEntityFromWorld(int var0);

    void sendQuittingDisconnectingPacket();

    void setWorldScoreboard(Scoreboard var0);

    void setWorldTime(long var0);

    boolean spawnEntityInWorld(Entity var0);

    void tick();

    void updateBlocks();

    void updateWeather();

}
