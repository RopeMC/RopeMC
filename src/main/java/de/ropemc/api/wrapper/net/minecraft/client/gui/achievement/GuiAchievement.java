package de.ropemc.api.wrapper.net.minecraft.client.gui.achievement;

import de.ropemc.api.wrapper.net.minecraft.stats.Achievement;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.achievement.GuiAchievement")
public interface GuiAchievement {

    void clearAchievements();

    void displayAchievement(Achievement var0);

    void displayUnformattedAchievement(Achievement var0);

    void updateAchievementWindow();

    void updateAchievementWindowScale();

}
