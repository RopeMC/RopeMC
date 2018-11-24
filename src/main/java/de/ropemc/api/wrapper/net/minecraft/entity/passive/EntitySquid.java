package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntitySquid")
public interface EntitySquid {

    //boolean access$000(EntitySquid var0);

    void applyEntityAttributes();

    boolean canTriggerWalking();

    void dropFewItems(boolean var0, int var1);

    boolean func_175567_n();

    void func_175568_b(float var0, float var1, float var2);

    boolean getCanSpawnHere();

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    String getHurtSound();

    String getLivingSound();

    float getSoundVolume();

    void handleStatusUpdate(byte var0);

    boolean isInWater();

    void moveEntityWithHeading(float var0, float var1);

    void onLivingUpdate();

}
