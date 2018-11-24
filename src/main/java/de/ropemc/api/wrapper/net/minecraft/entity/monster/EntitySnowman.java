package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntitySnowman")
public interface EntitySnowman {

    void applyEntityAttributes();

    void attackEntityWithRangedAttack(EntityLivingBase var0, float var1);

    void dropFewItems(boolean var0, int var1);

    Item getDropItem();

    float getEyeHeight();

    void onLivingUpdate();

}
