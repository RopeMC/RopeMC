package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIBase")
public interface EntityAIBase {

    boolean continueExecuting();

    int getMutexBits();

    boolean isInterruptible();

    void resetTask();

    void setMutexBits(int var0);

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
