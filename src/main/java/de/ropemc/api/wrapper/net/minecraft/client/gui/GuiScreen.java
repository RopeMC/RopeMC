package de.ropemc.api.wrapper.net.minecraft.client.gui;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import java.net.URI;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiScreen")
public interface GuiScreen {

    void actionPerformed(GuiButton var0);

    void confirmClicked(boolean var0, int var1);

    boolean doesGuiPauseGame();

    void drawBackground(int var0);

    void drawCreativeTabHoveringText(String var0, int var1, int var2);

    void drawDefaultBackground();

    void drawHoveringText(List var0, int var1, int var2);

    void drawScreen(int var0, int var1, float var2);

    void drawWorldBackground(int var0);

    String getClipboardString();

    boolean handleComponentClick(IChatComponent var0);

    void handleComponentHover(IChatComponent var0, int var1, int var2);

    void handleInput();

    void handleKeyboardInput();

    void handleMouseInput();

    void initGui();

    boolean isAltKeyDown();

    boolean isCtrlKeyDown();

    boolean isKeyComboCtrlA(int var0);

    boolean isKeyComboCtrlC(int var0);

    boolean isKeyComboCtrlV(int var0);

    boolean isKeyComboCtrlX(int var0);

    boolean isShiftKeyDown();

    void keyTyped(char var0, int var1);

    void mouseClickMove(int var0, int var1, int var2, long var3);

    void mouseClicked(int var0, int var1, int var2);

    void mouseReleased(int var0, int var1, int var2);

    void onGuiClosed();

    void onResize(Minecraft var0, int var1, int var2);

    void openWebLink(URI var0);

    void renderToolTip(ItemStack var0, int var1, int var2);

    void sendChatMessage(String var0);

    void sendChatMessage(String var0, boolean var1);

    void setClipboardString(String var0);

    void setText(String var0, boolean var1);

    void setWorldAndResolution(Minecraft var0, int var1, int var2);

    void updateScreen();

}
