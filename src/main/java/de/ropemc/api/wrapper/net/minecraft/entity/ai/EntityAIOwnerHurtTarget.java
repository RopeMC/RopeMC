package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIOwnerHurtTarget")
public interface EntityAIOwnerHurtTarget {

    boolean shouldExecute();

    void startExecuting();

}
