package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAISwimming")
public interface EntityAISwimming {

    boolean shouldExecute();

    void updateTask();

}
