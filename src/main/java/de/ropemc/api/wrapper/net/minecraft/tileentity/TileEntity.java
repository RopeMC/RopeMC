package de.ropemc.api.wrapper.net.minecraft.tileentity;

import java.util.Map;
import de.ropemc.api.wrapper.net.minecraft.crash.CrashReportCategory;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntity")
public interface TileEntity {

    //Map access$000();

    void addInfoToCrashReport(CrashReportCategory var0);

    void addMapping(Class var0, String var1);

    TileEntity createAndLoadEntity(NBTTagCompound var0);

    boolean func_183000_F();

    int getBlockMetadata();

    Block getBlockType();

    Packet getDescriptionPacket();

    double getDistanceSq(double var0, double var1, double var2);

    double getMaxRenderDistanceSquared();

    BlockPos getPos();

    World getWorld();

    boolean hasWorldObj();

    void invalidate();

    boolean isInvalid();

    void markDirty();

    void readFromNBT(NBTTagCompound var0);

    boolean receiveClientEvent(int var0, int var1);

    void setPos(BlockPos var0);

    void setWorldObj(World var0);

    void updateContainingBlockInfo();

    void validate();

    void writeToNBT(NBTTagCompound var0);

}
