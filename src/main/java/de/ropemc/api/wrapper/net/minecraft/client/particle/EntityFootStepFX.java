package de.ropemc.api.wrapper.net.minecraft.client.particle;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.WorldRenderer;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.particle.EntityFootStepFX")
public interface EntityFootStepFX {

    int getFXLayer();

    void onUpdate();

    void renderParticle(WorldRenderer var0, Entity var1, float var2, float var3, float var4, float var5, float var6, float var7);

}
