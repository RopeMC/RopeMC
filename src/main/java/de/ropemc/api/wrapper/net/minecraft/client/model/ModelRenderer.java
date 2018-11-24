package de.ropemc.api.wrapper.net.minecraft.client.model;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.model.ModelRenderer")
public interface ModelRenderer {

    ModelRenderer addBox(float var0, float var1, float var2, int var3, int var4, int var5);

    void addBox(float var0, float var1, float var2, int var3, int var4, int var5, float var6);

    ModelRenderer addBox(float var0, float var1, float var2, int var3, int var4, int var5, boolean var6);

    ModelRenderer addBox(String var0, float var1, float var2, float var3, int var4, int var5, int var6);

    void addChild(ModelRenderer var0);

    void compileDisplayList(float var0);

    void postRender(float var0);

    void render(float var0);

    void renderWithRotation(float var0);

    void setRotationPoint(float var0, float var1, float var2);

    ModelRenderer setTextureOffset(int var0, int var1);

    ModelRenderer setTextureSize(int var0, int var1);

}
