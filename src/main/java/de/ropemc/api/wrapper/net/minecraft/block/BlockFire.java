package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.block.material.MapColor;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockFire")
public interface BlockFire {

    boolean canCatchFire(IBlockAccess var0, BlockPos var1);

    boolean canDie(World var0, BlockPos var1);

    boolean canNeighborCatchFire(World var0, BlockPos var1);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    void catchOnFire(World var0, BlockPos var1, int var2, Random var3, int var4);

    BlockState createBlockState();

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getEncouragement(Block var0);

    int getFlammability(Block var0);

    MapColor getMapColor(IBlockState var0);

    int getMetaFromState(IBlockState var0);

    int getNeighborEncouragement(World var0, BlockPos var1);

    IBlockState getStateFromMeta(int var0);

    void init();

    boolean isCollidable();

    boolean isFullCube();

    boolean isOpaqueCube();

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    int quantityDropped(Random var0);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    boolean requiresUpdates();

    void setFireInfo(Block var0, int var1, int var2);

    int tickRate(World var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
