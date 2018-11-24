package de.ropemc.api.wrapper.net.minecraft.client.resources;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.IReloadableResourceManager")
public interface IReloadableResourceManager {

    void registerReloadListener(IResourceManagerReloadListener var0);

    void reloadResources(List var0);

}
