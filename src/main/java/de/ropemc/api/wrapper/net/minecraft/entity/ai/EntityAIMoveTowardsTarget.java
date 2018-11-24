package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIMoveTowardsTarget")
public interface EntityAIMoveTowardsTarget {

    boolean continueExecuting();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

}
