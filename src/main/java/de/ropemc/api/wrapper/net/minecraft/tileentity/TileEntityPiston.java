package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityPiston")
public interface TileEntityPiston {

    void clearPistonTileEntity();

    int getBlockMetadata();

    EnumFacing getFacing();

    float getOffsetX(float var0);

    float getOffsetY(float var0);

    float getOffsetZ(float var0);

    IBlockState getPistonState();

    float getProgress(float var0);

    boolean isExtending();

    void launchWithSlimeBlock(float var0, float var1);

    void readFromNBT(NBTTagCompound var0);

    boolean shouldPistonHeadBeRendered();

    void update();

    void writeToNBT(NBTTagCompound var0);

}
