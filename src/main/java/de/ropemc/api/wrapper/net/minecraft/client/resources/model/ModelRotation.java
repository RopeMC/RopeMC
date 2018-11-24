package de.ropemc.api.wrapper.net.minecraft.client.resources.model;

//import org.lwjgl.util.vector.Matrix4f;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.model.ModelRotation")
public interface ModelRotation {

    int combineXY(int var0, int var1);

    //Matrix4f getMatrix4d();

    ModelRotation getModelRotation(int var0, int var1);

    EnumFacing rotateFace(EnumFacing var0);

    int rotateVertex(EnumFacing var0, int var1);

}
