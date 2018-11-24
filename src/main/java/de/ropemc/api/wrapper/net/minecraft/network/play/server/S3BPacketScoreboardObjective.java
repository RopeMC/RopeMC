package de.ropemc.api.wrapper.net.minecraft.network.play.server;

//import de.ropemc.api.wrapper.net.minecraft.scoreboard.IScoreObjectiveCriteria$EnumRenderType;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S3BPacketScoreboardObjective")
public interface S3BPacketScoreboardObjective {

    String func_149337_d();

    int func_149338_e();

    String func_149339_c();

    //IScoreObjectiveCriteria$EnumRenderType func_179817_d();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
