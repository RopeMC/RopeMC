package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiSlotRealmsProxy")
public interface GuiSlotRealmsProxy {

    void drawBackground();

    void drawSlot(int var0, int var1, int var2, int var3, int var4, int var5);

    void elementClicked(int var0, boolean var1, int var2, int var3);

    int func_154337_m();

    int func_154338_k();

    int func_154339_l();

    int getContentHeight();

    int getScrollBarX();

    int getSize();

    void handleMouseInput();

    boolean isSelected(int var0);

}
