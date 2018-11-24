package de.ropemc.api.wrapper.net.minecraft.client.gui;

import java.util.List;
import java.text.DateFormat;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiSelectWorld")
public interface GuiSelectWorld {

    //List access$000(GuiSelectWorld var0);

    //int access$100(GuiSelectWorld var0);

    //int access$102(GuiSelectWorld var0, int var1);

    //GuiButton access$200(GuiSelectWorld var0);

    //GuiButton access$300(GuiSelectWorld var0);

    //GuiButton access$400(GuiSelectWorld var0);

    //GuiButton access$500(GuiSelectWorld var0);

    //String access$600(GuiSelectWorld var0);

    //DateFormat access$700(GuiSelectWorld var0);

    //String access$800(GuiSelectWorld var0);

    //String[] access$900(GuiSelectWorld var0);

    void actionPerformed(GuiButton var0);

    void confirmClicked(boolean var0, int var1);

    void drawScreen(int var0, int var1, float var2);

    String func_146614_d(int var0);

    void func_146615_e(int var0);

    void func_146618_g();

    String func_146621_a(int var0);

    void func_146627_h();

    GuiYesNo func_152129_a(GuiYesNoCallback var0, String var1, int var2);

    void handleMouseInput();

    void initGui();

}
