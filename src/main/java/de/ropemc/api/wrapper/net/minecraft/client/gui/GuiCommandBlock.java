package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiCommandBlock")
public interface GuiCommandBlock {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void func_175388_a();

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void onGuiClosed();

    void updateScreen();

}
