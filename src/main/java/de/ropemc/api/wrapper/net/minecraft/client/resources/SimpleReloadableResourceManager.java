package de.ropemc.api.wrapper.net.minecraft.client.resources;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.util.List;
import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.SimpleReloadableResourceManager")
public interface SimpleReloadableResourceManager {

    void clearResources();

    List getAllResources(ResourceLocation var0);

    IResource getResource(ResourceLocation var0);

    Set getResourceDomains();

    void notifyReloadListeners();

    void registerReloadListener(IResourceManagerReloadListener var0);

    void reloadResourcePack(IResourcePack var0);

    void reloadResources(List var0);

}
