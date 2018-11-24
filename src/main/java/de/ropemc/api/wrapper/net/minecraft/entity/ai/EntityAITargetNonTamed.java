package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAITargetNonTamed")
public interface EntityAITargetNonTamed {

    boolean shouldExecute();

}
