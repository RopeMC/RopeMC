package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.Explosion;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockTNT")
public interface BlockTNT {

    boolean canDropFromExplosion(Explosion var0);

    BlockState createBlockState();

    void explode(World var0, BlockPos var1, IBlockState var2, EntityLivingBase var3);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onBlockDestroyedByExplosion(World var0, BlockPos var1, Explosion var2);

    void onBlockDestroyedByPlayer(World var0, BlockPos var1, IBlockState var2);

    void onEntityCollidedWithBlock(World var0, BlockPos var1, IBlockState var2, Entity var3);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

}
