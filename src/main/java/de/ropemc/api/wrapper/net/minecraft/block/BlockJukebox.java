package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockJukebox")
public interface BlockJukebox {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    BlockState createBlockState();

    TileEntity createNewTileEntity(World var0, int var1);

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    void dropRecord(World var0, BlockPos var1, IBlockState var2);

    int getComparatorInputOverride(World var0, BlockPos var1);

    int getMetaFromState(IBlockState var0);

    int getRenderType();

    IBlockState getStateFromMeta(int var0);

    boolean hasComparatorInputOverride();

    void insertRecord(World var0, BlockPos var1, IBlockState var2, ItemStack var3);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

}
