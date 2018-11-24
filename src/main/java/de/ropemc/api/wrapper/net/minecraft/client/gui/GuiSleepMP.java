package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiSleepMP")
public interface GuiSleepMP {

    void actionPerformed(GuiButton var0);

    void initGui();

    void keyTyped(char var0, int var1);

    void wakeFromSleep();

}
