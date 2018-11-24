package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIOwnerHurtByTarget")
public interface EntityAIOwnerHurtByTarget {

    boolean shouldExecute();

    void startExecuting();

}
