package de.ropemc.api.wrapper.net.minecraft.entity.projectile;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.projectile.EntityFireball")
public interface EntityFireball {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    void entityInit();

    float getBrightness(float var0);

    int getBrightnessForRender(float var0);

    float getCollisionBorderSize();

    float getMotionFactor();

    boolean isInRangeToRenderDist(double var0);

    void onImpact(MovingObjectPosition var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
