package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAITempt")
public interface EntityAITempt {

    boolean continueExecuting();

    boolean isRunning();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
