package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockSourceImpl")
public interface BlockSourceImpl {

    int getBlockMetadata();

    BlockPos getBlockPos();

    TileEntity getBlockTileEntity();

    World getWorld();

    double getX();

    double getY();

    double getZ();

}
