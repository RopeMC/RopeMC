package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.net.minecraft.client.audio.SoundHandler;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiButton")
public interface GuiButton {

    void drawButton(Minecraft var0, int var1, int var2);

    void drawButtonForegroundLayer(int var0, int var1);

    int getButtonWidth();

    int getHoverState(boolean var0);

    boolean isMouseOver();

    void mouseDragged(Minecraft var0, int var1, int var2);

    boolean mousePressed(Minecraft var0, int var1, int var2);

    void mouseReleased(int var0, int var1);

    void playPressSound(SoundHandler var0);

    void setWidth(int var0);

}
