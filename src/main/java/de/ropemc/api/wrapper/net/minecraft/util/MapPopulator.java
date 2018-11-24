package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.MapPopulator")
public interface MapPopulator {

    Map createMap(Iterable var0, Iterable var1);

    Map populateMap(Iterable var0, Iterable var1, Map var2);

}
