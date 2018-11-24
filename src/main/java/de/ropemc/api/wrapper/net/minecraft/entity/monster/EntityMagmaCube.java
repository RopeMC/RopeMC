package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.util.EnumParticleTypes;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityMagmaCube")
public interface EntityMagmaCube {

    void alterSquishAmount();

    void applyEntityAttributes();

    boolean canDamagePlayer();

    EntitySlime createInstance();

    void dropFewItems(boolean var0, int var1);

    void fall(float var0, float var1);

    int getAttackStrength();

    float getBrightness(float var0);

    int getBrightnessForRender(float var0);

    boolean getCanSpawnHere();

    Item getDropItem();

    int getJumpDelay();

    String getJumpSound();

    EnumParticleTypes getParticleType();

    int getTotalArmorValue();

    void handleJumpLava();

    boolean isBurning();

    boolean isNotColliding();

    void jump();

    boolean makesSoundOnLand();

}
