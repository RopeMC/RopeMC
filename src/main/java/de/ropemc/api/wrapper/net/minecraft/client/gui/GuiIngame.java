package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.ScoreObjective;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiIngame")
public interface GuiIngame {

    void displayTitle(String var0, String var1, int var2, int var3, int var4);

    void func_175177_a();

    void func_180474_b(float var0, ScaledResolution var1);

    void func_181029_i();

    void func_181551_a(ScaledResolution var0);

    GuiNewChat getChatGUI();

    FontRenderer getFontRenderer();

    GuiSpectator getSpectatorGui();

    GuiPlayerTabOverlay getTabList();

    int getUpdateCounter();

    void renderBossHealth();

    void renderDemo(ScaledResolution var0);

    void renderExpBar(ScaledResolution var0, int var1);

    void renderGameOverlay(float var0);

    void renderHorseJumpBar(ScaledResolution var0, int var1);

    void renderHotbarItem(int var0, int var1, int var2, float var3, EntityPlayer var4);

    void renderPlayerStats(ScaledResolution var0);

    void renderPumpkinOverlay(ScaledResolution var0);

    void renderScoreboard(ScoreObjective var0, ScaledResolution var1);

    void renderStreamIndicator(ScaledResolution var0);

    void renderTooltip(ScaledResolution var0, float var1);

    void renderVignette(float var0, ScaledResolution var1);

    void setRecordPlaying(String var0, boolean var1);

    void setRecordPlaying(IChatComponent var0, boolean var1);

    void setRecordPlayingMessage(String var0);

    boolean showCrosshair();

    void updateTick();

}
