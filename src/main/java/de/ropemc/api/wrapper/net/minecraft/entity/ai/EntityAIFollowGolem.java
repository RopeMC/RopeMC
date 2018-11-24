package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIFollowGolem")
public interface EntityAIFollowGolem {

    boolean continueExecuting();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
