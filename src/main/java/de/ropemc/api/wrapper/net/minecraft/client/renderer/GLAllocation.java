package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.GLAllocation")
public interface GLAllocation {

    ByteBuffer createDirectByteBuffer(int var0);

    FloatBuffer createDirectFloatBuffer(int var0);

    IntBuffer createDirectIntBuffer(int var0);

    void deleteDisplayLists(int var0);

    void deleteDisplayLists(int var0, int var1);

    int generateDisplayLists(int var0);

}
