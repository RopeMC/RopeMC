package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockWall")
public interface BlockWall {

    boolean canConnectTo(IBlockAccess var0, BlockPos var1);

    BlockState createBlockState();

    int damageDropped(IBlockState var0);

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    String getLocalizedName();

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void getSubBlocks(Item var0, CreativeTabs var1, List var2);

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isPassable(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    boolean shouldSideBeRendered(IBlockAccess var0, BlockPos var1, EnumFacing var2);

}
