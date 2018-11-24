package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIFollowOwner")
public interface EntityAIFollowOwner {

    boolean continueExecuting();

    boolean func_181065_a(BlockPos var0);

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
