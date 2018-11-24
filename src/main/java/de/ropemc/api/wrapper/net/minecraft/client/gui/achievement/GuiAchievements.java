package de.ropemc.api.wrapper.net.minecraft.client.gui.achievement;

import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.achievement.GuiAchievements")
public interface GuiAchievements {

    void actionPerformed(GuiButton var0);

    boolean doesGuiPauseGame();

    void doneLoading();

    void drawAchievementScreen(int var0, int var1, float var2);

    void drawScreen(int var0, int var1, float var2);

    void drawTitle();

    TextureAtlasSprite func_175371_a(Block var0);

    void initGui();

    void keyTyped(char var0, int var1);

    void updateScreen();

}
