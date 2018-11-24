package de.ropemc.api.wrapper.net.minecraft.world.chunk;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.world.biome.WorldChunkManager;
import de.ropemc.api.wrapper.net.minecraft.world.biome.BiomeGenBase;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import de.ropemc.api.wrapper.net.minecraft.world.ChunkCoordIntPair;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.List;
//import com.google.common.base.Predicate;
import de.ropemc.api.wrapper.net.minecraft.util.ClassInheritanceMultiMap;
import de.ropemc.api.wrapper.net.minecraft.world.EnumSkyBlock;
import java.util.Random;
import java.util.Map;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.Chunk")
public interface Chunk {

    void addEntity(Entity var0);

    void addTileEntity(TileEntity var0);

    void addTileEntity(BlockPos var0, TileEntity var1);

    boolean canSeeSky(BlockPos var0);

    void checkSkylightNeighborHeight(int var0, int var1, int var2);

    TileEntity createNewTileEntity(BlockPos var0);

    void enqueueRelightChecks();

    void fillChunk(byte[] var0, int var1, boolean var2);

    void func_150804_b(boolean var0);

    void func_150809_p();

    boolean func_150811_f(int var0, int var1);

    void func_177441_y();

    void func_180700_a(EnumFacing var0);

    void generateHeightMap();

    void generateSkylightMap();

    boolean getAreLevelsEmpty(int var0, int var1);

    BiomeGenBase getBiome(BlockPos var0, WorldChunkManager var1);

    byte[] getBiomeArray();

    Block getBlock(int var0, int var1, int var2);

    Block getBlock(BlockPos var0);

    Block getBlock0(int var0, int var1, int var2);

    int getBlockLightOpacity(int var0, int var1, int var2);

    int getBlockLightOpacity(BlockPos var0);

    int getBlockMetadata(int var0, int var1, int var2);

    int getBlockMetadata(BlockPos var0);

    IBlockState getBlockState(BlockPos var0);

    ExtendedBlockStorage[] getBlockStorageArray();

    ChunkCoordIntPair getChunkCoordIntPair();

    //void getEntitiesOfTypeWithinAAAB(Class var0, AxisAlignedBB var1, List var2, Predicate var3);

    //void getEntitiesWithinAABBForEntity(Entity var0, AxisAlignedBB var1, List var2, Predicate var3);

    ClassInheritanceMultiMap[] getEntityLists();

    int getHeight(BlockPos var0);

    int[] getHeightMap();

    int getHeightValue(int var0, int var1);

    long getInhabitedTime();

    int getLightFor(EnumSkyBlock var0, BlockPos var1);

    int getLightSubtracted(BlockPos var0, int var1);

    int getLowestHeight();

    BlockPos getPrecipitationHeight(BlockPos var0);

    Random getRandomWithSeed(long var0);

    //TileEntity getTileEntity(BlockPos var0, Chunk$EnumCreateEntityType var1);

    Map getTileEntityMap();

    int getTopFilledSegment();

    World getWorld();

    boolean isAtLocation(int var0, int var1);

    boolean isEmpty();

    boolean isLightPopulated();

    boolean isLoaded();

    boolean isPopulated();

    boolean isTerrainPopulated();

    boolean needsSaving(boolean var0);

    void onChunkLoad();

    void onChunkUnload();

    void populateChunk(IChunkProvider var0, IChunkProvider var1, int var2, int var3);

    void propagateSkylightOcclusion(int var0, int var1);

    void recheckGaps(boolean var0);

    void relightBlock(int var0, int var1, int var2);

    void removeEntity(Entity var0);

    void removeEntityAtIndex(Entity var0, int var1);

    void removeTileEntity(BlockPos var0);

    void resetRelightChecks();

    void setBiomeArray(byte[] var0);

    IBlockState setBlockState(BlockPos var0, IBlockState var1);

    void setChunkLoaded(boolean var0);

    void setChunkModified();

    void setHasEntities(boolean var0);

    void setHeightMap(int[] var0);

    void setInhabitedTime(long var0);

    void setLastSaveTime(long var0);

    void setLightFor(EnumSkyBlock var0, BlockPos var1, int var2);

    void setLightPopulated(boolean var0);

    void setModified(boolean var0);

    void setStorageArrays(ExtendedBlockStorage[] var0);

    void setTerrainPopulated(boolean var0);

    void updateSkylightNeighborHeight(int var0, int var1, int var2, int var3);

}
