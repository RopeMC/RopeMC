package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockStandingSign")
public interface BlockStandingSign {

    BlockState createBlockState();

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

}
