package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiEnchantment")
public interface GuiEnchantment {

    void drawGuiContainerBackgroundLayer(float var0, int var1, int var2);

    void drawGuiContainerForegroundLayer(int var0, int var1);

    void drawScreen(int var0, int var1, float var2);

    void func_147068_g();

    void mouseClicked(int var0, int var1, int var2);

    void updateScreen();

}
