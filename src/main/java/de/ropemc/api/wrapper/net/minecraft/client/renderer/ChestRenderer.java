package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.ChestRenderer")
public interface ChestRenderer {

    void renderChestBrightness(Block var0, float var1);

}
