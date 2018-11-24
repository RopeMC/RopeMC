package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIMoveToBlock")
public interface EntityAIMoveToBlock {

    boolean continueExecuting();

    boolean getIsAboveDestination();

    void resetTask();

    boolean searchForDestination();

    boolean shouldExecute();

    boolean shouldMoveTo(World var0, BlockPos var1);

    void startExecuting();

    void updateTask();

}
