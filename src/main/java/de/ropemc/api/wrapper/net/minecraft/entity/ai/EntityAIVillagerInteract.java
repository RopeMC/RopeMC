package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIVillagerInteract")
public interface EntityAIVillagerInteract {

    void startExecuting();

    void updateTask();

}
