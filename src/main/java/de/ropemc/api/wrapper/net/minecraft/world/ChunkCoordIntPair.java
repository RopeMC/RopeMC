package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.ChunkCoordIntPair")
public interface ChunkCoordIntPair {

    long chunkXZ2Int(int var0, int var1);

    BlockPos getBlock(int var0, int var1, int var2);

    BlockPos getCenterBlock(int var0);

    int getCenterXPos();

    int getCenterZPosition();

    int getXEnd();

    int getXStart();

    int getZEnd();

    int getZStart();

}
