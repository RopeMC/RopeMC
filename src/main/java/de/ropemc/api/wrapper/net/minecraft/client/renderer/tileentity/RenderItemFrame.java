package de.ropemc.api.wrapper.net.minecraft.client.renderer.tileentity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItemFrame;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.tileentity.RenderItemFrame")
public interface RenderItemFrame {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityItemFrame var0, double var1, double var2, double var3, float var4, float var5);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityItemFrame var0);

    void renderItem(EntityItemFrame var0);

    void renderName(Entity var0, double var1, double var2, double var3);

    void renderName(EntityItemFrame var0, double var1, double var2, double var3);

}
