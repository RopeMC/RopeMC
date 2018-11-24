package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EnumPlayerModelParts;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiCustomizeSkin")
public interface GuiCustomizeSkin {

    //String access$200(GuiCustomizeSkin var0, EnumPlayerModelParts var1);

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    String func_175358_a(EnumPlayerModelParts var0);

    void initGui();

}
