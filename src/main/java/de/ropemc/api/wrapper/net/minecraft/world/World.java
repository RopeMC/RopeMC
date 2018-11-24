package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import java.util.Collection;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.crash.CrashReport;
import de.ropemc.api.wrapper.net.minecraft.crash.CrashReportCategory;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.IChunkProvider;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.Random;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.gen.structure.StructureBoundingBox;
import de.ropemc.api.wrapper.net.minecraft.world.biome.BiomeGenBase;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.Chunk;
import java.util.Calendar;
//import com.google.common.base.Predicate;
import de.ropemc.api.wrapper.net.minecraft.world.storage.MapStorage;
import java.util.UUID;
import de.ropemc.api.wrapper.net.minecraft.world.storage.ISaveHandler;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.Scoreboard;
import de.ropemc.api.wrapper.net.minecraft.village.VillageCollection;
import de.ropemc.api.wrapper.net.minecraft.world.border.WorldBorder;
import de.ropemc.api.wrapper.net.minecraft.world.biome.WorldChunkManager;
import de.ropemc.api.wrapper.net.minecraft.world.storage.WorldInfo;
import de.ropemc.api.wrapper.net.minecraft.block.material.Material;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.util.EnumParticleTypes;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.World")
public interface World {

    void addBlockEvent(BlockPos var0, Block var1, int var2, int var3);

    void addTileEntities(Collection var0);

    boolean addTileEntity(TileEntity var0);

    boolean addWeatherEffect(Entity var0);

    void addWorldAccess(IWorldAccess var0);

    CrashReportCategory addWorldInfoToCrashReport(CrashReport var0);

    void calculateInitialSkylight();

    void calculateInitialWeather();

    int calculateSkylightSubtracted(float var0);

    boolean canBlockBePlaced(Block var0, BlockPos var1, boolean var2, EnumFacing var3, Entity var4, ItemStack var5);

    boolean canBlockFreeze(BlockPos var0, boolean var1);

    boolean canBlockFreezeNoWater(BlockPos var0);

    boolean canBlockFreezeWater(BlockPos var0);

    boolean canBlockSeeSky(BlockPos var0);

    boolean canLightningStrike(BlockPos var0);

    boolean canSeeSky(BlockPos var0);

    boolean canSnowAt(BlockPos var0, boolean var1);

    boolean checkBlockCollision(AxisAlignedBB var0);

    boolean checkLight(BlockPos var0);

    boolean checkLightFor(EnumSkyBlock var0, BlockPos var1);

    boolean checkNoEntityCollision(AxisAlignedBB var0);

    boolean checkNoEntityCollision(AxisAlignedBB var0, Entity var1);

    void checkSessionLock();

    int countEntities(Class var0);

    IChunkProvider createChunkProvider();

    Explosion createExplosion(Entity var0, double var1, double var2, double var3, float var4, boolean var5);

    boolean destroyBlock(BlockPos var0, boolean var1);

    boolean doesBlockHaveSolidTopSurface(IBlockAccess var0, BlockPos var1);

    boolean extendedLevelsInChunkCache();

    boolean extinguishFire(EntityPlayer var0, BlockPos var1, EnumFacing var2);

    Entity findNearestEntityWithinAABB(Class var0, AxisAlignedBB var1, Entity var2);

    void forceBlockUpdateTick(Block var0, BlockPos var1, Random var2);

    List func_147461_a(AxisAlignedBB var0);

    List func_175712_a(StructureBoundingBox var0, boolean var1);

    void func_181544_b(int var0);

    int func_181545_F();

    int getActualHeight();

    BiomeGenBase getBiomeGenForCoords(BlockPos var0);

    float getBlockDensity(Vec3 var0, AxisAlignedBB var1);

    IBlockState getBlockState(BlockPos var0);

    float getCelestialAngle(float var0);

    float getCelestialAngleRadians(float var0);

    Chunk getChunkFromBlockCoords(BlockPos var0);

    Chunk getChunkFromChunkCoords(int var0, int var1);

    IChunkProvider getChunkProvider();

    int getChunksLowestHorizon(int var0, int var1);

    EntityPlayer getClosestPlayer(double var0, double var1, double var2, double var3);

    EntityPlayer getClosestPlayerToEntity(Entity var0, double var1);

    Vec3 getCloudColour(float var0);

    List getCollidingBoundingBoxes(Entity var0, AxisAlignedBB var1);

    int getCombinedLight(BlockPos var0, int var1);

    Calendar getCurrentDate();

    float getCurrentMoonPhaseFactor();

    String getDebugLoadedEntities();

    EnumDifficulty getDifficulty();

    DifficultyInstance getDifficultyForLocation(BlockPos var0);

    //List getEntities(Class var0, Predicate var1);

