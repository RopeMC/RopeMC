package de.ropemc.api.wrapper.net.minecraft.entity.effect;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.effect.EntityLightningBolt")
public interface EntityLightningBolt {

    void entityInit();

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
