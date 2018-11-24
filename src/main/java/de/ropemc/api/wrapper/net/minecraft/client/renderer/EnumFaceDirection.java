package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.EnumFaceDirection")
public interface EnumFaceDirection {

    //EnumFaceDirection$VertexInformation func_179025_a(int var0);

    EnumFaceDirection getFacing(EnumFacing var0);

}
