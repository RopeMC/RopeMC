package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityEnderCrystal")
public interface EntityEnderCrystal {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    boolean canTriggerWalking();

    void entityInit();

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
