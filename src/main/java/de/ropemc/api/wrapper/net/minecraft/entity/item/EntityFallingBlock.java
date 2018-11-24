package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.crash.CrashReportCategory;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityFallingBlock")
public interface EntityFallingBlock {

    void addEntityCrashInfo(CrashReportCategory var0);

    boolean canBeCollidedWith();

    boolean canRenderOnFire();

    boolean canTriggerWalking();

    void entityInit();

    void fall(float var0, float var1);

    IBlockState getBlock();

    World getWorldObj();

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setHurtEntities(boolean var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
