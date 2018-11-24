package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAILookIdle")
public interface EntityAILookIdle {

    boolean continueExecuting();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
