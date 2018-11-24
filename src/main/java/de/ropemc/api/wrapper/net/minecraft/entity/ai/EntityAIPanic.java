package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIPanic")
public interface EntityAIPanic {

    boolean continueExecuting();

    boolean shouldExecute();

    void startExecuting();

}
