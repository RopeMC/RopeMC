package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.model.BlockPart")
public interface BlockPart {

    float[] getFaceUvs(EnumFacing var0);

    void setDefaultUvs();

}
