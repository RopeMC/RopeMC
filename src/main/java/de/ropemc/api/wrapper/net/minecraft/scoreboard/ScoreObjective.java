package de.ropemc.api.wrapper.net.minecraft.scoreboard;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.scoreboard.ScoreObjective")
public interface ScoreObjective {

    IScoreObjectiveCriteria getCriteria();

    String getDisplayName();

    String getName();

    //IScoreObjectiveCriteria$EnumRenderType getRenderType();

    Scoreboard getScoreboard();

    void setDisplayName(String var0);

    //void setRenderType(IScoreObjectiveCriteria$EnumRenderType var0);

}
