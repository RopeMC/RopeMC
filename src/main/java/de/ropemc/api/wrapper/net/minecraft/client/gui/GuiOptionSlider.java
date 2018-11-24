package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiOptionSlider")
public interface GuiOptionSlider {

    int getHoverState(boolean var0);

    void mouseDragged(Minecraft var0, int var1, int var2);

    boolean mousePressed(Minecraft var0, int var1, int var2);

    void mouseReleased(int var0, int var1);

}
