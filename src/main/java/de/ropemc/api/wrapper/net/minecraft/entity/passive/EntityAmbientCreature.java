package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityAmbientCreature")
public interface EntityAmbientCreature {

    boolean allowLeashing();

    boolean interact(EntityPlayer var0);

}
