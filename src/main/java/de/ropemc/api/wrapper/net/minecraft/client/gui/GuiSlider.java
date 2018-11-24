package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiSlider")
public interface GuiSlider {

    float func_175217_d();

    void func_175218_a(float var0, boolean var1);

    void func_175219_a(float var0);

    float func_175220_c();

    String getDisplayString();

    int getHoverState(boolean var0);

    void mouseDragged(Minecraft var0, int var1, int var2);

    boolean mousePressed(Minecraft var0, int var1, int var2);

    void mouseReleased(int var0, int var1);

}
