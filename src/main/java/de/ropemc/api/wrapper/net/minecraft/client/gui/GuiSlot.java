package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.Tessellator;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiSlot")
public interface GuiSlot {

    void actionPerformed(GuiButton var0);

    void bindAmountScrolled();

    void drawBackground();

    void drawListHeader(int var0, int var1, Tessellator var2);

    void drawScreen(int var0, int var1, float var2);

    void drawSelectionBox(int var0, int var1, int var2, int var3);

    void drawSlot(int var0, int var1, int var2, int var3, int var4, int var5);

    void elementClicked(int var0, boolean var1, int var2, int var3);

    void func_148132_a(int var0, int var1);

    int func_148135_f();

    void func_148142_b(int var0, int var1);

    void func_178040_a(int var0, int var1, int var2);

    int getAmountScrolled();

    int getContentHeight();

    boolean getEnabled();

    int getListWidth();

    int getScrollBarX();

    int getSize();

    int getSlotHeight();

    int getSlotIndexFromScreenCoords(int var0, int var1);

    void handleMouseInput();

    boolean isMouseYWithinSlotBounds(int var0);

    boolean isSelected(int var0);

    void overlayBackground(int var0, int var1, int var2, int var3);

    void registerScrollButtons(int var0, int var1);

    void scrollBy(int var0);

    void setDimensions(int var0, int var1, int var2, int var3);

    void setEnabled(boolean var0);

    void setHasListHeader(boolean var0, int var1);

    void setShowSelectionBox(boolean var0);

    void setSlotXBoundsFromLeft(int var0);

}
