package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.multiplayer.ServerData;
import de.ropemc.api.wrapper.net.minecraft.client.network.OldServerPinger;
import de.ropemc.api.wrapper.net.minecraft.client.multiplayer.ServerList;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiMultiplayer")
public interface GuiMultiplayer {

    void actionPerformed(GuiButton var0);

    void confirmClicked(boolean var0, int var1);

    void connectToSelected();

    void connectToServer(ServerData var0);

    void createButtons();

    void drawScreen(int var0, int var1, float var2);

    void func_175391_a(ServerListEntryNormal var0, int var1, boolean var2);

    boolean func_175392_a(ServerListEntryNormal var0, int var1);

    void func_175393_b(ServerListEntryNormal var0, int var1, boolean var2);

    boolean func_175394_b(ServerListEntryNormal var0, int var1);

    OldServerPinger getOldServerPinger();

    ServerList getServerList();

    void handleMouseInput();

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void mouseReleased(int var0, int var1, int var2);

    void onGuiClosed();

    void refreshServerList();

    void selectServer(int var0);

    void setHoveringText(String var0);

    void updateScreen();

}
