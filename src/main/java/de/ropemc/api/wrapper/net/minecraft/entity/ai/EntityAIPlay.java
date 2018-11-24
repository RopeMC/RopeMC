package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIPlay")
public interface EntityAIPlay {

    boolean continueExecuting();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
