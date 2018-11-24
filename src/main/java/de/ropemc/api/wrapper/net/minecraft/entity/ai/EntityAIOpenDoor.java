package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIOpenDoor")
public interface EntityAIOpenDoor {

    boolean continueExecuting();

    void resetTask();

    void startExecuting();

    void updateTask();

}
