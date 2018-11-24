package de.ropemc.api.wrapper.net.minecraft.dispenser;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.dispenser.IBlockSource")
public interface IBlockSource {

    int getBlockMetadata();

    BlockPos getBlockPos();

    TileEntity getBlockTileEntity();

    double getX();

    double getY();

    double getZ();

}
