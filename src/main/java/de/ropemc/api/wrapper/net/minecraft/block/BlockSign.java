package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockSign")
public interface BlockSign {

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    TileEntity createNewTileEntity(World var0, int var1);

    boolean func_181623_g();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    AxisAlignedBB getSelectedBoundingBox(World var0, BlockPos var1);

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isPassable(IBlockAccess var0, BlockPos var1);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

}
