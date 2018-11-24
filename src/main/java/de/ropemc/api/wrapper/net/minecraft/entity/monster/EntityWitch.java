package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityWitch")
public interface EntityWitch {

    void applyEntityAttributes();

    float applyPotionDamageCalculations(DamageSource var0, float var1);

    void attackEntityWithRangedAttack(EntityLivingBase var0, float var1);

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    boolean getAggressive();

    String getDeathSound();

    float getEyeHeight();

    String getHurtSound();

    String getLivingSound();

    void handleStatusUpdate(byte var0);

    void onLivingUpdate();

    void setAggressive(boolean var0);

}
