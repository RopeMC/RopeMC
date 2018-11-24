package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockTripWire")
public interface BlockTripWire {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    BlockState createBlockState();

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    boolean isConnectedTo(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    boolean isFullCube();

    boolean isOpaqueCube();

    void notifyHook(World var0, BlockPos var1, IBlockState var2);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onBlockHarvested(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3);

    void onEntityCollidedWithBlock(World var0, BlockPos var1, IBlockState var2, Entity var3);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void randomTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void updateState(World var0, BlockPos var1);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
