package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiPageButtonList")
public interface GuiPageButtonList {

    void func_178055_t();

    Gui func_178056_g();

    int func_178057_f();

    //Gui func_178058_a(GuiPageButtonList$GuiListEntry var0, int var1, boolean var2);

    int func_178059_e();

    void func_178060_e(int var0, int var1);

    Gui func_178061_c(int var0);

    void func_178062_a(char var0, int var1);

    //GuiLabel func_178063_a(int var0, int var1, GuiPageButtonList$GuiLabelEntry var2, boolean var3);

    void func_178064_i();

    //GuiListButton func_178065_a(int var0, int var1, GuiPageButtonList$GuiButtonEntry var2);

    void func_178066_a(Gui var0, boolean var1);

    //GuiSlider func_178067_a(int var0, int var1, GuiPageButtonList$GuiSlideEntry var2);

    //GuiTextField func_178068_a(int var0, int var1, GuiPageButtonList$EditBoxEntry var2);

    void func_178069_s();

    void func_178071_h();

    void func_181155_a(boolean var0);

    void func_181156_c(int var0);

    //GuiListExtended$IGuiListEntry getListEntry(int var0);

    int getListWidth();

    int getScrollBarX();

    int getSize();

    boolean mouseClicked(int var0, int var1, int var2);

}
