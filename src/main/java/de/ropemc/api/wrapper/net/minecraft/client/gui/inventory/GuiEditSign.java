package de.ropemc.api.wrapper.net.minecraft.client.gui.inventory;

import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.inventory.GuiEditSign")
public interface GuiEditSign {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void initGui();

    void keyTyped(char var0, int var1);

    void onGuiClosed();

    void updateScreen();

}
