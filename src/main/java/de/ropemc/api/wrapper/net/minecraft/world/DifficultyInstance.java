package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.DifficultyInstance")
public interface DifficultyInstance {

    float calculateAdditionalDifficulty(EnumDifficulty var0, long var1, long var2, float var3);

    float getAdditionalDifficulty();

    float getClampedAdditionalDifficulty();

}
