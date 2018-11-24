package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureAttribute;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntitySilverfish")
public interface EntitySilverfish {

    void applyEntityAttributes();

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canTriggerWalking();

    float getBlockPathWeight(BlockPos var0);

    boolean getCanSpawnHere();

    EnumCreatureAttribute getCreatureAttribute();

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    String getHurtSound();

    String getLivingSound();

    double getYOffset();

    boolean isValidLightLevel();

    void onUpdate();

    void playStepSound(BlockPos var0, Block var1);

}
