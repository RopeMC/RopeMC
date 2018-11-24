package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.client.gui.FontRenderer;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.culling.ICamera;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.Render")
public interface Render {

    boolean bindEntityTexture(Entity var0);

    void bindTexture(ResourceLocation var0);

    boolean canRenderName(Entity var0);

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRenderShadowAndFire(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void func_180549_a(Block var0, double var1, double var2, double var3, BlockPos var4, float var5, float var6, double var7, double var8, double var9);

    ResourceLocation getEntityTexture(Entity var0);

    FontRenderer getFontRendererFromRenderManager();

    RenderManager getRenderManager();

    World getWorldFromRenderManager();

    void renderEntityOnFire(Entity var0, double var1, double var2, double var3, float var4);

    void renderLivingLabel(Entity var0, String var1, double var2, double var3, double var4, int var5);

    void renderName(Entity var0, double var1, double var2, double var3);

    void renderOffsetAABB(AxisAlignedBB var0, double var1, double var2, double var3);

    void renderOffsetLivingLabel(Entity var0, double var1, double var2, double var3, String var4, float var5, double var6);

    void renderShadow(Entity var0, double var1, double var2, double var3, float var4, float var5);

    boolean shouldRender(Entity var0, ICamera var1, double var2, double var3, double var4);

}
