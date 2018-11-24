package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.Gui")
public interface Gui {

    void drawCenteredString(FontRenderer var0, String var1, int var2, int var3, int var4);

    void drawGradientRect(int var0, int var1, int var2, int var3, int var4, int var5);

    void drawHorizontalLine(int var0, int var1, int var2, int var3);

    void drawModalRectWithCustomSizedTexture(int var0, int var1, float var2, float var3, int var4, int var5, float var6, float var7);

    void drawRect(int var0, int var1, int var2, int var3, int var4);

    void drawScaledCustomSizeModalRect(int var0, int var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9);

    void drawString(FontRenderer var0, String var1, int var2, int var3, int var4);

    void drawTexturedModalRect(float var0, float var1, int var2, int var3, int var4, int var5);

    void drawTexturedModalRect(int var0, int var1, int var2, int var3, int var4, int var5);

    void drawTexturedModalRect(int var0, int var1, TextureAtlasSprite var2, int var3, int var4);

    void drawVerticalLine(int var0, int var1, int var2, int var3);

}
