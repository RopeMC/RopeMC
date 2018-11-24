package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiErrorScreen")
public interface GuiErrorScreen {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void initGui();

    void keyTyped(char var0, int var1);

}
