package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIOcelotAttack")
public interface EntityAIOcelotAttack {

    boolean continueExecuting();

    void resetTask();

    boolean shouldExecute();

    void updateTask();

}
