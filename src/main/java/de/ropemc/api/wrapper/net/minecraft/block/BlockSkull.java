package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntitySkull;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.block.state.pattern.BlockPattern;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockSkull")
public interface BlockSkull {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canDispenserPlace(World var0, BlockPos var1, ItemStack var2);

    void checkWitherSpawn(World var0, BlockPos var1, TileEntitySkull var2);

    BlockState createBlockState();

    TileEntity createNewTileEntity(World var0, int var1);

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getDamageValue(World var0, BlockPos var1);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    String getLocalizedName();

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    BlockPattern getWitherBasePattern();

    BlockPattern getWitherPattern();

    boolean isFullCube();

    boolean isOpaqueCube();

    void onBlockHarvested(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

}
