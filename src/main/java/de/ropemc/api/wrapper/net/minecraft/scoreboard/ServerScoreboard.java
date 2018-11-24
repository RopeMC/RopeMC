package de.ropemc.api.wrapper.net.minecraft.scoreboard;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.scoreboard.ServerScoreboard")
public interface ServerScoreboard {

    boolean addPlayerToTeam(String var0, String var1);

    void broadcastTeamCreated(ScorePlayerTeam var0);

    void func_178820_a(String var0, ScoreObjective var1);

    void func_96513_c(ScorePlayerTeam var0);

    void func_96516_a(String var0);

    void func_96536_a(Score var0);

    void func_96547_a(ScoreboardSaveData var0);

    List func_96548_f(ScoreObjective var0);

    void func_96549_e(ScoreObjective var0);

    List func_96550_d(ScoreObjective var0);

    int func_96552_h(ScoreObjective var0);

    void getPlayerIterator(ScoreObjective var0);

    void markSaveDataDirty();

    void onObjectiveDisplayNameChanged(ScoreObjective var0);

    void onScoreObjectiveAdded(ScoreObjective var0);

    void onScoreObjectiveRemoved(ScoreObjective var0);

    void removePlayerFromTeam(String var0, ScorePlayerTeam var1);

    void sendTeamUpdate(ScorePlayerTeam var0);

    void setObjectiveInDisplaySlot(int var0, ScoreObjective var1);

}
