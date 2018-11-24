package de.ropemc.api.wrapper.net.minecraft.client.resources;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.FoliageColorReloadListener")
public interface FoliageColorReloadListener {

    void onResourceManagerReload(IResourceManager var0);

}
