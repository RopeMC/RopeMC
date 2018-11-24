package de.ropemc.api.wrapper.net.minecraft.entity.boss;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.boss.EntityDragonPart")
public interface EntityDragonPart {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    void entityInit();

    boolean isEntityEqual(Entity var0);

    void readEntityFromNBT(NBTTagCompound var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
