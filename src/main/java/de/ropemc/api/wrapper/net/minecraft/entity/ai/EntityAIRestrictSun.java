package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIRestrictSun")
public interface EntityAIRestrictSun {

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

}
