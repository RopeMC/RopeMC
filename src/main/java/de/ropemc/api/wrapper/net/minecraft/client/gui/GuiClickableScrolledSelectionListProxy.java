package de.ropemc.api.wrapper.net.minecraft.client.gui;

//import de.ropemc.api.wrapper.net.minecraft.realms.Tezzelator;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiClickableScrolledSelectionListProxy")
public interface GuiClickableScrolledSelectionListProxy {

    void drawBackground();

    void drawSelectionBox(int var0, int var1, int var2, int var3);

    void drawSlot(int var0, int var1, int var2, int var3, int var4, int var5);

    void elementClicked(int var0, boolean var1, int var2, int var3);

    int func_178042_f();

    //void func_178043_a(int var0, int var1, int var2, Tezzelator var3);

    int func_178044_e();

    int func_178045_g();

    int getContentHeight();

    int getScrollBarX();

    int getSize();

    void handleMouseInput();

    boolean isSelected(int var0);

}
