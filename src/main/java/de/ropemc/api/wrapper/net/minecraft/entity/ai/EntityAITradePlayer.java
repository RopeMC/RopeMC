package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAITradePlayer")
public interface EntityAITradePlayer {

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

}
