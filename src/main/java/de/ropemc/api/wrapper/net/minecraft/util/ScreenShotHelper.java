package de.ropemc.api.wrapper.net.minecraft.util;

import java.io.File;
import de.ropemc.api.wrapper.net.minecraft.client.shader.Framebuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ScreenShotHelper")
public interface ScreenShotHelper {

    File getTimestampedPNGFileForDirectory(File var0);

    IChatComponent saveScreenshot(File var0, int var1, int var2, Framebuffer var3);

    IChatComponent saveScreenshot(File var0, String var1, int var2, int var3, Framebuffer var4);

}
