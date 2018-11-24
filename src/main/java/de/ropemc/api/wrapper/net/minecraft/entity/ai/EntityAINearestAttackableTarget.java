package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAINearestAttackableTarget")
public interface EntityAINearestAttackableTarget {

    boolean shouldExecute();

    void startExecuting();

}
