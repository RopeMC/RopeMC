package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.properties.IProperty;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRailPowered")
public interface BlockRailPowered {

    BlockState createBlockState();

    boolean func_176566_a(World var0, BlockPos var1, IBlockState var2, boolean var3, int var4);

    //boolean func_176567_a(World var0, BlockPos var1, boolean var2, int var3, BlockRailBase$EnumRailDirection var4);

    int getMetaFromState(IBlockState var0);

    IProperty getShapeProperty();

    IBlockState getStateFromMeta(int var0);

    void onNeighborChangedInternal(World var0, BlockPos var1, IBlockState var2, Block var3);

}
