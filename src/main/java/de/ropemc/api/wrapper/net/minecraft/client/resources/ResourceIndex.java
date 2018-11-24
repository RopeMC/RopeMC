package de.ropemc.api.wrapper.net.minecraft.client.resources;

import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.ResourceIndex")
public interface ResourceIndex {

    Map getResourceMap();

}
