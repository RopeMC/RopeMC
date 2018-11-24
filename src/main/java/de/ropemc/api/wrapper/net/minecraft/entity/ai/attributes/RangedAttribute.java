package de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.attributes.RangedAttribute")
public interface RangedAttribute {

    double clampValue(double var0);

    String getDescription();

    RangedAttribute setDescription(String var0);

}
