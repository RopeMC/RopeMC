package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.BlockDoor;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIDoorInteract")
public interface EntityAIDoorInteract {

    boolean continueExecuting();

    BlockDoor getBlockDoor(BlockPos var0);

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
