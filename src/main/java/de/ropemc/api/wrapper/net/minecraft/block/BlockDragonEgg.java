package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockDragonEgg")
public interface BlockDragonEgg {

    void checkFall(World var0, BlockPos var1);

    Item getItem(World var0, BlockPos var1);

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onBlockClicked(World var0, BlockPos var1, EntityPlayer var2);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    boolean shouldSideBeRendered(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    void teleport(World var0, BlockPos var1);

    int tickRate(World var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
