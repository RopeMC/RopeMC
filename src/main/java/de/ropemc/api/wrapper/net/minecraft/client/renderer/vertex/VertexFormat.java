package de.ropemc.api.wrapper.net.minecraft.client.renderer.vertex;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.vertex.VertexFormat")
public interface VertexFormat {

    VertexFormat addElement(VertexFormatElement var0);

    void clear();

    int func_181719_f();

    int func_181720_d(int var0);

    int getColorOffset();

    VertexFormatElement getElement(int var0);

    int getElementCount();

    List getElements();

    int getNextOffset();

    int getNormalOffset();

    int getUvOffsetById(int var0);

    boolean hasColor();

    boolean hasNormal();

    boolean hasPosition();

    boolean hasUvOffset(int var0);

}
