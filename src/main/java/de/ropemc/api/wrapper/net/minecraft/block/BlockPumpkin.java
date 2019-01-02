package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.pattern.BlockPattern;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockPumpkin")
public interface BlockPumpkin {

    boolean canDispenserPlace(World var0, BlockPos var1);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    BlockState createBlockState();

    BlockPattern getGolemBasePattern();

    BlockPattern getGolemPattern();

    int getMetaFromState(IBlockState var0);

    BlockPattern getSnowmanBasePattern();

    BlockPattern getSnowmanPattern();

    IBlockState getStateFromMeta(int var0);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void trySpawnGolem(World var0, BlockPos var1);

}