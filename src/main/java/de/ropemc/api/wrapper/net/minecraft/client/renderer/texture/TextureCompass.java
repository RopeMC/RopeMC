package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.TextureCompass")
public interface TextureCompass {

    void updateAnimation();

    void updateCompass(World var0, double var1, double var2, double var3, boolean var4, boolean var5);

}
