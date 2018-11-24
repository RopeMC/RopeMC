package de.ropemc.api.wrapper.net.minecraft.block.properties;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.properties.PropertyHelper")
public interface PropertyHelper {

    String getName();

    Class getValueClass();

}
