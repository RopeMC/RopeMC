package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.settings.GameSettings;
import de.ropemc.api.wrapper.net.minecraft.client.audio.SoundCategory;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiScreenOptionsSounds")
public interface GuiScreenOptionsSounds {

    //GameSettings access$000(GuiScreenOptionsSounds var0);

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    String getSoundVolume(SoundCategory var0);

    void initGui();

}
