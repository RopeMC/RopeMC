package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityTNTPrimed")
public interface EntityTNTPrimed {

    boolean canBeCollidedWith();

    boolean canTriggerWalking();

    void entityInit();

    void explode();

    float getEyeHeight();

    EntityLivingBase getTntPlacedBy();

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
