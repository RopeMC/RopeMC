package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityCreature;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIHurtByTarget")
public interface EntityAIHurtByTarget {

    void setEntityAttackTarget(EntityCreature var0, EntityLivingBase var1);

    boolean shouldExecute();

    void startExecuting();

}
