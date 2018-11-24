package de.ropemc.api.wrapper.net.minecraft.block.properties;

import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.properties.PropertyBool")
public interface PropertyBool {

    PropertyBool create(String var0);

    Collection getAllowedValues();

    String getName(Boolean var0);

    String getName(Comparable var0);

}
