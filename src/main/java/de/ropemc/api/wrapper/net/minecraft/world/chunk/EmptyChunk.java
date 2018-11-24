package de.ropemc.api.wrapper.net.minecraft.world.chunk;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.List;
//import com.google.common.base.Predicate;
import de.ropemc.api.wrapper.net.minecraft.world.EnumSkyBlock;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.EmptyChunk")
public interface EmptyChunk {

    void addEntity(Entity var0);

    void addTileEntity(TileEntity var0);

    void addTileEntity(BlockPos var0, TileEntity var1);

    boolean canSeeSky(BlockPos var0);

    void generateHeightMap();

    void generateSkylightMap();

    boolean getAreLevelsEmpty(int var0, int var1);

    Block getBlock(BlockPos var0);

    int getBlockLightOpacity(BlockPos var0);

    int getBlockMetadata(BlockPos var0);

    //void getEntitiesOfTypeWithinAAAB(Class var0, AxisAlignedBB var1, List var2, Predicate var3);

    //void getEntitiesWithinAABBForEntity(Entity var0, AxisAlignedBB var1, List var2, Predicate var3);

    int getHeightValue(int var0, int var1);

    int getLightFor(EnumSkyBlock var0, BlockPos var1);

    int getLightSubtracted(BlockPos var0, int var1);

    Random getRandomWithSeed(long var0);

    //TileEntity getTileEntity(BlockPos var0, Chunk$EnumCreateEntityType var1);

    boolean isAtLocation(int var0, int var1);

    boolean isEmpty();

    boolean needsSaving(boolean var0);

    void onChunkLoad();

    void onChunkUnload();

    void removeEntity(Entity var0);

    void removeEntityAtIndex(Entity var0, int var1);

    void removeTileEntity(BlockPos var0);

    void setChunkModified();

    void setLightFor(EnumSkyBlock var0, BlockPos var1, int var2);

}
