package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAITasks")
public interface EntityAITasks {

    void addTask(int var0, EntityAIBase var1);

    //boolean areTasksCompatible(EntityAITasks$EntityAITaskEntry var0, EntityAITasks$EntityAITaskEntry var1);

    //boolean canContinue(EntityAITasks$EntityAITaskEntry var0);

    //boolean canUse(EntityAITasks$EntityAITaskEntry var0);

    void onUpdateTasks();

    void removeTask(EntityAIBase var0);

}
