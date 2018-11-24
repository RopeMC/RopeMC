package de.ropemc.api.wrapper.net.minecraft.entity.projectile;

import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.projectile.EntityPotion")
public interface EntityPotion {

    float getGravityVelocity();

    float getInaccuracy();

    int getPotionDamage();

    float getVelocity();

    void onImpact(MovingObjectPosition var0);

    void readEntityFromNBT(NBTTagCompound var0);

    void setPotionDamage(int var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
