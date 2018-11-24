package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItemFrame;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRedstoneComparator")
public interface BlockRedstoneComparator {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    int calculateInputStrength(World var0, BlockPos var1, IBlockState var2);

    int calculateOutput(World var0, BlockPos var1, IBlockState var2);

    BlockState createBlockState();

    TileEntity createNewTileEntity(World var0, int var1);

    EntityItemFrame findItemFrame(World var0, EnumFacing var1, BlockPos var2);

    int getActiveSignal(IBlockAccess var0, BlockPos var1, IBlockState var2);

    int getDelay(IBlockState var0);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    String getLocalizedName();

    int getMetaFromState(IBlockState var0);

    IBlockState getPoweredState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    IBlockState getUnpoweredState(IBlockState var0);

    boolean isPowered(IBlockState var0);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    boolean onBlockEventReceived(World var0, BlockPos var1, IBlockState var2, int var3, int var4);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onStateChange(World var0, BlockPos var1, IBlockState var2);

    boolean shouldBePowered(World var0, BlockPos var1, IBlockState var2);

    void updateState(World var0, BlockPos var1, IBlockState var2);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
