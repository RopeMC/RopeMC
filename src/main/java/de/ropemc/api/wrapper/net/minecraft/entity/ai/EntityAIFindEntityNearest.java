package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIFindEntityNearest")
public interface EntityAIFindEntityNearest {

    //EntityLiving access$000(EntityAIFindEntityNearest var0);

    boolean continueExecuting();

    double func_179438_f();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

}
