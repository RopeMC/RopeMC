package de.ropemc.api.wrapper.net.minecraft.client.gui;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiScreenCustomizePresets")
public interface GuiScreenCustomizePresets {

    //List access$000();

    //GuiScreenCustomizePresets$ListPreset access$100(GuiScreenCustomizePresets var0);

    //GuiTextField access$200(GuiScreenCustomizePresets var0);

    //void access$300(GuiScreenCustomizePresets var0, int var1, int var2, int var3, int var4);

    //void access$400(GuiScreenCustomizePresets var0, int var1, int var2, int var3, int var4);

    //void access$500(GuiScreenCustomizePresets var0, int var1, int var2, int var3, int var4);

    //void access$600(GuiScreenCustomizePresets var0, int var1, int var2, int var3, int var4);

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void func_175304_a();

    boolean func_175305_g();

    void handleMouseInput();

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void onGuiClosed();

    void updateScreen();

}
