package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityCreature")
public interface EntityCreature {

    void detachHome();

    void func_142017_o(float var0);

    float getBlockPathWeight(BlockPos var0);

    boolean getCanSpawnHere();

    BlockPos getHomePosition();

    float getMaximumHomeDistance();

    boolean hasHome();

    boolean hasPath();

    boolean isWithinHomeDistanceCurrentPosition();

    boolean isWithinHomeDistanceFromPosition(BlockPos var0);

    void setHomePosAndDistance(BlockPos var0, int var1);

    void updateLeashedState();

}
