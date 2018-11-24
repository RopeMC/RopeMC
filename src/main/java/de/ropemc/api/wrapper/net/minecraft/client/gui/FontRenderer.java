package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.FontRenderer")
public interface FontRenderer {

    String bidiReorder(String var0);

    void drawSplitString(String var0, int var1, int var2, int var3, int var4);

    int drawString(String var0, int var1, int var2, int var3);

    int drawStringWithShadow(String var0, float var1, float var2, int var3);

    float func_181559_a(char var0, boolean var1);

    boolean getBidiFlag();

    int getCharWidth(char var0);

    int getColorCode(char var0);

    String getFormatFromString(String var0);

    int getStringWidth(String var0);

    boolean getUnicodeFlag();

    ResourceLocation getUnicodePageLocation(int var0);

    boolean isFormatColor(char var0);

    boolean isFormatSpecial(char var0);

    List listFormattedStringToWidth(String var0, int var1);

    void loadGlyphTexture(int var0);

    void onResourceManagerReload(IResourceManager var0);

    void readFontTexture();

    void readGlyphSizes();

    float renderDefaultChar(int var0, boolean var1);

    void renderSplitString(String var0, int var1, int var2, int var3, boolean var4);

    int renderString(String var0, float var1, float var2, int var3, boolean var4);

    int renderStringAligned(String var0, int var1, int var2, int var3, int var4, boolean var5);

    void renderStringAtPos(String var0, boolean var1);

    float renderUnicodeChar(char var0, boolean var1);

    void resetStyles();

    void setBidiFlag(boolean var0);

    void setUnicodeFlag(boolean var0);

    int sizeStringToWidth(String var0, int var1);

    int splitStringWidth(String var0, int var1);

    String trimStringNewline(String var0);

    String trimStringToWidth(String var0, int var1);

    String trimStringToWidth(String var0, int var1, boolean var2);

    String wrapFormattedStringToWidth(String var0, int var1);

}
