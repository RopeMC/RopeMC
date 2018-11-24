package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockSlime")
public interface BlockSlime {

    EnumWorldBlockLayer getBlockLayer();

    void onEntityCollidedWithBlock(World var0, BlockPos var1, Entity var2);

    void onFallenUpon(World var0, BlockPos var1, Entity var2, float var3);

    void onLanded(World var0, Entity var1);

}
