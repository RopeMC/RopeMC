package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.dispenser.IBehaviorDispenseItem;
import de.ropemc.api.wrapper.net.minecraft.dispenser.IBlockSource;
import de.ropemc.api.wrapper.net.minecraft.dispenser.IPosition;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockDispenser")
public interface BlockDispenser {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    BlockState createBlockState();

    TileEntity createNewTileEntity(World var0, int var1);

    void dispense(World var0, BlockPos var1);

    IBehaviorDispenseItem getBehavior(ItemStack var0);

    int getComparatorInputOverride(World var0, BlockPos var1);

    IPosition getDispensePosition(IBlockSource var0);

    EnumFacing getFacing(int var0);

    int getMetaFromState(IBlockState var0);

    int getRenderType();

    IBlockState getStateForEntityRender(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    boolean hasComparatorInputOverride();

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onBlockPlacedBy(World var0, BlockPos var1, IBlockState var2, EntityLivingBase var3, ItemStack var4);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void setDefaultDirection(World var0, BlockPos var1, IBlockState var2);

    int tickRate(World var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
