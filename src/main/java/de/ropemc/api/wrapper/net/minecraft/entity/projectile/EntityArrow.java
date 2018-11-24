package de.ropemc.api.wrapper.net.minecraft.entity.projectile;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.projectile.EntityArrow")
public interface EntityArrow {

    boolean canAttackWithItem();

    boolean canTriggerWalking();

    void entityInit();

    double getDamage();

    float getEyeHeight();

    boolean getIsCritical();

    void onCollideWithPlayer(EntityPlayer var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setDamage(double var0);

    void setIsCritical(boolean var0);

    void setKnockbackStrength(int var0);

    void setPositionAndRotation2(double var0, double var1, double var2, float var3, float var4, int var5, boolean var6);

    void setThrowableHeading(double var0, double var1, double var2, float var3, float var4);

    void setVelocity(double var0, double var1, double var2);

    void writeEntityToNBT(NBTTagCompound var0);

}
