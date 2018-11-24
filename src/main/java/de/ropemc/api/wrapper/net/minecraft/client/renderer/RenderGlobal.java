package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.Iterator;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import java.util.Collection;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk.RenderChunk;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
//import org.lwjgl.util.vector.Vector3f;
import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.culling.ICamera;
import de.ropemc.api.wrapper.net.minecraft.client.multiplayer.WorldClient;
import de.ropemc.api.wrapper.net.minecraft.client.particle.EntityFX;
import de.ropemc.api.wrapper.net.minecraft.util.EnumParticleTypes;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.RenderGlobal")
public interface RenderGlobal {

    void broadcastSound(int var0, BlockPos var1, int var2);

    void cleanupDamagedBlocks(Iterator var0);

    void createBindEntityOutlineFbs(int var0, int var1);

    void deleteAllDisplayLists();

    void drawBlockDamageTexture(Tessellator var0, WorldRenderer var1, Entity var2, float var3);

    void drawOutlinedBoundingBox(AxisAlignedBB var0, int var1, int var2, int var3, int var4);

    void drawSelectionBox(EntityPlayer var0, MovingObjectPosition var1, int var2, float var3);

    void fixTerrainFrustum(double var0, double var1, double var2);

    void func_181023_a(Collection var0, Collection var1);

    void func_181561_a(AxisAlignedBB var0);

    void generateSky();

    void generateSky2();

    void generateStars();

    String getDebugInfoEntities();

    String getDebugInfoRenders();

    RenderChunk getRenderChunkOffset(BlockPos var0, RenderChunk var1, EnumFacing var2);

    //Vector3f getViewVector(Entity var0, double var1);

    Set getVisibleFacings(BlockPos var0);

    boolean hasCloudFog(double var0, double var1, double var2, float var3);

    boolean isPositionInRenderChunk(BlockPos var0, RenderChunk var1);

    boolean isRenderEntityOutlines();

    void loadRenderers();

    void makeEntityOutlineShader();

    void markBlockForUpdate(BlockPos var0);

    void markBlockRangeForRenderUpdate(int var0, int var1, int var2, int var3, int var4, int var5);

    void markBlocksForUpdate(int var0, int var1, int var2, int var3, int var4, int var5);

    void notifyLightSet(BlockPos var0);

    void onEntityAdded(Entity var0);

    void onEntityRemoved(Entity var0);

    void onResourceManagerReload(IResourceManager var0);

    void playAuxSFX(EntityPlayer var0, int var1, BlockPos var2, int var3);

    void playRecord(String var0, BlockPos var1);

    void playSound(String var0, double var1, double var2, double var3, float var4, float var5);

    void playSoundToNearExcept(EntityPlayer var0, String var1, double var2, double var3, double var4, float var5, float var6);

    void postRenderDamagedBlocks();

    void preRenderDamagedBlocks();

    void renderBlockLayer(EnumWorldBlockLayer var0);

    int renderBlockLayer(EnumWorldBlockLayer var0, double var1, int var2, Entity var3);

    void renderClouds(float var0, int var1);

    void renderCloudsFancy(float var0, int var1);

    void renderEntities(Entity var0, ICamera var1, float var2);

    void renderEntityOutlineFramebuffer();

    void renderSky(float var0, int var1);

    void renderSky(WorldRenderer var0, float var1, boolean var2);

    void renderSkyEnd();

    void renderStars(WorldRenderer var0);

    void renderWorldBorder(Entity var0, float var1);

    void sendBlockBreakProgress(int var0, BlockPos var1, int var2);

    void setDisplayListEntitiesDirty();

    void setWorldAndLoadRenderers(WorldClient var0);

    void setupTerrain(Entity var0, double var1, ICamera var2, int var3, boolean var4);

    EntityFX spawnEntityFX(int var0, boolean var1, double var2, double var3, double var4, double var5, double var6, double var7, int[] var8);

    void spawnParticle(int var0, boolean var1, double var2, double var3, double var4, double var5, double var6, double var7, int[] var8);

    void spawnParticle(EnumParticleTypes var0, double var1, double var2, double var3, double var4, double var5, double var6, int[] var7);

    void stopChunkUpdates();

    void updateChunks(long var0);

    void updateClouds();

    void updateDestroyBlockIcons();

}
