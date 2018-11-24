package de.ropemc.api.wrapper.net.minecraft.client.resources;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.util.List;
import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.IResourceManager")
public interface IResourceManager {

    List getAllResources(ResourceLocation var0);

    IResource getResource(ResourceLocation var0);

    Set getResourceDomains();

}
