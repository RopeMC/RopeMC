package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAISit")
public interface EntityAISit {

    void resetTask();

    void setSitting(boolean var0);

    boolean shouldExecute();

    void startExecuting();

}
