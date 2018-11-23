package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiIngame")
public interface GuiIngame {
    GuiNewChat getChatGUI();
}
