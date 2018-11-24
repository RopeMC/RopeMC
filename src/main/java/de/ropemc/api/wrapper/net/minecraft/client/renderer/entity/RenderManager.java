package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.client.gui.FontRenderer;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.client.settings.GameSettings;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.culling.ICamera;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderManager")
public interface RenderManager {

    void cacheActiveRenderInfo(World var0, FontRenderer var1, Entity var2, Entity var3, GameSettings var4, float var5);

    boolean doRenderEntity(Entity var0, double var1, double var2, double var3, float var4, float var5, boolean var6);

    double getDistanceToCamera(double var0, double var1, double var2);

    Render getEntityClassRenderObject(Class var0);

    Render getEntityRenderObject(Entity var0);

    FontRenderer getFontRenderer();

    boolean isDebugBoundingBox();

    boolean isRenderShadow();

    void renderDebugBoundingBox(Entity var0, double var1, double var2, double var3, float var4, float var5);

    boolean renderEntitySimple(Entity var0, float var1);

    boolean renderEntityStatic(Entity var0, float var1, boolean var2);

    boolean renderEntityWithPosYaw(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void renderWitherSkull(Entity var0, float var1);

    void set(World var0);

    void setDebugBoundingBox(boolean var0);

    void setPlayerViewY(float var0);

    void setRenderOutlines(boolean var0);

    void setRenderPosition(double var0, double var1, double var2);

    void setRenderShadow(boolean var0);

    boolean shouldRender(Entity var0, ICamera var1, double var2, double var3, double var4);

}
