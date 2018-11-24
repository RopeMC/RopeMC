package de.ropemc.api.wrapper.net.minecraft.client.resources;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.io.InputStream;
import java.awt.image.BufferedImage;
import de.ropemc.api.wrapper.net.minecraft.client.resources.data.IMetadataSerializer;
import de.ropemc.api.wrapper.net.minecraft.client.resources.data.IMetadataSection;
import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.DefaultResourcePack")
public interface DefaultResourcePack {

    InputStream getInputStream(ResourceLocation var0);

    InputStream getInputStreamAssets(ResourceLocation var0);

    BufferedImage getPackImage();

    IMetadataSection getPackMetadata(IMetadataSerializer var0, String var1);

    String getPackName();

    Set getResourceDomains();

    InputStream getResourceStream(ResourceLocation var0);

    boolean resourceExists(ResourceLocation var0);

}
