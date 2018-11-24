package de.ropemc.api.wrapper.net.minecraft.block.properties;

import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.properties.PropertyInteger")
public interface PropertyInteger {

    PropertyInteger create(String var0, int var1, int var2);

    Collection getAllowedValues();

    String getName(Comparable var0);

    String getName(Integer var0);

}
