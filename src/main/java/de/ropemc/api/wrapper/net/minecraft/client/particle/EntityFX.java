package de.ropemc.api.wrapper.net.minecraft.client.particle;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.WorldRenderer;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.particle.EntityFX")
public interface EntityFX {

    boolean canAttackWithItem();

    boolean canTriggerWalking();

    void entityInit();

    float getAlpha();

    float getBlueColorF();

    int getFXLayer();

    float getGreenColorF();

    float getRedColorF();

    EntityFX multipleParticleScaleBy(float var0);

    EntityFX multiplyVelocity(float var0);

    void nextTextureIndexX();

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void renderParticle(WorldRenderer var0, Entity var1, float var2, float var3, float var4, float var5, float var6, float var7);

    void setAlphaF(float var0);

    void setParticleIcon(TextureAtlasSprite var0);

    void setParticleTextureIndex(int var0);

    void setRBGColorF(float var0, float var1, float var2);

    void writeEntityToNBT(NBTTagCompound var0);

}
