package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EnumCreatureType")
public interface EnumCreatureType {

    boolean getAnimal();

    Class getCreatureClass();

    int getMaxNumberOfCreature();

    boolean getPeacefulCreature();

}
