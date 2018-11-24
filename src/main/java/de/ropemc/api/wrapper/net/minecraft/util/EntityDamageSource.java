package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.EntityDamageSource")
public interface EntityDamageSource {

    IChatComponent getDeathMessage(EntityLivingBase var0);

    Entity getEntity();

    boolean getIsThornsDamage();

    boolean isDifficultyScaled();

    EntityDamageSource setIsThornsDamage();

}
