package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.world.storage.ISaveFormat;
import de.ropemc.api.wrapper.net.minecraft.world.storage.WorldInfo;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiCreateWorld")
public interface GuiCreateWorld {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void func_146314_g();

    void func_146315_i();

    void func_146316_a(boolean var0);

    String func_146317_a(ISaveFormat var0, String var1);

    void func_146318_a(WorldInfo var0);

    void func_146319_h();

    boolean func_175299_g();

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void onGuiClosed();

    void updateScreen();

}
