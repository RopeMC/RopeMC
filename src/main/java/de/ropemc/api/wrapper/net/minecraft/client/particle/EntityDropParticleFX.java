package de.ropemc.api.wrapper.net.minecraft.client.particle;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.particle.EntityDropParticleFX")
public interface EntityDropParticleFX {

    float getBrightness(float var0);

    int getBrightnessForRender(float var0);

    void onUpdate();

}
