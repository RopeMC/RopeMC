package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.block.material.MapColor;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockStainedGlass")
public interface BlockStainedGlass {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canSilkHarvest();

    BlockState createBlockState();

    int damageDropped(IBlockState var0);

    EnumWorldBlockLayer getBlockLayer();

    MapColor getMapColor(IBlockState var0);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void getSubBlocks(Item var0, CreativeTabs var1, List var2);

    boolean isFullCube();

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    int quantityDropped(Random var0);

}
