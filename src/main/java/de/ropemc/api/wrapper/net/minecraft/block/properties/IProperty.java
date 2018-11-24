package de.ropemc.api.wrapper.net.minecraft.block.properties;

import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.properties.IProperty")
public interface IProperty {

    Collection getAllowedValues();

    String getName();

    String getName(Comparable var0);

    Class getValueClass();

}
