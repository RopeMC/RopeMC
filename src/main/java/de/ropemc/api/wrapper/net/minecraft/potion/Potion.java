package de.ropemc.api.wrapper.net.minecraft.potion;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.BaseAttributeMap;
import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.AttributeModifier;
import java.util.Map;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.IAttribute;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.potion.Potion")
public interface Potion {

    void affectEntity(Entity var0, Entity var1, EntityLivingBase var2, int var3, double var4);

    void applyAttributesModifiersToEntity(EntityLivingBase var0, BaseAttributeMap var1, int var2);

    Set func_181168_c();

    double getAttributeModifierAmount(int var0, AttributeModifier var1);

    Map getAttributeModifierMap();

    String getDurationString(PotionEffect var0);

    double getEffectiveness();

    int getId();

    int getLiquidColor();

    String getName();

    Potion getPotionFromResourceLocation(String var0);

    int getStatusIconIndex();

    boolean hasStatusIcon();

    boolean isBadEffect();

    boolean isInstant();

    boolean isReady(int var0, int var1);

    boolean isUsable();

    void performEffect(EntityLivingBase var0, int var1);

    Potion registerPotionAttributeModifier(IAttribute var0, String var1, double var2, int var3);

    void removeAttributesModifiersFromEntity(EntityLivingBase var0, BaseAttributeMap var1, int var2);

    Potion setEffectiveness(double var0);

    Potion setIconIndex(int var0, int var1);

    Potion setPotionName(String var0);

}
