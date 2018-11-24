package de.ropemc.api.wrapper.net.minecraft.client.stream;

//import org.apache.logging.log4j.Logger;
//import tv.twitch.ErrorCode;
//import tv.twitch.broadcast.StreamInfo;
//import tv.twitch.broadcast.IngestList;
//import tv.twitch.broadcast.GameInfo;
//import tv.twitch.AuthToken;
//import tv.twitch.broadcast.IngestServer;
//import tv.twitch.chat.ChatUserInfo;
//import tv.twitch.chat.ChatTokenizedMessage;
//import tv.twitch.chat.ChatRawMessage;
import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.stream.TwitchStream")
public interface TwitchStream {

    //Logger access$000();

    //BroadcastController access$100(TwitchStream var0);

    //ChatController access$200(TwitchStream var0);

    //IStream$AuthFailureReason access$302(TwitchStream var0, IStream$AuthFailureReason var1);

    float formatStreamBps(float var0);

    int formatStreamFps(float var0);

    int formatStreamKbps(float var0);

    //void func_152891_a(BroadcastController$BroadcastState var0);

    //void func_152892_c(ErrorCode var0);

    //void func_152893_b(ErrorCode var0);

    //void func_152894_a(StreamInfo var0);

    void func_152895_a();

    //void func_152896_a(IngestList var0);

    //void func_152897_a(ErrorCode var0);

    //void func_152898_a(ErrorCode var0, GameInfo[] var1);

    void func_152899_b();

    //void func_152900_a(ErrorCode var0, AuthToken var1);

    void func_152901_c();

    //void func_152907_a(IngestServerTester var0, IngestServerTester$IngestTestState var1);

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

    void func_152942_I();

    void func_176016_c(String var0);

    //void func_176017_a(ChatController$ChatState var0);

    //void func_176018_a(String var0, ChatUserInfo[] var1, ChatUserInfo[] var2, ChatUserInfo[] var3);

    void func_176019_a(String var0, String var1);

    void func_176020_d(String var0);

    void func_176021_d();

    //void func_176022_e(ErrorCode var0);

    //void func_176023_d(ErrorCode var0);

    void func_176024_e();

    //void func_176025_a(String var0, ChatTokenizedMessage[] var1);

    void func_176026_a(Metadata var0, long var1, long var2);

    //void func_176027_a(String var0, ChatRawMessage var1);

    boolean func_176028_a(Set var0, Set var1, int var2);

    //void func_180605_a(String var0, ChatRawMessage[] var1);

    void func_180606_a(String var0);

    void func_180607_b(String var0);

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
