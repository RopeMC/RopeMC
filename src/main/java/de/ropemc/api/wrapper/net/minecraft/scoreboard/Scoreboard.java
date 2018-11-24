package de.ropemc.api.wrapper.net.minecraft.scoreboard;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import java.util.Collection;
import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.scoreboard.Scoreboard")
public interface Scoreboard {

    boolean addPlayerToTeam(String var0, String var1);

    ScoreObjective addScoreObjective(String var0, IScoreObjectiveCriteria var1);

    void broadcastTeamCreated(ScorePlayerTeam var0);

    ScorePlayerTeam createTeam(String var0);

    boolean entityHasObjective(String var0, ScoreObjective var1);

    void func_178820_a(String var0, ScoreObjective var1);

    void func_181140_a(Entity var0);

    void func_96513_c(ScorePlayerTeam var0);

    void func_96516_a(String var0);

    void func_96536_a(Score var0);

    String[] getDisplaySlotStrings();

    ScoreObjective getObjective(String var0);

    String getObjectiveDisplaySlot(int var0);

    int getObjectiveDisplaySlotNumber(String var0);

    ScoreObjective getObjectiveInDisplaySlot(int var0);

    Collection getObjectiveNames();

    Map getObjectivesForEntity(String var0);

    Collection getObjectivesFromCriteria(IScoreObjectiveCriteria var0);

    ScorePlayerTeam getPlayersTeam(String var0);

    Collection getScoreObjectives();

    Collection getScores();

    Collection getSortedScores(ScoreObjective var0);

    ScorePlayerTeam getTeam(String var0);

    Collection getTeamNames();

    Collection getTeams();

    Score getValueFromObjective(String var0, ScoreObjective var1);

    void onObjectiveDisplayNameChanged(ScoreObjective var0);

    void onScoreObjectiveAdded(ScoreObjective var0);

    void onScoreObjectiveRemoved(ScoreObjective var0);

    void removeObjective(ScoreObjective var0);

    void removeObjectiveFromEntity(String var0, ScoreObjective var1);

    void removePlayerFromTeam(String var0, ScorePlayerTeam var1);

    boolean removePlayerFromTeams(String var0);

    void removeTeam(ScorePlayerTeam var0);

    void sendTeamUpdate(ScorePlayerTeam var0);

    void setObjectiveInDisplaySlot(int var0, ScoreObjective var1);

}
