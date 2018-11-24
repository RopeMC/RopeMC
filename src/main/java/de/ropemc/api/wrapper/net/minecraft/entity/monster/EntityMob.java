package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityMob")
public interface EntityMob {

    void applyEntityAttributes();

    boolean attackEntityAsMob(Entity var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canDropLoot();

    float getBlockPathWeight(BlockPos var0);

    boolean getCanSpawnHere();

    String getDeathSound();

    String getFallSoundString(int var0);

    String getHurtSound();

    String getSplashSound();

    String getSwimSound();

    boolean isValidLightLevel();

    void onLivingUpdate();

    void onUpdate();

}
