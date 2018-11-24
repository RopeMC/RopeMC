package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer")
public interface EntityAIFindEntityNearestPlayer {

    //EntityLiving access$000(EntityAIFindEntityNearestPlayer var0);

    boolean continueExecuting();

    double func_179431_f();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

}
