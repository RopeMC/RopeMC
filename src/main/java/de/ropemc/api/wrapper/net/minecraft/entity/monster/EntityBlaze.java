package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityBlaze")
public interface EntityBlaze {

    void applyEntityAttributes();

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    void fall(float var0, float var1);

    boolean func_70845_n();

    float getBrightness(float var0);

    int getBrightnessForRender(float var0);

    String getDeathSound();

    Item getDropItem();

    String getHurtSound();

    String getLivingSound();

    boolean isBurning();

    boolean isValidLightLevel();

    void onLivingUpdate();

    void setOnFire(boolean var0);

    void updateAITasks();

}
