package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAILeapAtTarget")
public interface EntityAILeapAtTarget {

    boolean continueExecuting();

    boolean shouldExecute();

    void startExecuting();

}
