package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.block.material.MapColor;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.world.Explosion;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockStairs")
public interface BlockStairs {

    void addCollisionBoxesToList(World var0, BlockPos var1, IBlockState var2, AxisAlignedBB var3, List var4, Entity var5);

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canCollideCheck(IBlockState var0, boolean var1);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    MovingObjectPosition collisionRayTrace(World var0, BlockPos var1, Vec3 var2, Vec3 var3);

    BlockState createBlockState();

    boolean func_176304_i(IBlockAccess var0, BlockPos var1);

    int func_176305_g(IBlockAccess var0, BlockPos var1);

    boolean func_176306_h(IBlockAccess var0, BlockPos var1);

    int func_176307_f(IBlockAccess var0, BlockPos var1);

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    EnumWorldBlockLayer getBlockLayer();

    float getExplosionResistance(Entity var0);

    MapColor getMapColor(IBlockState var0);

    int getMetaFromState(IBlockState var0);

    int getMixedBrightnessForBlock(IBlockAccess var0, BlockPos var1);

    AxisAlignedBB getSelectedBoundingBox(World var0, BlockPos var1);

    IBlockState getStateFromMeta(int var0);

    boolean isBlockStairs(Block var0);

    boolean isCollidable();

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isSameStair(IBlockAccess var0, BlockPos var1, IBlockState var2);

    Vec3 modifyAcceleration(World var0, BlockPos var1, Entity var2, Vec3 var3);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onBlockClicked(World var0, BlockPos var1, EntityPlayer var2);

    void onBlockDestroyedByExplosion(World var0, BlockPos var1, Explosion var2);

    void onBlockDestroyedByPlayer(World var0, BlockPos var1, IBlockState var2);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onEntityCollidedWithBlock(World var0, BlockPos var1, Entity var2);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void setBaseCollisionBounds(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    int tickRate(World var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
