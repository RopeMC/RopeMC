package de.ropemc.api.wrapper.net.minecraft.potion;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.BaseAttributeMap;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.potion.PotionHealthBoost")
public interface PotionHealthBoost {

    void removeAttributesModifiersFromEntity(EntityLivingBase var0, BaseAttributeMap var1, int var2);

}
