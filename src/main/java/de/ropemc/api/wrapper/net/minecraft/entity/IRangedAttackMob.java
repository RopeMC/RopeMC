package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.IRangedAttackMob")
public interface IRangedAttackMob {

    void attackEntityWithRangedAttack(EntityLivingBase var0, float var1);

}
