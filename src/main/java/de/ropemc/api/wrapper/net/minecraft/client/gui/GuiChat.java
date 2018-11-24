package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiChat")
public interface GuiChat {

    void autocompletePlayerNames();

    boolean doesGuiPauseGame();

    void drawScreen(int var0, int var1, float var2);

    void getSentHistory(int var0);

    void handleMouseInput();

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void onAutocompleteResponse(String[] var0);

    void onGuiClosed();

    void sendAutocompleteRequest(String var0, String var1);

    void setText(String var0, boolean var1);

    void updateScreen();

}
