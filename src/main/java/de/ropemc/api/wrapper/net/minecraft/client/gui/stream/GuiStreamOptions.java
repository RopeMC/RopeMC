package de.ropemc.api.wrapper.net.minecraft.client.gui.stream;

import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.stream.GuiStreamOptions")
public interface GuiStreamOptions {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void initGui();

}
