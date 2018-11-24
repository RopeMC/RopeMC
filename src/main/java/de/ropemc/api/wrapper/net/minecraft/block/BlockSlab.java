package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.block.properties.IProperty;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockSlab")
public interface BlockSlab {

    void addCollisionBoxesToList(World var0, BlockPos var1, IBlockState var2, AxisAlignedBB var3, List var4, Entity var5);

    boolean canSilkHarvest();

    int getDamageValue(World var0, BlockPos var1);

    String getUnlocalizedName(int var0);

    Object getVariant(ItemStack var0);

    IProperty getVariantProperty();

    boolean isDouble();

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isSlab(Block var0);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    int quantityDropped(Random var0);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsForItemRender();

    boolean shouldSideBeRendered(IBlockAccess var0, BlockPos var1, EnumFacing var2);

}
