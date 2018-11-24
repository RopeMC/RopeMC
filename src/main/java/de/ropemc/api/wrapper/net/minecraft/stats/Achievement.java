package de.ropemc.api.wrapper.net.minecraft.stats;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.stats.Achievement")
public interface Achievement {

    Achievement func_150953_b(Class var0);

    String getDescription();

    boolean getSpecial();

    IChatComponent getStatName();

    Achievement initIndependentStat();

    boolean isAchievement();

    Achievement registerStat();

    Achievement setSpecial();

    Achievement setStatStringFormatter(IStatStringFormat var0);

}
