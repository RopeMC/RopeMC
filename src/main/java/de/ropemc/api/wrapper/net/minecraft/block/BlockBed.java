package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockBed")
public interface BlockBed {

    BlockState createBlockState();

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    EnumWorldBlockLayer getBlockLayer();

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    int getMobilityFlag();

    EntityPlayer getPlayerInBed(World var0, BlockPos var1);

    BlockPos getSafeExitLocation(World var0, BlockPos var1, int var2);

    IBlockState getStateFromMeta(int var0);

    boolean hasRoomForPlayer(World var0, BlockPos var1);

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockHarvested(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void setBedBounds();

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

}
