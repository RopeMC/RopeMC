package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import java.awt.image.BufferedImage;
import de.ropemc.api.wrapper.net.minecraft.client.resources.data.AnimationMetadataSection;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.TextureAtlasSprite")
public interface TextureAtlasSprite {

    void allocateFrameTextureData(int var0);

    void clearFramesTextureData();

    void copyFrom(TextureAtlasSprite var0);

    void generateMipmaps(int var0);

    int getFrameCount();

    int[][] getFrameTextureData(int var0);

    int[][] getFrameTextureData(int[][] var0, int var1, int var2, int var3);

    int getIconHeight();

    String getIconName();

    int getIconWidth();

    float getInterpolatedU(double var0);

    float getInterpolatedV(double var0);

    float getMaxU();

    float getMaxV();

    float getMinU();

    float getMinV();

    int getOriginX();

    int getOriginY();

    boolean hasAnimationMetadata();

    void initSprite(int var0, int var1, int var2, int var3, boolean var4);

    void loadSprite(BufferedImage[] var0, AnimationMetadataSection var1);

    TextureAtlasSprite makeAtlasSprite(ResourceLocation var0);

    void resetSprite();

    void setFramesTextureData(List var0);

    void setIconHeight(int var0);

    void setIconWidth(int var0);

    void setLocationNameClock(String var0);

    void setLocationNameCompass(String var0);

    void updateAnimation();

    void updateAnimationInterpolated();

}
