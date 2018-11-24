package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockCauldron")
public interface BlockCauldron {

    void addCollisionBoxesToList(World var0, BlockPos var1, IBlockState var2, AxisAlignedBB var3, List var4, Entity var5);

    BlockState createBlockState();

    void fillWithRain(World var0, BlockPos var1);

    int getComparatorInputOverride(World var0, BlockPos var1);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    boolean hasComparatorInputOverride();

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onEntityCollidedWithBlock(World var0, BlockPos var1, IBlockState var2, Entity var3);

    void setBlockBoundsForItemRender();

    void setWaterLevel(World var0, BlockPos var1, IBlockState var2, int var3);

}
