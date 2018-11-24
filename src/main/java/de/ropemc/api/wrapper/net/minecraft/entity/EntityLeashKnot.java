package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityLeashKnot")
public interface EntityLeashKnot {

    EntityLeashKnot createKnot(World var0, BlockPos var1);

    void entityInit();

    float getEyeHeight();

    int getHeightPixels();

    EntityLeashKnot getKnotForPosition(World var0, BlockPos var1);

    int getWidthPixels();

    boolean interactFirst(EntityPlayer var0);

    boolean isInRangeToRenderDist(double var0);

    void onBroken(Entity var0);

    boolean onValidSurface();

    void readEntityFromNBT(NBTTagCompound var0);

    void updateFacingWithBoundingBox(EnumFacing var0);

    void writeEntityToNBT(NBTTagCompound var0);

    boolean writeToNBTOptional(NBTTagCompound var0);

}
