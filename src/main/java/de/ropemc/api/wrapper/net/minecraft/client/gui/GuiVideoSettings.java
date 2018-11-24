package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiVideoSettings")
public interface GuiVideoSettings {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void handleMouseInput();

    void initGui();

    void mouseClicked(int var0, int var1, int var2);

    void mouseReleased(int var0, int var1, int var2);

}
