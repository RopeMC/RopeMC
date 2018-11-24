package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.InventoryEffectRenderer")
public interface InventoryEffectRenderer {

    void drawActivePotionEffects();

    void drawScreen(int var0, int var1, float var2);

    void initGui();

    void updateActivePotionEffects();

}
