package de.ropemc.api.wrapper.net.minecraft.client.resources;

import java.io.InputStream;
import de.ropemc.api.wrapper.net.minecraft.client.resources.data.IMetadataSection;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.SimpleResource")
public interface SimpleResource {

    InputStream getInputStream();

    IMetadataSection getMetadata(String var0);

    ResourceLocation getResourceLocation();

    String getResourcePackName();

    boolean hasMetadata();

}
