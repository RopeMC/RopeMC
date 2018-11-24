package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIControlledByPlayer")
public interface EntityAIControlledByPlayer {

    void boostSpeed();

    boolean isControlledByPlayer();

    boolean isSpeedBoosted();

    boolean isStairOrSlab(Block var0);

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
