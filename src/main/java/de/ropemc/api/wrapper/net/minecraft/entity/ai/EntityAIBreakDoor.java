package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIBreakDoor")
public interface EntityAIBreakDoor {

    boolean continueExecuting();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
