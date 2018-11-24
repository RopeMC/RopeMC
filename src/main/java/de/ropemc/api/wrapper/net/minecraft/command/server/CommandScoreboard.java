package de.ropemc.api.wrapper.net.minecraft.command.server;

import de.ropemc.api.wrapper.net.minecraft.command.ICommandSender;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.ScoreObjective;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.Scoreboard;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.ScorePlayerTeam;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.server.CommandScoreboard")
public interface CommandScoreboard {

    void addObjective(ICommandSender var0, String[] var1, int var2);

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    void addTeam(ICommandSender var0, String[] var1, int var2);

    void emptyTeam(ICommandSender var0, String[] var1, int var2);

    List func_147184_a(boolean var0);

    void func_175778_p(ICommandSender var0, String[] var1, int var2);

    void func_175779_n(ICommandSender var0, String[] var1, int var2);

    boolean func_175780_b(ICommandSender var0, String[] var1);

    void func_175781_o(ICommandSender var0, String[] var1, int var2);

    List func_175782_e();

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    ScoreObjective getObjective(String var0, boolean var1);

    int getRequiredPermissionLevel();

    Scoreboard getScoreboard();

    ScorePlayerTeam getTeam(String var0);

    boolean isUsernameIndex(String[] var0, int var1);

    void joinTeam(ICommandSender var0, String[] var1, int var2);

    void leaveTeam(ICommandSender var0, String[] var1, int var2);

    void listObjectives(ICommandSender var0);

    void listPlayers(ICommandSender var0, String[] var1, int var2);

    void listTeams(ICommandSender var0, String[] var1, int var2);

    void processCommand(ICommandSender var0, String[] var1);

    void removeObjective(ICommandSender var0, String var1);

    void removeTeam(ICommandSender var0, String[] var1, int var2);

    void resetPlayers(ICommandSender var0, String[] var1, int var2);

    void setObjectiveDisplay(ICommandSender var0, String[] var1, int var2);

    void setPlayer(ICommandSender var0, String[] var1, int var2);

    void setTeamOption(ICommandSender var0, String[] var1, int var2);

}
