package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockContainer")
public interface BlockContainer {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean func_181086_a(World var0, BlockPos var1, EnumFacing var2);

    boolean func_181087_e(World var0, BlockPos var1);

    int getRenderType();

    boolean onBlockEventReceived(World var0, BlockPos var1, IBlockState var2, int var3, int var4);

}
