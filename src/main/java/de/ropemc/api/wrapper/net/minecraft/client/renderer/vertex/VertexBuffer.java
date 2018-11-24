package de.ropemc.api.wrapper.net.minecraft.client.renderer.vertex;

import java.nio.ByteBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.vertex.VertexBuffer")
public interface VertexBuffer {

    void bindBuffer();

    void deleteGlBuffers();

    void drawArrays(int var0);

    void func_181722_a(ByteBuffer var0);

    void unbindBuffer();

}
