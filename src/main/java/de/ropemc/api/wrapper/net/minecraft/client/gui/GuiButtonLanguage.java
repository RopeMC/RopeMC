package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiButtonLanguage")
public interface GuiButtonLanguage {

    void drawButton(Minecraft var0, int var1, int var2);

}
