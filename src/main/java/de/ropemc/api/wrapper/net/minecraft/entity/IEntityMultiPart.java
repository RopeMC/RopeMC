package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.boss.EntityDragonPart;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.IEntityMultiPart")
public interface IEntityMultiPart {

    boolean attackEntityFromPart(EntityDragonPart var0, DamageSource var1, float var2);

    World getWorld();

}
