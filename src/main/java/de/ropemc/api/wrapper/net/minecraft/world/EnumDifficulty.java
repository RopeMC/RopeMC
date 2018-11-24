package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.EnumDifficulty")
public interface EnumDifficulty {

    EnumDifficulty getDifficultyEnum(int var0);

    int getDifficultyId();

    String getDifficultyResourceKey();

}
