package de.ropemc.api.wrapper.net.minecraft.stats;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.IScoreObjectiveCriteria;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.stats.StatBase")
public interface StatBase {

    //NumberFormat access$000();

    //DecimalFormat access$100();

    String format(int var0);

    IScoreObjectiveCriteria func_150952_k();

    StatBase func_150953_b(Class var0);

    Class func_150954_l();

    IChatComponent func_150955_j();

    IChatComponent getStatName();

    StatBase initIndependentStat();

    boolean isAchievement();

    StatBase registerStat();

}
