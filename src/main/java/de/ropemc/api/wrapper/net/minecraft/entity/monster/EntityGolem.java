package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityGolem")
public interface EntityGolem {

    boolean canDespawn();

    void fall(float var0, float var1);

    String getDeathSound();

    String getHurtSound();

    String getLivingSound();

    int getTalkInterval();

}
