package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAICreeperSwell")
public interface EntityAICreeperSwell {

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
