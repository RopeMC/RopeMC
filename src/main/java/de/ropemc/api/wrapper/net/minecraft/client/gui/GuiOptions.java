package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.world.EnumDifficulty;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiOptions")
public interface GuiOptions {

    void actionPerformed(GuiButton var0);

    void confirmClicked(boolean var0, int var1);

    void drawScreen(int var0, int var1, float var2);

    String func_175355_a(EnumDifficulty var0);

    void initGui();

}
