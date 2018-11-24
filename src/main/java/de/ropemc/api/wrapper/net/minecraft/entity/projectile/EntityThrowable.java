package de.ropemc.api.wrapper.net.minecraft.entity.projectile;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.projectile.EntityThrowable")
public interface EntityThrowable {

    void entityInit();

    float getGravityVelocity();

    float getInaccuracy();

    EntityLivingBase getThrower();

    float getVelocity();

    boolean isInRangeToRenderDist(double var0);

    void onImpact(MovingObjectPosition var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setThrowableHeading(double var0, double var1, double var2, float var3, float var4);

    void setVelocity(double var0, double var1, double var2);

    void writeEntityToNBT(NBTTagCompound var0);

}
