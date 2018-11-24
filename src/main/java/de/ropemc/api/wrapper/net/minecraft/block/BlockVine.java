package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.block.properties.PropertyBool;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockVine")
public interface BlockVine {

    boolean canPlaceBlockOnSide(World var0, BlockPos var1, EnumFacing var2);

    boolean canPlaceOn(Block var0);

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    BlockState createBlockState();

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    int getBlockColor();

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    int getNumGrownFaces(IBlockState var0);

    PropertyBool getPropertyFor(EnumFacing var0);

    int getRenderColor(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void harvestBlock(World var0, EntityPlayer var1, BlockPos var2, IBlockState var3, TileEntity var4);

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isReplaceable(World var0, BlockPos var1);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    int quantityDropped(Random var0);

    boolean recheckGrownSides(World var0, BlockPos var1, IBlockState var2);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsForItemRender();

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
