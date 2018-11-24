package de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.attributes.IAttribute")
public interface IAttribute {

    double clampValue(double var0);

    IAttribute func_180372_d();

    String getAttributeUnlocalizedName();

    double getDefaultValue();

    boolean getShouldWatch();

}
