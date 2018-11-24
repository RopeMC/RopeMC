package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiMainMenu")
public interface GuiMainMenu {

    void actionPerformed(GuiButton var0);

    void addDemoButtons(int var0, int var1);

    void addSingleplayerMultiplayerButtons(int var0, int var1);

    void confirmClicked(boolean var0, int var1);

    boolean doesGuiPauseGame();

    void drawPanorama(int var0, int var1, float var2);

    void drawScreen(int var0, int var1, float var2);

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void renderSkybox(int var0, int var1, float var2);

    void rotateAndBlurSkybox(float var0);

    void switchToRealms();

    void updateScreen();

}
