package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIWander")
public interface EntityAIWander {

    boolean continueExecuting();

    void makeUpdate();

    void setExecutionChance(int var0);

    boolean shouldExecute();

    void startExecuting();

}
