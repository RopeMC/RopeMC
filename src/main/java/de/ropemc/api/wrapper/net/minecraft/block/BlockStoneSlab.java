package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.block.material.MapColor;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.block.properties.IProperty;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockStoneSlab")
public interface BlockStoneSlab {

    BlockState createBlockState();

    int damageDropped(IBlockState var0);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    MapColor getMapColor(IBlockState var0);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void getSubBlocks(Item var0, CreativeTabs var1, List var2);

    String getUnlocalizedName(int var0);

    Object getVariant(ItemStack var0);

    IProperty getVariantProperty();

}
