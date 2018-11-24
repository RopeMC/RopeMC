package de.ropemc.api.wrapper.net.minecraft.client.resources.data;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.data.TextureMetadataSection")
public interface TextureMetadataSection {

    List getListMipmaps();

    boolean getTextureBlur();

    boolean getTextureClamp();

}
