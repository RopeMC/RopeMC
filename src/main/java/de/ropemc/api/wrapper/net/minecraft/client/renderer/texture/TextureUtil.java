package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import java.io.InputStream;
import java.awt.image.BufferedImage;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.TextureUtil")
public interface TextureUtil {

    void allocateTexture(int var0, int var1, int var2);

    void allocateTextureImpl(int var0, int var1, int var2, int var3);

    int anaglyphColor(int var0);

    void bindTexture(int var0);

    int blendColorComponent(int var0, int var1, int var2, int var3, int var4);

    int blendColors(int var0, int var1, int var2, int var3, boolean var4);

    void copyToBuffer(int[] var0, int var1);

    void copyToBufferPos(int[] var0, int var1, int var2);

    void deleteTexture(int var0);

    int[][] generateMipmapData(int var0, int var1, int[][] var2);

    int glGenTextures();

    void processPixelValues(int[] var0, int var1, int var2);

    BufferedImage readBufferedImage(InputStream var0);

    int[] readImageData(IResourceManager var0, ResourceLocation var1);

    void setTextureBlurMipmap(boolean var0, boolean var1);

    void setTextureBlurred(boolean var0);

    void setTextureClamped(boolean var0);

    int[] updateAnaglyph(int[] var0);

    void uploadTexture(int var0, int[] var1, int var2, int var3);

    int uploadTextureImage(int var0, BufferedImage var1);

    int uploadTextureImageAllocate(int var0, BufferedImage var1, boolean var2, boolean var3);

    int uploadTextureImageSub(int var0, BufferedImage var1, int var2, int var3, boolean var4, boolean var5);

    void uploadTextureImageSubImpl(BufferedImage var0, int var1, int var2, boolean var3, boolean var4);

    void uploadTextureMipmap(int[][] var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6);

    void uploadTextureSub(int var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, boolean var8);

}
