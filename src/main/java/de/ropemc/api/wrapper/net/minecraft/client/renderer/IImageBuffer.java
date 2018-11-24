package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import java.awt.image.BufferedImage;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.IImageBuffer")
public interface IImageBuffer {

    BufferedImage parseUserSkin(BufferedImage var0);

    void skinAvailable();

}
