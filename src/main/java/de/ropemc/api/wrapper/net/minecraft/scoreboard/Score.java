package de.ropemc.api.wrapper.net.minecraft.scoreboard;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.scoreboard.Score")
public interface Score {

    void decreaseScore(int var0);

    void func_96648_a();

    void func_96651_a(List var0);

    ScoreObjective getObjective();

    String getPlayerName();

    int getScorePoints();

    Scoreboard getScoreScoreboard();

    void increseScore(int var0);

    boolean isLocked();

    void setLocked(boolean var0);

    void setScorePoints(int var0);

}
