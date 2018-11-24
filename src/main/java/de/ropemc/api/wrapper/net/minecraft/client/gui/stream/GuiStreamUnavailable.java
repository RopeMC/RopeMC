package de.ropemc.api.wrapper.net.minecraft.client.gui.stream;

import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiScreen;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.stream.GuiStreamUnavailable")
public interface GuiStreamUnavailable {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void func_152320_a(String var0);

    void func_152321_a(GuiScreen var0);

    void initGui();

    void onGuiClosed();

}
