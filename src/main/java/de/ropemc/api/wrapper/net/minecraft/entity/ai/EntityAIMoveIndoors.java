package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIMoveIndoors")
public interface EntityAIMoveIndoors {

    boolean continueExecuting();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

}
