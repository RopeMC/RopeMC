package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.vertex.VertexBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.VertexBufferUploader")
public interface VertexBufferUploader {

    void func_181679_a(WorldRenderer var0);

    void setVertexBuffer(VertexBuffer var0);

}
