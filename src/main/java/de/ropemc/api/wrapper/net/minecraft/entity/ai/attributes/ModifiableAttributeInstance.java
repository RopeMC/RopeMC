package de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes;

import java.util.Collection;
import java.util.UUID;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.attributes.ModifiableAttributeInstance")
public interface ModifiableAttributeInstance {

    void applyModifier(AttributeModifier var0);

    double computeValue();

    void flagForUpdate();

    Collection func_111122_c();

    Collection func_180375_b(int var0);

    IAttribute getAttribute();

    double getAttributeValue();

    double getBaseValue();

    AttributeModifier getModifier(UUID var0);

    Collection getModifiersByOperation(int var0);

    boolean hasModifier(AttributeModifier var0);

    void removeAllModifiers();

    void removeModifier(AttributeModifier var0);

    void setBaseValue(double var0);

}
