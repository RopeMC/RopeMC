package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockBrewingStand")
public interface BlockBrewingStand {

    void addCollisionBoxesToList(World var0, BlockPos var1, IBlockState var2, AxisAlignedBB var3, List var4, Entity var5);

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    BlockState createBlockState();

    TileEntity createNewTileEntity(World var0, int var1);

    EnumWorldBlockLayer getBlockLayer();

    int getComparatorInputOverride(World var0, BlockPos var1);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    String getLocalizedName();

    int getMetaFromState(IBlockState var0);

    int getRenderType();

    IBlockState getStateFromMeta(int var0);

    boolean hasComparatorInputOverride();

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockPlacedBy(World var0, BlockPos var1, IBlockState var2, EntityLivingBase var3, ItemStack var4);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void setBlockBoundsForItemRender();

}
