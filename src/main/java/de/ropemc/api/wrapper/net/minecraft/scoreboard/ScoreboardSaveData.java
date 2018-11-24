package de.ropemc.api.wrapper.net.minecraft.scoreboard;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagList;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.scoreboard.ScoreboardSaveData")
public interface ScoreboardSaveData {

    NBTTagList func_96496_a();

    void func_96497_d(NBTTagCompound var0);

    void func_96502_a(ScorePlayerTeam var0, NBTTagList var1);

    NBTTagList objectivesToNbt();

    void readDisplayConfig(NBTTagCompound var0);

    void readFromNBT(NBTTagCompound var0);

    void readObjectives(NBTTagList var0);

    void readScores(NBTTagList var0);

    void readTeams(NBTTagList var0);

    NBTTagList scoresToNbt();

    void setScoreboard(Scoreboard var0);

    void writeToNBT(NBTTagCompound var0);

}
