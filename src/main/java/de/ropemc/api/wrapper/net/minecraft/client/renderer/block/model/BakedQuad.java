package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.model.BakedQuad")
public interface BakedQuad {

    EnumFacing getFace();

    int getTintIndex();

    int[] getVertexData();

    boolean hasTintIndex();

}
