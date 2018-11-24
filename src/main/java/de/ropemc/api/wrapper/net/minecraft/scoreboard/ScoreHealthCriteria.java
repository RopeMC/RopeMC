package de.ropemc.api.wrapper.net.minecraft.scoreboard;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.scoreboard.ScoreHealthCriteria")
public interface ScoreHealthCriteria {

    int func_96635_a(List var0);

    //IScoreObjectiveCriteria$EnumRenderType getRenderType();

    boolean isReadOnly();

}
