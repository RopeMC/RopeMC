package de.ropemc.api.wrapper.net.minecraft.network.play.server;

import java.util.Collection;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.server.S3EPacketTeams")
public interface S3EPacketTeams {

    String func_149306_d();

    int func_149307_h();

    int func_149308_i();

    String func_149309_f();

    Collection func_149310_g();

    String func_149311_e();

    String func_149312_c();

    int func_179813_h();

    String func_179814_i();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
