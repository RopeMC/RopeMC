package de.ropemc.api.wrapper.net.minecraft.pathfinding;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.pathfinding.PathNavigateClimber")
public interface PathNavigateClimber {

    PathEntity getPathToEntityLiving(Entity var0);

    PathEntity getPathToPos(BlockPos var0);

    void onUpdateNavigation();

    boolean tryMoveToEntityLiving(Entity var0, double var1);

}
