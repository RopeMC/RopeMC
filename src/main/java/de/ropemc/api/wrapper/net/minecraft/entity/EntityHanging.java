package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityHanging")
public interface EntityHanging {

    void addVelocity(double var0, double var1, double var2);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    void entityInit();

    double func_174858_a(int var0);

    BlockPos getHangingPosition();

    int getHeightPixels();

    EnumFacing getHorizontalFacing();

    int getWidthPixels();

    boolean hitByEntity(Entity var0);

    void moveEntity(double var0, double var1, double var2);

    void onBroken(Entity var0);

    void onUpdate();

    boolean onValidSurface();

    void readEntityFromNBT(NBTTagCompound var0);

    void setPosition(double var0, double var1, double var2);

    boolean shouldSetPosAfterLoading();

    void updateBoundingBox();

    void updateFacingWithBoundingBox(EnumFacing var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
