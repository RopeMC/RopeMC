package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIFleeSun")
public interface EntityAIFleeSun {

    boolean continueExecuting();

    Vec3 findPossibleShelter();

    boolean shouldExecute();

    void startExecuting();

}
