package de.ropemc.api.wrapper.net.minecraft.potion;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.potion.PotionEffect")
public interface PotionEffect {

    void combine(PotionEffect var0);

    int deincrementDuration();

    int getAmplifier();

    int getDuration();

    String getEffectName();

    boolean getIsAmbient();

    boolean getIsPotionDurationMax();

    boolean getIsShowParticles();

    int getPotionID();

    boolean onUpdate(EntityLivingBase var0);

    void performEffect(EntityLivingBase var0);

    PotionEffect readCustomPotionEffectFromNBT(NBTTagCompound var0);

    void setPotionDurationMax(boolean var0);

    void setSplashPotion(boolean var0);

    NBTTagCompound writeCustomPotionEffectToNBT(NBTTagCompound var0);

}
