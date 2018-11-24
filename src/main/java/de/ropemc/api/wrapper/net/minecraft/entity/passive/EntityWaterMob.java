package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityWaterMob")
public interface EntityWaterMob {

    boolean canBreatheUnderwater();

    boolean canDespawn();

    boolean getCanSpawnHere();

    int getExperiencePoints(EntityPlayer var0);

    int getTalkInterval();

    boolean isNotColliding();

    boolean isPushedByWater();

    void onEntityUpdate();

}
