package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityAnimal;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIMate")
public interface EntityAIMate {

    boolean continueExecuting();

    EntityAnimal getNearbyMate();

    void resetTask();

    boolean shouldExecute();

    void spawnBaby();

    void updateTask();

}
