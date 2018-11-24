package de.ropemc.api.wrapper.net.minecraft.stats;

import de.ropemc.api.wrapper.net.minecraft.util.IJsonSerializable;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.stats.StatFileWriter")
public interface StatFileWriter {

    boolean canUnlockAchievement(Achievement var0);

    IJsonSerializable func_150870_b(StatBase var0);

    IJsonSerializable func_150872_a(StatBase var0, IJsonSerializable var1);

    int func_150874_c(Achievement var0);

    boolean hasAchievementUnlocked(Achievement var0);

    void increaseStat(EntityPlayer var0, StatBase var1, int var2);

    int readStat(StatBase var0);

    void unlockAchievement(EntityPlayer var0, StatBase var1, int var2);

}
