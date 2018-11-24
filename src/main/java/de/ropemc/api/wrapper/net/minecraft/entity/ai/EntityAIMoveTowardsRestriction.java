package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIMoveTowardsRestriction")
public interface EntityAIMoveTowardsRestriction {

    boolean continueExecuting();

    boolean shouldExecute();

    void startExecuting();

}
