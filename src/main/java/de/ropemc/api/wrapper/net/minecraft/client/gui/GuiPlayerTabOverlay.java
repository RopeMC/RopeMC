package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.network.NetworkPlayerInfo;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.ScoreObjective;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.Scoreboard;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiPlayerTabOverlay")
public interface GuiPlayerTabOverlay {

    void drawPing(int var0, int var1, int var2, NetworkPlayerInfo var3);

    void drawScoreboardValues(ScoreObjective var0, int var1, String var2, int var3, int var4, NetworkPlayerInfo var5);

    void func_181030_a();

    String getPlayerName(NetworkPlayerInfo var0);

    void renderPlayerlist(int var0, Scoreboard var1, ScoreObjective var2);

    void setFooter(IChatComponent var0);

    void setHeader(IChatComponent var0);

    void updatePlayerList(boolean var0);

}
