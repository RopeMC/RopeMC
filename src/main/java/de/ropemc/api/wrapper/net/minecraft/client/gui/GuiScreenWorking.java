package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiScreenWorking")
public interface GuiScreenWorking {

    void displayLoadingString(String var0);

    void displaySavingString(String var0);

    void drawScreen(int var0, int var1, float var2);

    void resetProgressAndMessage(String var0);

    void setDoneWorking();

    void setLoadingProgress(int var0);

}
