package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAILookAtVillager")
public interface EntityAILookAtVillager {

    boolean continueExecuting();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
