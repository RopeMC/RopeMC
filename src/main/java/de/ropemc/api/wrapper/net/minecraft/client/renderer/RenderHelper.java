package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import java.nio.FloatBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.RenderHelper")
public interface RenderHelper {

    void disableStandardItemLighting();

    void enableGUIStandardItemLighting();

    void enableStandardItemLighting();

    FloatBuffer setColorBuffer(double var0, double var1, double var2, double var3);

    FloatBuffer setColorBuffer(float var0, float var1, float var2, float var3);

}
