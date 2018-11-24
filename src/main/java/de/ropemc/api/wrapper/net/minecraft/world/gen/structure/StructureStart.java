package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import de.ropemc.api.wrapper.net.minecraft.world.ChunkCoordIntPair;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import java.util.LinkedList;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.StructureStart")
public interface StructureStart {

    void func_175787_b(ChunkCoordIntPair var0);

    boolean func_175788_a(ChunkCoordIntPair var0);

    void generateStructure(World var0, Random var1, StructureBoundingBox var2);

    StructureBoundingBox getBoundingBox();

    int getChunkPosX();

    int getChunkPosZ();

    LinkedList getComponents();

    boolean isSizeableStructure();

    void markAvailableHeight(World var0, Random var1, int var2);

    void readFromNBT(NBTTagCompound var0);

    void readStructureComponentsFromNBT(World var0, NBTTagCompound var1);

    void setRandomHeight(World var0, Random var1, int var2, int var3);

    void updateBoundingBox();

    NBTTagCompound writeStructureComponentsToNBT(int var0, int var1);

    void writeToNBT(NBTTagCompound var0);

}
