package de.ropemc.api.wrapper.net.minecraft.network;

//import io.netty.channel.Channel;
//import io.netty.channel.ChannelHandlerContext;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
//import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.SecretKey;
import java.net.InetAddress;
import java.net.SocketAddress;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.NetworkManager")
public interface NetworkManager {

    //Channel access$000(NetworkManager var0);

    //void channelRead0(ChannelHandlerContext var0, Packet var1);

    void checkDisconnected();

    //void closeChannel(IChatComponent var0);

    void disableAutoRead();

    //void dispatchPacket(Packet var0, GenericFutureListener[] var1);

    void enableEncryption(SecretKey var0);

    void flushOutboundQueue();

    NetworkManager func_181124_a(InetAddress var0, int var1, boolean var2);

    IChatComponent getExitMessage();

    boolean getIsencrypted();

    INetHandler getNetHandler();

    SocketAddress getRemoteAddress();

    //boolean hasNoChannel();

    //boolean isChannelOpen();

    //boolean isLocalChannel();

    void processReceivedPackets();

    NetworkManager provideLocalClient(SocketAddress var0);

    void sendPacket(Packet var0);

    //void sendPacket(Packet var0, GenericFutureListener var1, GenericFutureListener[] var2);

    void setCompressionTreshold(int var0);

    void setConnectionState(EnumConnectionState var0);

    void setNetHandler(INetHandler var0);

}
