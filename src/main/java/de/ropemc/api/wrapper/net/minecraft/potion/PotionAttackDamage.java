package de.ropemc.api.wrapper.net.minecraft.potion;

import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.AttributeModifier;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.potion.PotionAttackDamage")
public interface PotionAttackDamage {

    double getAttributeModifierAmount(int var0, AttributeModifier var1);

}
