package de.ropemc.api.wrapper.net.minecraft.entity.projectile;

import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.projectile.EntityLargeFireball")
public interface EntityLargeFireball {

    void onImpact(MovingObjectPosition var0);

    void readEntityFromNBT(NBTTagCompound var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
