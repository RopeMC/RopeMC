package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiLockIconButton")
public interface GuiLockIconButton {

    void drawButton(Minecraft var0, int var1, int var2);

    void func_175229_b(boolean var0);

    boolean func_175230_c();

}
