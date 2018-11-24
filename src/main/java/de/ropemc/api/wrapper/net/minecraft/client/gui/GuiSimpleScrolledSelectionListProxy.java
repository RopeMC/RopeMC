package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiSimpleScrolledSelectionListProxy")
public interface GuiSimpleScrolledSelectionListProxy {

    void drawBackground();

    void drawScreen(int var0, int var1, float var2);

    void drawSlot(int var0, int var1, int var2, int var3, int var4, int var5);

    void elementClicked(int var0, boolean var1, int var2, int var3);

    int getContentHeight();

    int getMouseX();

    int getMouseY();

    int getScrollBarX();

    int getSize();

    int getWidth();

    void handleMouseInput();

    boolean isSelected(int var0);

}
