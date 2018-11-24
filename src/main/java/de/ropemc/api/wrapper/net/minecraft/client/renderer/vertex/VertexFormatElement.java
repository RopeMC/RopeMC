package de.ropemc.api.wrapper.net.minecraft.client.renderer.vertex;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.vertex.VertexFormatElement")
public interface VertexFormatElement {

    //boolean func_177372_a(int var0, VertexFormatElement$EnumUsage var1);

    int getElementCount();

    int getIndex();

    int getSize();

    //VertexFormatElement$EnumType getType();

    //VertexFormatElement$EnumUsage getUsage();

    boolean isPositionElement();

}
