package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityFallingBlock;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockFalling")
public interface BlockFalling {

    boolean canFallInto(World var0, BlockPos var1);

    void checkFallable(World var0, BlockPos var1);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onEndFalling(World var0, BlockPos var1);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void onStartFalling(EntityFallingBlock var0);

    int tickRate(World var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
