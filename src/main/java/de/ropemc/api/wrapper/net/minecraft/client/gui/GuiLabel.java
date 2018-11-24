package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiLabel")
public interface GuiLabel {

    void drawLabel(Minecraft var0, int var1, int var2);

    void drawLabelBackground(Minecraft var0, int var1, int var2);

    void func_175202_a(String var0);

    GuiLabel setCentered();

}