    //List getEntitiesInAABBexcluding(Entity var0, AxisAlignedBB var1, Predicate var2);

    List getEntitiesWithinAABB(Class var0, AxisAlignedBB var1);

    //List getEntitiesWithinAABB(Class var0, AxisAlignedBB var1, Predicate var2);

    List getEntitiesWithinAABBExcludingEntity(Entity var0, AxisAlignedBB var1);

    Entity getEntityByID(int var0);

    Vec3 getFogColor(float var0);

    GameRules getGameRules();

    Block getGroundAboveSeaLevel(BlockPos var0);

    int getHeight();

    BlockPos getHeight(BlockPos var0);

    double getHorizon();

    int getLastLightningBolt();

    int getLight(BlockPos var0);

    int getLight(BlockPos var0, boolean var1);

    float getLightBrightness(BlockPos var0);

    int getLightFor(EnumSkyBlock var0, BlockPos var1);

    int getLightFromNeighbors(BlockPos var0);

    int getLightFromNeighborsFor(EnumSkyBlock var0, BlockPos var1);

    List getLoadedEntityList();

    MapStorage getMapStorage();

    int getMoonPhase();

    List getPendingBlockUpdates(Chunk var0, boolean var1);

    EntityPlayer getPlayerEntityByName(String var0);

    EntityPlayer getPlayerEntityByUUID(UUID var0);

    //List getPlayers(Class var0, Predicate var1);

    BlockPos getPrecipitationHeight(BlockPos var0);

    String getProviderName();

    float getRainStrength(float var0);

    int getRawLight(BlockPos var0, EnumSkyBlock var1);

    int getRedstonePower(BlockPos var0, EnumFacing var1);

    int getRenderDistanceChunks();

    ISaveHandler getSaveHandler();

    Scoreboard getScoreboard();

    long getSeed();

    Vec3 getSkyColor(Entity var0, float var1);

    int getSkylightSubtracted();

    BlockPos getSpawnPoint();

    float getStarBrightness(float var0);

    int getStrongPower(BlockPos var0);

    int getStrongPower(BlockPos var0, EnumFacing var1);

    BlockPos getStrongholdPos(String var0, BlockPos var1);

    float getSunBrightness(float var0);

    float getThunderStrength(float var0);

    TileEntity getTileEntity(BlockPos var0);

    BlockPos getTopSolidOrLiquidBlock(BlockPos var0);

    long getTotalWorldTime();

    int getUniqueDataId(String var0);

    VillageCollection getVillageCollection();

    WorldBorder getWorldBorder();

    WorldChunkManager getWorldChunkManager();

    WorldInfo getWorldInfo();

    long getWorldTime();

    WorldType getWorldType();

    boolean handleMaterialAcceleration(AxisAlignedBB var0, Material var1, Entity var2);

    World init();

    void initialize(WorldSettings var0);

    boolean isAABBInMaterial(AxisAlignedBB var0, Material var1);

    boolean isAirBlock(BlockPos var0);

    boolean isAnyLiquid(AxisAlignedBB var0);

    boolean isAnyPlayerWithinRangeAt(double var0, double var1, double var2, double var3);

    boolean isAreaLoaded(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6);

    boolean isAreaLoaded(BlockPos var0, int var1);

    boolean isAreaLoaded(BlockPos var0, int var1, boolean var2);

    boolean isAreaLoaded(BlockPos var0, BlockPos var1);

    boolean isAreaLoaded(BlockPos var0, BlockPos var1, boolean var2);

    boolean isAreaLoaded(StructureBoundingBox var0);

    boolean isAreaLoaded(StructureBoundingBox var0, boolean var1);

    boolean isBlockFullCube(BlockPos var0);

    int isBlockIndirectlyGettingPowered(BlockPos var0);

    boolean isBlockLoaded(BlockPos var0);

    boolean isBlockLoaded(BlockPos var0, boolean var1);

    boolean isBlockModifiable(EntityPlayer var0, BlockPos var1);

    boolean isBlockNormalCube(BlockPos var0, boolean var1);

    boolean isBlockPowered(BlockPos var0);

    boolean isBlockTickPending(BlockPos var0, Block var1);

    boolean isBlockinHighHumidity(BlockPos var0);

    boolean isChunkLoaded(int var0, int var1, boolean var2);

    boolean isDaytime();

    boolean isFindingSpawnPoint();

    boolean isFlammableWithin(AxisAlignedBB var0);

    boolean isInsideBorder(WorldBorder var0, Entity var1);

    boolean isMaterialInBB(AxisAlignedBB var0, Material var1);

    boolean isRaining();

    boolean isSidePowered(BlockPos var0, EnumFacing var1);

    boolean isSpawnChunk(int var0, int var1);

    boolean isThundering();

    boolean isValid(BlockPos var0);

    boolean isWater(BlockPos var0);

