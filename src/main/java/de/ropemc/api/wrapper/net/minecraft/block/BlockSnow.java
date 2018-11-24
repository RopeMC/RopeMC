package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockSnow")
public interface BlockSnow {

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean checkAndDropBlock(World var0, BlockPos var1, IBlockState var2);

    BlockState createBlockState();

    void getBoundsForLayers(int var0);

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void harvestBlock(World var0, EntityPlayer var1, BlockPos var2, IBlockState var3, TileEntity var4);

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isPassable(IBlockAccess var0, BlockPos var1);

    boolean isReplaceable(World var0, BlockPos var1);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    int quantityDropped(Random var0);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsForItemRender();

    boolean shouldSideBeRendered(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
