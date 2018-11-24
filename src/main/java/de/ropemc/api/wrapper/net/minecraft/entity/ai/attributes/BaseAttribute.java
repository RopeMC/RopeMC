package de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.attributes.BaseAttribute")
public interface BaseAttribute {

    IAttribute func_180372_d();

    String getAttributeUnlocalizedName();

    double getDefaultValue();

    boolean getShouldWatch();

    BaseAttribute setShouldWatch(boolean var0);

}
