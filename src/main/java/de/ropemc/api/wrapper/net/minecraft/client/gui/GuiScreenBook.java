package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiScreenBook")
public interface GuiScreenBook {

    //ResourceLocation access$000();

    void actionPerformed(GuiButton var0);

    void addNewPage();

    void drawScreen(int var0, int var1, float var2);

    IChatComponent func_175385_b(int var0, int var1);

    boolean handleComponentClick(IChatComponent var0);

    void initGui();

    void keyTyped(char var0, int var1);

    void keyTypedInBook(char var0, int var1);

    void keyTypedInTitle(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void onGuiClosed();

    String pageGetCurrent();

    void pageInsertIntoCurrent(String var0);

    void pageSetCurrent(String var0);

    void sendBookToServer(boolean var0);

    void updateButtons();

    void updateScreen();

}
