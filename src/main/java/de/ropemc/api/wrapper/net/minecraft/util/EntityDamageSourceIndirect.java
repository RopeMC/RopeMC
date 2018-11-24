package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.EntityDamageSourceIndirect")
public interface EntityDamageSourceIndirect {

    IChatComponent getDeathMessage(EntityLivingBase var0);

    Entity getEntity();

    Entity getSourceOfDamage();

}
