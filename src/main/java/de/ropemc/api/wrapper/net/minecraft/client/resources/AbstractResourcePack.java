package de.ropemc.api.wrapper.net.minecraft.client.resources;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.io.InputStream;
import java.awt.image.BufferedImage;
import de.ropemc.api.wrapper.net.minecraft.client.resources.data.IMetadataSerializer;
import de.ropemc.api.wrapper.net.minecraft.client.resources.data.IMetadataSection;
import java.io.File;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.AbstractResourcePack")
public interface AbstractResourcePack {

    InputStream getInputStream(ResourceLocation var0);

    InputStream getInputStreamByName(String var0);

    BufferedImage getPackImage();

    IMetadataSection getPackMetadata(IMetadataSerializer var0, String var1);

    String getPackName();

    String getRelativeName(File var0, File var1);

    boolean hasResourceName(String var0);

    String locationToName(ResourceLocation var0);

    void logNameNotLowercase(String var0);

    IMetadataSection readMetadata(IMetadataSerializer var0, InputStream var1, String var2);

    boolean resourceExists(ResourceLocation var0);

}
