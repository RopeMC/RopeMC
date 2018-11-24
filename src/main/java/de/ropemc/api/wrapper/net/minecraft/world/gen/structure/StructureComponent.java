package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.StructureComponent")
public interface StructureComponent {

    boolean addComponentParts(World var0, Random var1, StructureBoundingBox var2);

    void buildComponent(StructureComponent var0, List var1, Random var2);

    void clearCurrentPositionBlocksUpwards(World var0, int var1, int var2, int var3, StructureBoundingBox var4);

    NBTTagCompound createStructureBaseNBT();

    void fillWithAir(World var0, StructureBoundingBox var1, int var2, int var3, int var4, int var5, int var6, int var7);

    void fillWithBlocks(World var0, StructureBoundingBox var1, int var2, int var3, int var4, int var5, int var6, int var7, IBlockState var8, IBlockState var9, boolean var10);

    //void fillWithRandomizedBlocks(World var0, StructureBoundingBox var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Random var9, StructureComponent$BlockSelector var10);

    StructureComponent findIntersecting(List var0, StructureBoundingBox var1);

    void func_175805_a(World var0, StructureBoundingBox var1, Random var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, IBlockState var10, IBlockState var11, boolean var12);

    void func_181138_a(int var0, int var1, int var2);

    boolean generateChestContents(World var0, StructureBoundingBox var1, Random var2, int var3, int var4, int var5, List var6, int var7);

    boolean generateDispenserContents(World var0, StructureBoundingBox var1, Random var2, int var3, int var4, int var5, int var6, List var7, int var8);

    IBlockState getBlockStateFromPos(World var0, int var1, int var2, int var3, StructureBoundingBox var4);

    StructureBoundingBox getBoundingBox();

    BlockPos getBoundingBoxCenter();

    int getComponentType();

    int getMetadataWithOffset(Block var0, int var1);

    int getXWithOffset(int var0, int var1);

    int getYWithOffset(int var0);

    int getZWithOffset(int var0, int var1);

    boolean isLiquidInStructureBoundingBox(World var0, StructureBoundingBox var1);

    void placeDoorCurrentPosition(World var0, StructureBoundingBox var1, Random var2, int var3, int var4, int var5, EnumFacing var6);

    void randomlyPlaceBlock(World var0, StructureBoundingBox var1, Random var2, float var3, int var4, int var5, int var6, IBlockState var7);

    void randomlyRareFillWithBlocks(World var0, StructureBoundingBox var1, int var2, int var3, int var4, int var5, int var6, int var7, IBlockState var8, boolean var9);

    void readStructureBaseNBT(World var0, NBTTagCompound var1);

    void readStructureFromNBT(NBTTagCompound var0);

    void replaceAirAndLiquidDownwards(World var0, IBlockState var1, int var2, int var3, int var4, StructureBoundingBox var5);

    void setBlockState(World var0, IBlockState var1, int var2, int var3, int var4, StructureBoundingBox var5);

    void writeStructureToNBT(NBTTagCompound var0);

}