    void joinEntityInSurroundings(Entity var0);

    void loadEntities(Collection var0);

    WorldSavedData loadItemData(Class var0, String var1);

    void makeFireworks(double var0, double var1, double var2, double var3, double var4, double var5, NBTTagCompound var6);

    void markBlockForUpdate(BlockPos var0);

    void markBlockRangeForRenderUpdate(int var0, int var1, int var2, int var3, int var4, int var5);

    void markBlockRangeForRenderUpdate(BlockPos var0, BlockPos var1);

    void markBlocksDirtyVertical(int var0, int var1, int var2, int var3);

    void markChunkDirty(BlockPos var0, TileEntity var1);

    void markTileEntityForRemoval(TileEntity var0);

    Explosion newExplosion(Entity var0, double var1, double var2, double var3, float var4, boolean var5, boolean var6);

    void notifyBlockOfStateChange(BlockPos var0, Block var1);

    void notifyLightSet(BlockPos var0);

    void notifyNeighborsOfStateChange(BlockPos var0, Block var1);

    void notifyNeighborsOfStateExcept(BlockPos var0, Block var1, EnumFacing var2);

    void notifyNeighborsRespectDebug(BlockPos var0, Block var1);

    void onEntityAdded(Entity var0);

    void onEntityRemoved(Entity var0);

    void playAuxSFX(int var0, BlockPos var1, int var2);

    void playAuxSFXAtEntity(EntityPlayer var0, int var1, BlockPos var2, int var3);

    void playBroadcastSound(int var0, BlockPos var1, int var2);

    void playMoodSoundAndCheckLight(int var0, int var1, Chunk var2);

    void playRecord(BlockPos var0, String var1);

    void playSound(double var0, double var1, double var2, String var3, float var4, float var5, boolean var6);

    void playSoundAtEntity(Entity var0, String var1, float var2, float var3);

    void playSoundEffect(double var0, double var1, double var2, String var3, float var4, float var5);

    void playSoundToNearExcept(EntityPlayer var0, String var1, float var2, float var3);

    MovingObjectPosition rayTraceBlocks(Vec3 var0, Vec3 var1);

    MovingObjectPosition rayTraceBlocks(Vec3 var0, Vec3 var1, boolean var2);

    MovingObjectPosition rayTraceBlocks(Vec3 var0, Vec3 var1, boolean var2, boolean var3, boolean var4);

    void removeEntity(Entity var0);

    void removePlayerEntityDangerously(Entity var0);

    void removeTileEntity(BlockPos var0);

    void removeWorldAccess(IWorldAccess var0);

    void scheduleBlockUpdate(BlockPos var0, Block var1, int var2, int var3);

    void scheduleUpdate(BlockPos var0, Block var1, int var2);

    void sendBlockBreakProgress(int var0, BlockPos var1, int var2);

    void sendQuittingDisconnectingPacket();

    void setActivePlayerChunksAndCheckLight();

    void setAllowedSpawnTypes(boolean var0, boolean var1);

    boolean setBlockState(BlockPos var0, IBlockState var1);

    boolean setBlockState(BlockPos var0, IBlockState var1, int var2);

    boolean setBlockToAir(BlockPos var0);

    void setEntityState(Entity var0, byte var1);

    void setInitialSpawnLocation();

    void setItemData(String var0, WorldSavedData var1);

    void setLastLightningBolt(int var0);

    void setLightFor(EnumSkyBlock var0, BlockPos var1, int var2);

    void setRainStrength(float var0);

    Random setRandomSeed(int var0, int var1, int var2);

    void setSkylightSubtracted(int var0);

    void setSpawnPoint(BlockPos var0);

    void setThunderStrength(float var0);

    void setTileEntity(BlockPos var0, TileEntity var1);

    void setTotalWorldTime(long var0);

    void setWorldTime(long var0);

    boolean spawnEntityInWorld(Entity var0);

    void spawnParticle(int var0, boolean var1, double var2, double var3, double var4, double var5, double var6, double var7, int[] var8);

    void spawnParticle(EnumParticleTypes var0, double var1, double var2, double var3, double var4, double var5, double var6, int[] var7);

    void spawnParticle(EnumParticleTypes var0, boolean var1, double var2, double var3, double var4, double var5, double var6, double var7, int[] var8);

    void tick();

    boolean tickUpdates(boolean var0);

    void unloadEntities(Collection var0);

    void updateAllPlayersSleepingFlag();

    void updateBlockTick(BlockPos var0, Block var1, int var2, int var3);

    void updateBlocks();

    void updateComparatorOutputLevel(BlockPos var0, Block var1);

    void updateEntities();

    void updateEntity(Entity var0);

    void updateEntityWithOptionalForce(Entity var0, boolean var1);

    void updateWeather();

}
