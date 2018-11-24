package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.world.Explosion;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.block.material.MapColor;
import de.ropemc.api.wrapper.net.minecraft.block.material.Material;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.Block")
public interface Block {

    void addCollisionBoxesToList(World var0, BlockPos var1, IBlockState var2, AxisAlignedBB var3, List var4, Entity var5);

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canCollideCheck(IBlockState var0, boolean var1);

    boolean canDropFromExplosion(Explosion var0);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canPlaceBlockOnSide(World var0, BlockPos var1, EnumFacing var2);

    boolean canProvidePower();

    boolean canReplace(World var0, BlockPos var1, EnumFacing var2, ItemStack var3);

    boolean canSilkHarvest();

    MovingObjectPosition collisionRayTrace(World var0, BlockPos var1, Vec3 var2, Vec3 var3);

    int colorMultiplier(IBlockAccess var0, BlockPos var1);

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    BlockState createBlockState();

    ItemStack createStackedBlock(IBlockState var0);

    int damageDropped(IBlockState var0);

    Block disableStats();

    void dropBlockAsItem(World var0, BlockPos var1, IBlockState var2, int var3);

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    void dropXpOnBlockBreak(World var0, BlockPos var1, int var2);

    void fillWithRain(World var0, BlockPos var1);

    boolean func_181623_g();

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    float getAmbientOcclusionLightValue();

    double getBlockBoundsMaxX();

    double getBlockBoundsMaxY();

    double getBlockBoundsMaxZ();

    double getBlockBoundsMinX();

    double getBlockBoundsMinY();

    double getBlockBoundsMinZ();

    Block getBlockById(int var0);

    int getBlockColor();

    Block getBlockFromItem(Item var0);

    Block getBlockFromName(String var0);

    float getBlockHardness(World var0, BlockPos var1);

    EnumWorldBlockLayer getBlockLayer();

    BlockState getBlockState();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getComparatorInputOverride(World var0, BlockPos var1);

    CreativeTabs getCreativeTabToDisplayOn();

    int getDamageValue(World var0, BlockPos var1);

    IBlockState getDefaultState();

    boolean getEnableStats();

    float getExplosionResistance(Entity var0);

    int getIdFromBlock(Block var0);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getLightOpacity();

    int getLightValue();

    String getLocalizedName();

    MapColor getMapColor(IBlockState var0);

    Material getMaterial();

    int getMetaFromState(IBlockState var0);

    int getMixedBrightnessForBlock(IBlockAccess var0, BlockPos var1);

    int getMobilityFlag();

    //Block$EnumOffsetType getOffsetType();

    float getPlayerRelativeBlockHardness(EntityPlayer var0, World var1, BlockPos var2);

    int getRenderColor(IBlockState var0);

    int getRenderType();

    AxisAlignedBB getSelectedBoundingBox(World var0, BlockPos var1);

    IBlockState getStateById(int var0);

    IBlockState getStateForEntityRender(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    int getStateId(IBlockState var0);

    int getStrongPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    void getSubBlocks(Item var0, CreativeTabs var1, List var2);

    boolean getTickRandomly();

    String getUnlocalizedName();

    boolean getUseNeighborBrightness();

    int getWeakPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    void harvestBlock(World var0, EntityPlayer var1, BlockPos var2, IBlockState var3, TileEntity var4);

    boolean hasComparatorInputOverride();

    boolean hasTileEntity();

    boolean isAssociatedBlock(Block var0);

    boolean isBlockNormalCube();

    boolean isBlockSolid(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    boolean isCollidable();

    boolean isEqualTo(Block var0, Block var1);

    boolean isFlowerPot();

    boolean isFullBlock();

    boolean isFullCube();

    boolean isNormalCube();

    boolean isOpaqueCube();

    boolean isPassable(IBlockAccess var0, BlockPos var1);

    boolean isReplaceable(World var0, BlockPos var1);

    boolean isTranslucent();

    boolean isVecInsideXYBounds(Vec3 var0);

    boolean isVecInsideXZBounds(Vec3 var0);

    boolean isVecInsideYZBounds(Vec3 var0);

    boolean isVisuallyOpaque();

    Vec3 modifyAcceleration(World var0, BlockPos var1, Entity var2, Vec3 var3);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onBlockClicked(World var0, BlockPos var1, EntityPlayer var2);

    void onBlockDestroyedByExplosion(World var0, BlockPos var1, Explosion var2);

    void onBlockDestroyedByPlayer(World var0, BlockPos var1, IBlockState var2);

    boolean onBlockEventReceived(World var0, BlockPos var1, IBlockState var2, int var3, int var4);

    void onBlockHarvested(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onBlockPlacedBy(World var0, BlockPos var1, IBlockState var2, EntityLivingBase var3, ItemStack var4);

    void onEntityCollidedWithBlock(World var0, BlockPos var1, IBlockState var2, Entity var3);

    void onEntityCollidedWithBlock(World var0, BlockPos var1, Entity var2);

    void onFallenUpon(World var0, BlockPos var1, Entity var2, float var3);

    void onLanded(World var0, Entity var1);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    int quantityDropped(Random var0);

    int quantityDroppedWithBonus(int var0, Random var1);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void randomTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void registerBlock(int var0, String var1, Block var2);

    void registerBlock(int var0, ResourceLocation var1, Block var2);

    void registerBlocks();

    boolean requiresUpdates();

    void setBlockBounds(float var0, float var1, float var2, float var3, float var4, float var5);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsForItemRender();

    Block setBlockUnbreakable();

    Block setCreativeTab(CreativeTabs var0);

    void setDefaultState(IBlockState var0);

    Block setHardness(float var0);

    Block setLightLevel(float var0);

    Block setLightOpacity(int var0);

    Block setResistance(float var0);

    //Block setStepSound(Block$SoundType var0);

    Block setTickRandomly(boolean var0);

    Block setUnlocalizedName(String var0);

    boolean shouldSideBeRendered(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    void spawnAsEntity(World var0, BlockPos var1, ItemStack var2);

    int tickRate(World var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
