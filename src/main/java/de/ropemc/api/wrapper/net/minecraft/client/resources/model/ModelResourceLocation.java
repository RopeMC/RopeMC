package de.ropemc.api.wrapper.net.minecraft.client.resources.model;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.model.ModelResourceLocation")
public interface ModelResourceLocation {

    String getVariant();

    String[] parsePathString(String var0);

}
