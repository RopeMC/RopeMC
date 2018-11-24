package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAITarget")
public interface EntityAITarget {

    boolean canEasilyReach(EntityLivingBase var0);

    boolean continueExecuting();

    double getTargetDistance();

    boolean isSuitableTarget(EntityLiving var0, EntityLivingBase var1, boolean var2, boolean var3);

    boolean isSuitableTarget(EntityLivingBase var0, boolean var1);

    void resetTask();

    void startExecuting();

}
