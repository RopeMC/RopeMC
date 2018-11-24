package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiYesNoCallback")
public interface GuiYesNoCallback {

    void confirmClicked(boolean var0, int var1);

}
