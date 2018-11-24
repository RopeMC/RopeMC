package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Collection;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.WeightedRandom")
public interface WeightedRandom {

    //WeightedRandom$Item getRandomItem(Collection var0, int var1);

    //WeightedRandom$Item getRandomItem(Random var0, Collection var1);

    //WeightedRandom$Item getRandomItem(Random var0, Collection var1, int var2);

    int getTotalWeight(Collection var0);

}
