package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
//import com.google.common.util.concurrent.ListenableFuture;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureType;
//import de.ropemc.api.wrapper.net.minecraft.world.biome.BiomeGenBase$SpawnListEntry;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.IChunkProvider;
import de.ropemc.api.wrapper.net.minecraft.block.BlockEventData;
import de.ropemc.api.wrapper.net.minecraft.world.gen.structure.StructureBoundingBox;
import java.util.List;
import java.util.UUID;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityTracker;
//import de.ropemc.api.wrapper.net.minecraft.server.MinecraftServer;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.Chunk;
import de.ropemc.api.wrapper.net.minecraft.server.management.PlayerManager;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.IProgressUpdate;
import de.ropemc.api.wrapper.net.minecraft.util.EnumParticleTypes;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.WorldServer")
public interface WorldServer {

    void addBlockEvent(BlockPos var0, Block var1, int var2, int var3);

    //ListenableFuture addScheduledTask(Runnable var0);

    boolean addWeatherEffect(Entity var0);

    BlockPos adjustPosToNearbyEntity(BlockPos var0);

    boolean areAllPlayersAsleep();

    //boolean canCreatureTypeSpawnHere(EnumCreatureType var0, BiomeGenBase$SpawnListEntry var1, BlockPos var2);

    boolean canSpawnAnimals();

    boolean canSpawnNPCs();

    void createBonusChest();

    IChunkProvider createChunkProvider();

    void createSpawnPosition(WorldSettings var0);

    boolean fireBlockEvent(BlockEventData var0);

    void flush();

    List func_175712_a(StructureBoundingBox var0, boolean var1);

    Teleporter getDefaultTeleporter();

    Entity getEntityFromUuid(UUID var0);

    EntityTracker getEntityTracker();

    //MinecraftServer getMinecraftServer();

    List getPendingBlockUpdates(Chunk var0, boolean var1);

    PlayerManager getPlayerManager();

    int getRenderDistanceChunks();

    BlockPos getSpawnCoordinate();

    //BiomeGenBase$SpawnListEntry getSpawnListEntryForTypeAt(EnumCreatureType var0, BlockPos var1);

    List getTileEntitiesIn(int var0, int var1, int var2, int var3, int var4, int var5);

    World init();

    void initialize(WorldSettings var0);

    boolean isBlockModifiable(EntityPlayer var0, BlockPos var1);

    boolean isBlockTickPending(BlockPos var0, Block var1);

    boolean isCallingFromMinecraftThread();

    Explosion newExplosion(Entity var0, double var1, double var2, double var3, float var4, boolean var5, boolean var6);

    void onEntityAdded(Entity var0);

    void onEntityRemoved(Entity var0);

    void resetRainAndThunder();

    void resetUpdateEntityTick();

    void saveAllChunks(boolean var0, IProgressUpdate var1);

    void saveChunkData();

    void saveLevel();

    void scheduleBlockUpdate(BlockPos var0, Block var1, int var2, int var3);

    void scheduleUpdate(BlockPos var0, Block var1, int var2);

    void sendQueuedBlockEvents();

    void setDebugWorldSettings();

    void setEntityState(Entity var0, byte var1);

    void setInitialSpawnLocation();

    void spawnParticle(EnumParticleTypes var0, double var1, double var2, double var3, int var4, double var5, double var6, double var7, double var8, int[] var9);

    void spawnParticle(EnumParticleTypes var0, boolean var1, double var2, double var3, double var4, int var5, double var6, double var7, double var8, double var9, int[] var10);

    void tick();

    boolean tickUpdates(boolean var0);

    void updateAllPlayersSleepingFlag();

    void updateBlockTick(BlockPos var0, Block var1, int var2, int var3);

    void updateBlocks();

    void updateEntities();

    void updateEntityWithOptionalForce(Entity var0, boolean var1);

    void updateWeather();

    void wakeAllPlayers();

}
