package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRedstoneWire")
public interface BlockRedstoneWire {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    IBlockState calculateCurrentChanges(World var0, BlockPos var1, BlockPos var2, IBlockState var3);

    boolean canConnectTo(IBlockState var0, EnumFacing var1);

    boolean canConnectUpwardsTo(IBlockState var0);

    boolean canConnectUpwardsTo(IBlockAccess var0, BlockPos var1);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canProvidePower();

    int colorMultiplier(int var0);

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    BlockState createBlockState();

    boolean func_176339_d(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    //BlockRedstoneWire$EnumAttachPosition getAttachPosition(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMaxCurrentStrength(World var0, BlockPos var1, int var2);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    int getStrongPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    int getWeakPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    boolean isFullCube();

    boolean isOpaqueCube();

    void notifyWireNeighborsOfStateChange(World var0, BlockPos var1);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    IBlockState updateSurroundingRedstone(World var0, BlockPos var1, IBlockState var2);

}
