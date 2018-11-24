package de.ropemc.api.wrapper.net.minecraft.network;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.NettyCompressionDecoder")
public interface NettyCompressionDecoder {

    void setCompressionTreshold(int var0);

}
