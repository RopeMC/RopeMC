package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import java.awt.image.BufferedImage;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.ImageBufferDownload")
public interface ImageBufferDownload {

    boolean hasTransparency(int var0, int var1, int var2, int var3);

    BufferedImage parseUserSkin(BufferedImage var0);

    void setAreaOpaque(int var0, int var1, int var2, int var3);

    void setAreaTransparent(int var0, int var1, int var2, int var3);

    void skinAvailable();

}
