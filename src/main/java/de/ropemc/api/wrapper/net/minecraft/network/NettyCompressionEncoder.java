package de.ropemc.api.wrapper.net.minecraft.network;

//import io.netty.channel.ChannelHandlerContext;
//import io.netty.buffer.ByteBuf;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.NettyCompressionEncoder")
public interface NettyCompressionEncoder {

    //void encode(ChannelHandlerContext var0, ByteBuf var1, ByteBuf var2);

    void setCompressionTreshold(int var0);

}
