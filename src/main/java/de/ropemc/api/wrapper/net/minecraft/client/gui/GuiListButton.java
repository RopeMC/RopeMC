package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiListButton")
public interface GuiListButton {

    String buildDisplayString();

    void func_175212_b(boolean var0);

    boolean mousePressed(Minecraft var0, int var1, int var2);

}
