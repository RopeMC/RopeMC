package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntityFlowerPot;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockFlowerPot")
public interface BlockFlowerPot {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canNotContain(Block var0, int var1);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    BlockState createBlockState();

    TileEntity createNewTileEntity(World var0, int var1);

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    EnumWorldBlockLayer getBlockLayer();

    int getDamageValue(World var0, BlockPos var1);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    String getLocalizedName();

    int getMetaFromState(IBlockState var0);

    int getRenderType();

    TileEntityFlowerPot getTileEntity(World var0, BlockPos var1);

    boolean isFlowerPot();

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockHarvested(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void setBlockBoundsForItemRender();

}
