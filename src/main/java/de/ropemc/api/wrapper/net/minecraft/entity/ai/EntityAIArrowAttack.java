package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIArrowAttack")
public interface EntityAIArrowAttack {

    boolean continueExecuting();

    void resetTask();

    boolean shouldExecute();

    void updateTask();

}
