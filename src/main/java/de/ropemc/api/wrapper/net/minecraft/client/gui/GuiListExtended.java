package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiListExtended")
public interface GuiListExtended {

    void drawBackground();

    void drawSlot(int var0, int var1, int var2, int var3, int var4, int var5);

    void elementClicked(int var0, boolean var1, int var2, int var3);

    void func_178040_a(int var0, int var1, int var2);

    //GuiListExtended$IGuiListEntry getListEntry(int var0);

    boolean isSelected(int var0);

    boolean mouseClicked(int var0, int var1, int var2);

    boolean mouseReleased(int var0, int var1, int var2);

}
