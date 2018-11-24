package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityAgeable")
public interface EntityAgeable {

    void addGrowth(int var0);

    EntityAgeable createChild(EntityAgeable var0);

    void entityInit();

    void func_175501_a(int var0, boolean var1);

    int getGrowingAge();

    boolean interact(EntityPlayer var0);

    boolean isChild();

    void onGrowingAdult();

    void onLivingUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setGrowingAge(int var0);

    void setScale(float var0);

    void setScaleForAge(boolean var0);

    void setSize(float var0, float var1);

    void writeEntityToNBT(NBTTagCompound var0);

}
