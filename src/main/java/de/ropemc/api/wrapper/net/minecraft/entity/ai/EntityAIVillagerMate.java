package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIVillagerMate")
public interface EntityAIVillagerMate {

    boolean checkSufficientDoorsPresentForNewVillager();

    boolean continueExecuting();

    void giveBirth();

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
