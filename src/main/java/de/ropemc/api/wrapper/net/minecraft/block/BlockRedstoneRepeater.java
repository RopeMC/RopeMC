package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRedstoneRepeater")
public interface BlockRedstoneRepeater {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canPowerSide(Block var0);

    BlockState createBlockState();

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    int getDelay(IBlockState var0);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    String getLocalizedName();

    int getMetaFromState(IBlockState var0);

    IBlockState getPoweredState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    IBlockState getUnpoweredState(IBlockState var0);

    boolean isLocked(IBlockAccess var0, BlockPos var1, IBlockState var2);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
