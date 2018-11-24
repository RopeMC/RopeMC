package de.ropemc.api.wrapper.net.minecraft.client.stream;

//import tv.twitch.ErrorCode;
//import tv.twitch.broadcast.IngestServer;
//import tv.twitch.chat.ChatUserInfo;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.stream.NullStream")
public interface NullStream {

    boolean func_152908_z();

    void func_152909_x();

    void func_152911_a(Metadata var0, long var1);

    //ErrorCode func_152912_E();

    boolean func_152913_F();

    void func_152917_b(String var0);

    //IStream$AuthFailureReason func_152918_H();

    int func_152920_A();

    String func_152921_C();

    void func_152922_k();

    //IngestServer[] func_152925_v();

    //ChatUserInfo func_152926_a(String var0);

    boolean func_152927_B();

    boolean func_152928_D();

    boolean func_152929_G();

    void func_152930_t();

    IngestServerTester func_152932_y();

    void func_152935_j();

    boolean func_152936_l();

    Throwable func_152937_a();

    void func_176026_a(Metadata var0, long var1, long var2);

    boolean isBroadcasting();

    boolean isPaused();

    boolean isReadyToBroadcast();

    void muteMicrophone(boolean var0);

    void pause();

    void requestCommercial();

    void shutdownStream();

    void stopBroadcasting();

    void unpause();

    void updateStreamVolume();

}
