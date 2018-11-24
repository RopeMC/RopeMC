package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiCustomizeWorldScreen")
public interface GuiCustomizeWorldScreen {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void func_175319_a(int var0, String var1);

    void func_175321_a(int var0, boolean var1);

    void func_175322_b(int var0);

    String func_175323_a();

    void func_175324_a(String var0);

    void func_175325_f();

    void func_175326_g();

    void func_175327_a(float var0);

    void func_175328_i();

    void func_175329_a(boolean var0);

    String func_175330_b(int var0, float var1);

    void func_175331_h();

    void func_181031_a(boolean var0);

    String getText(int var0, String var1, float var2);

    void handleMouseInput();

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void mouseReleased(int var0, int var1, int var2);

    void onTick(int var0, float var1);

}
