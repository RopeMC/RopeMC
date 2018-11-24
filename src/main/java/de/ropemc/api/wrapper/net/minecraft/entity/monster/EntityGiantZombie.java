package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityGiantZombie")
public interface EntityGiantZombie {

    void applyEntityAttributes();

    float getBlockPathWeight(BlockPos var0);

    float getEyeHeight();

}
