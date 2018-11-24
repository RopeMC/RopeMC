package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIAttackOnCollide")
public interface EntityAIAttackOnCollide {

    boolean continueExecuting();

    double func_179512_a(EntityLivingBase var0);

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
