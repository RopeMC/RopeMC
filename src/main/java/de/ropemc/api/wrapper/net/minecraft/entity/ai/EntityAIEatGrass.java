package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIEatGrass")
public interface EntityAIEatGrass {

    boolean continueExecuting();

    int getEatingGrassTimer();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
