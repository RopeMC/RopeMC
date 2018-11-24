package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityCaveSpider")
public interface EntityCaveSpider {

    void applyEntityAttributes();

    boolean attackEntityAsMob(Entity var0);

    float getEyeHeight();

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

}
